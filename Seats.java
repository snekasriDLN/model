package com.airline;

import java.util.Scanner;

public class Seats {
int seats[] = {0,0,0,0,0,0,0,0,0,0};
int FirstClassSeat = 0;
int EconomyClassSeat = 5;
int LastSeat = 10;
public void choice() {
	System.out.println("Please type 1 for First Class and Please type 2 for Economy");
}
public void type(int choice) {
	if(choice==1)
	{
		if(FirstClassSeat<5)
		{
			seats[FirstClassSeat]=1;
			System.out.println();
			System.out.println("seat number : "+(FirstClassSeat+1));
			System.out.println("  Class     : The First-Class");
			FirstClassSeat++;
		}
		else
	{
		System.out.println("The seat is not available");
	}
	}
	else
	{
		if(EconomyClassSeat<10)
		{
			
		seats[EconomyClassSeat]=1;
		System.out.println();
		System.out.println("seat number: "+(EconomyClassSeat+1));
		System.out.println("Class       : The Economy-Class");
		EconomyClassSeat++;
		}
		else
		{
			System.out.println("There is no seat available");
			System.out.println("Economy Section is fully booked.Would you like Firstclass? 1 for Yes 2 for No");
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			int option = input.nextInt();
			assignment(option);
		}
	}
}
public boolean check(int number) {
	int i=number;
	if(seats[i*1]==1)
	{
	System.out.println("The seat "+i+" is no longer available.");
	System.out.println();
	return true;
	}
	else
	{
		System.out.println("The seat "+i+" is empty");
		System.out.println();
		return false;
	}
}
public void assignment(int choice) 
{
	if(choice==2) {
		System.out.println("Next flight available in after 3 houre");
	}
	else if(choice==1)
	{
		type(1);
	}
	else
	{
		System.out.println("Please enter your decision");
	}
	}
	public static void main(String args[])
	{
	Seats reservation = new Seats();
	System.out.println("---------Airline Reservation System----------");
	reservation.choice();
	reservation.type(2);
	reservation.check(1);
	reservation.type(2);
	reservation.check(6);
	reservation.type(2);
	reservation.check(2);
	reservation.type(2);
	reservation.check(4);
	reservation.type(2);
	reservation.check(7);
	}
	}

