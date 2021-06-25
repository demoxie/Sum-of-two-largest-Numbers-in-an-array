package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> num = new ArrayList<>();
        num.add(3);
        num.add(13);
        num.add(32);
        num.add(31);
        num.add(22);
        Collections.sort(num);
        System.out.println(num);
        System.out.println(num.get(num.size()-1) + num.get(num.size()-2));
    }
}
