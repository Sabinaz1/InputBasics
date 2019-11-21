package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		System.out.println("Please enter your name: ");
		Scanner str = new Scanner(System.in);
		String name;
		name = str.nextLine();
		System.out.print("My name is " + name);
    }
}
