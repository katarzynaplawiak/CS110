package assignment.chap3;

import java.util.Scanner;

public class PE317 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		 int userChoice = input.nextInt();
		 String userChoiceString="";
		 
		 switch (userChoice) {
		 case 0 : userChoiceString  = "scissor"; break;
		 case 1 : userChoiceString = "rock"; break;
		 case 2 : userChoiceString = "paper"; break; 
		 }
		 int computerRandomChoice = (int)(Math.random() * 3);
		 String computerChoiceString = "";
		 switch (computerRandomChoice){
		 case 0 : computerChoiceString = "scissor"; break;
		 case 1 : computerChoiceString = "rock"; break;
		 case 2 : computerChoiceString = "paper"; break;
		 }
		 
		if (userChoice == computerRandomChoice){
			System.out.printf("The computer is %s. You are %s too. It is a draw",userChoiceString, userChoiceString );
		}
		else if ((userChoice==0 && computerRandomChoice==2) || (userChoice==1 && computerRandomChoice==0) || (userChoice==2 && computerRandomChoice==1)){
			System.out.printf("The computer is %s. You are %s. You won",computerChoiceString, userChoiceString );
		}
		else
		{
			System.out.printf("The computer is %s. You are %s. You loose", computerChoiceString, userChoiceString);

		}
	}
		

	}


