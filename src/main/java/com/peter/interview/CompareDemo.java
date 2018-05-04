package com.peter.interview;

import java.util.*;

public class CompareDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Peter", 28));
        personList.add(new Person("Kanna", 26));
        personList.add(new Person("Tom", 34));

        Collections.sort(personList);
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).getName());
        }

        Collections.sort(personList, new PersonComparator());
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).getName());
        }

    }
}

//继承Comparable
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Person o) {
        return this.age - o.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//自己编写任意的比较器，以下为逆序
class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o2.getAge() - o1.getAge();
    }
}
