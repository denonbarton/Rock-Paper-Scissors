package game.controller;

import java.util.Scanner;
import java.math.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class GameController 
{
	public static void main(String args[])
	{
		Scanner gameInput = new Scanner(System.in);
		String answer;
		double random;
		String botPick;
		String cpuAnswer;
		int i;

		System.out.println("lets play Rock Paper Scissors");
		System.out.println("(Rock) (Paper) or (Scissors)? : ");
		answer = gameInput.next();
		
		
//		for( i = 0; i < 5; i++)
//		{
//			if(answer != "Rock" || answer != "Scissors" || answer != "Paper")
//			{
//				System.out.println("Please try again the options are (Rock) (Paper) or (Scissors). : ");
//				answer = gameInput.next();
//				
//			}
//			else
//			{
//				i = 6;
//			}
//		}
//		
		
		
		System.out.println("You picked " + answer);
		random = Math.random();
		//System.out.println(random);
		
		if(random <= .33)
		{
			 cpuAnswer = "Paper";
		}
		else if (random >= .34 && random <= .66)
		{
			cpuAnswer = "Scissors";
		}
		else
		{
			cpuAnswer = "Rock";
		}
		
		System.out.println("The computer Picked " + cpuAnswer);

		if(answer.equals("Paper"))
		{
			if(cpuAnswer.equals("Paper"))
			{
				System.out.println("Looks like its a tie!");
			}
			else if(cpuAnswer.equals("Scissors"))
			{
				System.out.println("Ouch, you lost");
			}
			else
			{
				System.out.println("Nice job, you won!");
			}
		}
		else if(answer.equals("Scissors"))
		{
			if(cpuAnswer.equals("Paper"))
			{
				System.out.println("Nice job, you won!");
			}
			else if(cpuAnswer.equals("Scissors"))
			{
				System.out.println("Looks like its a tie!");
			}
			else
			{
				System.out.println("Ouch, you lost");
			}
		}
		else //(answer.equals("Rock"))
		{
			if(cpuAnswer.equals("Paper"))
			{
				System.out.println("Ouch, you lost");
			}
			else if(cpuAnswer.equals("Scissors"))
			{
				System.out.println("Nice job, you won!");
			}
			else
			{
				System.out.println("Looks like its a tie!");
			}
		}

	}


	public void start()
	{
		// TODO Auto-generated method stub

	}
}