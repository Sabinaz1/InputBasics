package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		System.out.println("Please enter your name: ");
		Scanner str = new Scanner(System.in);
		String name;
		name = str.nextLine();
		System.out.println("Please enter your age: ");
		Integer age;
		age = str.nextInt();
		System.out.println("My name is " + name + ", and I am " + age + " years old");
    }

}
