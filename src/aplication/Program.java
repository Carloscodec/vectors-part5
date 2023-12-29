package aplication;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = input.nextInt();
		Rent[] rent = new Rent[10];
		
		for (int i = 1; i <= n; i ++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Email: ");
			String email = input.nextLine();
			System.out.print("Room: ");
			int roomNumber = input.nextInt();
			
			rent [roomNumber]= new Rent(name, email, roomNumber);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (rent[i] != null) {
				System.out.println(rent[i]);
			}
		}
		
		input.close();
	}

}
