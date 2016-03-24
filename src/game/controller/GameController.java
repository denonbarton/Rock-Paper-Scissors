package game.controller;

import java.util.Random;
import java.util.Scanner;

public class GameController
{
	public static void main(String args[])
	{
		
		Scanner wantToPlay = new Scanner(System.in);
		String userResponse;
		String userResponseAnswer;
		
		System.out.println(" Do you want to play Rock Paper Scissors(y/n)?");
		userResponse = wantToPlay.next();
		
		if(userResponse.equals("y"))
		{
			userResponse = "Okay lets play";
		}
		else
		{
			System.exit(0);
		}
		
		System.out.println("Rock(1) Paper(2) or Scissors(3)? : ");
		
		String userAnswer = null;
		String answer;
		Random botRandom = new Random();
		
		Scanner gameInput = new Scanner(System.in);

		System.out.println("Rock(1) Paper(2) or Scissors(3)? : ");
		answer = gameInput.next();
		
		
		
		System.out.println("Rock(1) Paper(2) or Scissors(3)? : ");
		answer = gameInput.next();

		if (answer.equals("1"))
		{
			userAnswer = "Rock";
		}
		else if (answer.equals("2"))
		{
			userAnswer = "Paper";
		}
		else if (answer.equals("3"))
		{
			userAnswer = "scissors";
		}
		else
		{
			System.out.println("Please pick again");
		}
				
		System.out.println("you picked " + userAnswer);
}

	

	public void start()
	{
		// TODO Auto-generated method stub

	}
}
