package com.peter.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NioDemo {
    public static void main(String[] args) throws IOException {

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(new InetSocketAddress(8888));

        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        while (true) {
            int selected = selector.select();
            if (selected == 0) {
                continue;
            }

            Set<SelectionKey> selectedKeys = selector.selectedKeys();
            Iterator<SelectionKey> keyIterator = selectedKeys.iterator();
            while (keyIterator.hasNext()) {
                SelectionKey key = keyIterator.next();
                if (key.isAcceptable()) {
                    ServerSocketChannel channel = (ServerSocketChannel) key.channel();
                    SocketChannel clientChanel = channel.accept();

                    clientChanel.configureBlocking(false);
                    clientChanel.register(selector, SelectionKey.OP_READ);


                }

                if (key.isReadable()) {
                    SocketChannel socketChannel = (SocketChannel) key.channel();
                    socketChannel.read(byteBuffer);
                    String request = new String(byteBuffer.array().toString());
                    byteBuffer.clear();
                    String response = request;
                    socketChannel.write(ByteBuffer.wrap(response.getBytes()));
                }
            }
        }


    }
}
