package com.company;

/*

1225 Посетители
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».
Замечание:
постарайся определять тип животного как можно более точно.

Требования:
1. Класс Solution должен содержать классы Cat, Tiger, Lion, Bull, Cow, Animal.
2. Класс Solution должен содержать метод String getObjectType(Object o).
3. Метод getObjectType() должен возвращать строку «Кот» если передан объект типа Cat.
4. Метод getObjectType() должен возвращать строку «Тигр» если передан объект типа Tiger.
5. Метод getObjectType() должен возвращать строку «Лев» если передан объект типа Lion.
6. Метод getObjectType() должен возвращать строку «Бык» если передан объект типа Bull.
7. Метод getObjectType() должен возвращать строку «Животное» если передан объект типа Animal.
8. Программа должна выводить на экран результат метода getObjectType().



 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Tiger) {
            return "Тигр";
        } else if (o instanceof Lion) {
            return "Лев";
        } else if (o instanceof Cat) {
            return "Кот";
        } else if (o instanceof Bull) {
            return "Бык";
        } else if (o instanceof Cow) {
            return "Корова";
        }

        return "Животное";
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}


