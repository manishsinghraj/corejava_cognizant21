/**
*Name: Manish Singh
*Description: Traffic light choice
*Date: 3/14/2021
**/
import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Choice\n 1)Red\n 2)yellow\n 3)green\n");
		String choice = sc.next();
		switch(choice) {
		  case "1":
		    System.out.println("Stop");
		    break;
		  case "2":
		    System.out.println("Ready");
		    break;
		  case "3":
			    System.out.println("Go");
			break;
		  
		}

	}
}

