/**
	* Lesson: Input
	* Author: Visaagan Gunabalachandran
	* Date Created: February 9, 2023
	* Date Last Modified: February 9, 2023
	*/
import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input  = new Scanner(System.in);
		String name;
		System.out.print("What is your name: ");
		name = input.nextLine();
		System.out.println(name);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Input a whole number: ");
		num = input.nextInt();
		System.out.println(num * 2 + 2);
		
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		double radius;
		System.out.print("Input a radius: ");
		radius = input.nextDouble();
		System.out.println(2 * 3.14 * radius);
		System.out.println(3.14 * radius * radius);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		String name;
		String surname;
		int age;

		System.out.print("Input a first name: Input a last name: Input an age: ");
		name = input.nextLine();
		surname = input.nextLine();
		age = input.nextInt();

		System.out.println(surname + ", " + name + " - " + age);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		int iq;

		System.out.print("Input a name: ");
		System.out.print("Input an age: ");
		name = input.nextLine();
		age = input.nextInt();
		iq = age;
		age = age + 3;

		System.out.print(name);
		System.out.println(age);
		System.out.println(iq);

		





	}

}
