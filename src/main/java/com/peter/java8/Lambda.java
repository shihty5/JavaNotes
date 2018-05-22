package com.peter.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Supplier;

interface DefaulableFactory {
    // Interfaces now allow static methods 使用Supplier
    static Functional create(Supplier<Functional> supplier) {
        return supplier.get();
    }
}

public class Lambda {
    public static void main(String[] args) {
        Arrays.asList("a", "b", "d").sort(Comparator.naturalOrder());
        Functional defaultF = DefaulableFactory.create(DefaultableImpl::new);
        Functional overrideF = DefaulableFactory.create(OverridableImpl::new);

        System.out.println(defaultF.defaultMethod());
        System.out.println(overrideF.defaultMethod());
    }
}
