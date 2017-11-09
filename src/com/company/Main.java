package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	// write your code here
        pilas p = new pilas();


        p.push(8);
        p.push(5);
        p.push(4);


        p.peek();
        p.cima();
        p.pop();
        p.peek();
        p.pop();
        p.cima();
        p.pop();
        p.peek();
    }
}
