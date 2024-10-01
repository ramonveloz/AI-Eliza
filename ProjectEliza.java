//https://www.youtube.com/watch?v=Ic5nxy6deBE

import java.util.Scanner;

public class ProjectEliza {

	static Scanner keyboard = new Scanner(System.in);
	public static void main (String [] args) {
	      String name;
	      String answer;
	      
	      System.out.println("Hello, my name is Eliza. What is your name?");
	      name = keyboard.next();
	      System.out.println("Hello, " + name + ". Tell me what is on your mind today in 1 sentence.");
	      for(int j = 1; j > 0; j++) { 
	    	  answer = keyboard.nextLine();
	    	  if(j == 1) {
	    		  answer = keyboard.nextLine();
	    	  }
	    	  if(answer.equalsIgnoreCase("EXIT")) {
	    			break;
	    		}
	    			String w1 = w1(answer);
	    		
	    		 String w2 = w2(answer);
	    		 char c = ' ';
	    		 
	    		 for(int i = answer.length() - 1; i >= 0; i--) {
	    			 if(i == answer.length() - 1) {
	    				c = answer.charAt(i);
	    			 }
	    			}
	 	    	 Eliza(w1, w2, c);
	      }
	      System.out.println("Do you want to run the session again?");
	      String decision = keyboard.next();
	      decision.toUpperCase();
	      if(decision.equalsIgnoreCase("YES")) {
	    	  main(args);
	      }
	      else if(decision.equalsIgnoreCase("NO")){
	    	  System.out.println("Goodbye, until next time");
	      }
	}
	public static String w1(String answer) {
		String w1 = "";
		for(int i = 0; i < answer.length(); i++) {
			 
			if(answer.charAt(i) == ' ' || answer.charAt(i) == '!' || answer.charAt(i) == '?' || answer.charAt(i) == '.') {
				 break;
			}
			else  {
				 w1 += answer.charAt(i);
	  }
			
		 }
		return w1;
	}
	public static String w2(String answer) {
		String w2 = "";
		for(int i = answer.length() - 2; i >= 0; i--) {
			 
			if(answer.charAt(i) == ' ' ) {
				 break;
	  }
			else {
				 w2 = answer.charAt(i) + w2;
	  }
			 
		 }
		return w2;
	}
	
	public static void Eliza(String w1, String w2, char c) {
		PromptBank eliza = new PromptBank();
		if(c == '?') {
			eliza.populateQuestionsArray(w1, w2);
			System.out.println(eliza.getRandomQuestionTrunk());
		}
		else if (c == '.') {
			eliza.populateStatementsArray(w1, w2);
			System.out.println(eliza.getRandomStatementTrunk());
		}
		else {
			System.out.print("WOW! Dramatic! ");
			eliza.populateStatementsArray(w1, w2);
			System.out.println(eliza.getRandomStatementTrunk());
		}
		
		
	}
}