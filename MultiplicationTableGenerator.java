package day6;

import java.util.Scanner;

public class MultiplicationTableGenerator {

	public static void main(String[] args) {
		// 
		Scanner scanner= new Scanner (System.in);
		System.out.println("enter a number to print its multiplication table");
		int number = scanner. nextInt();
		
		System.out.println(" multiplication table " +number+ ":");
		for(int i=1; i<=10;i=i+1)
		{
        int result= number*i;
        System.out.println(number + "x" +i+ "="+result);
	}

	}}
