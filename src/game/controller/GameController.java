package game.controller;

import java.util.Random;
import java.util.Scanner;

public class GameController
{
	public static void main(String args[])
	{
		Scanner gameInput = new Scanner(System.in);
		String answer;
		Random botRandom = new Random();
		String one;
		String two;
		String three;
		
		

		System.out.println("lets play Rock Paper Scissors");
		System.out.println("Rock(one) Paper(two) or Scissors(three)? : ");
		answer = gameInput.next();
		if (answer == "one") answer = "Rock";
		if (answer == "two") answer = "Paper";
		if (answer == "three") answer = "scissors";
		System.out.println("you picked " + answer);
		
		
		
		
	}
	
	public void start()
	{
		// TODO Auto-generated method stub

	}
}
