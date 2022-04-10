package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String>colour=new ArrayList<>(6);
        colour.add("black");
        colour.add("white");
        colour.add("orange");
        colour.add("yellow");
        colour.add("green");
        Collections.sort(colour);
        System.out.println(colour);
        Collections.reverse(colour);
        System.out.println(colour);
        Collections.shuffle(colour);
        System.out.println(colour);
    }
}
