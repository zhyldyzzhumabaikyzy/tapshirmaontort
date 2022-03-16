package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Class class1 = new Class(new int[]{5,8,9,1});
        Class class2 = new Class(new String[] {"it", "myshyk"});
        Class class3 = new Class(new int[]{5,8,9,1});

        System.out.println(class1.getNomer()[2]);
        System.out.println(class2.getSoz()[1]);
        System.out.println(class3.getMassiv()[1]);

    }
}
