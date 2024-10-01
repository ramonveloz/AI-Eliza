import java.util.Random;
public class PromptBank {

	private String [] questions;
	private String [] statements;
	
	public PromptBank(){
		questions = new String[ 5]; //initialize your array to the correct length to match your number of questions you populate it with
		statements = new String[5];//initialize your array to the correct length to match your number of questions you populate it with
		
	}

	public void populateStatementsArray(String BLANK1, String BLANK2){
		statements[0] = "Tell me more about " + BLANK1 + " and " + BLANK2 + ".";
		statements[1] = BLANK1 + " seems important to you, so does " + BLANK2 + ". Please tell me more.";
		statements[2] = BLANK1+ " and " + BLANK2 + " seem to be on your mind. Let's talk about it.";
		statements[3] = BLANK1 + " sounds fun, so does " + BLANK2 + ".";
		statements[4] = BLANK1 + " is special and so does " + BLANK2 + "."; 
		/*complete this method with your other statements using BLANK1 for word1
		 * and BLANK2 for word2 place holder 
		 */
	}
	public void populateQuestionsArray(String BLANK1, String BLANK2){
		questions[0] = "Is there anything else about " +  BLANK1 + " and " + BLANK2 + "?";
		questions[1] = "Does " + BLANK1 + " bother you? How about " + BLANK2 + "?";
		questions[2] = "Are " + BLANK1 + " and " + BLANK2 + " things you think about often?";
		questions[3] = "Is " + BLANK1 + " and "	+ BLANK2 + " hurting you?";
		questions[4] = "How does thinking about " + BLANK1 + " and " + BLANK2 + "affect you?";
		/*complete this method with your other questions using BLANK1 for word1
		 * and BLANK2 for word2 place holder 
		 */
		
	}
	  
	public String getRandomStatementTrunk(){
		Random randGen = new Random();
		int random = randGen.nextInt(5);
		
		return statements[random];
	}
	
	
	public String getRandomQuestionTrunk(){
		Random randGen = new Random();
		int random = randGen.nextInt(5);
		
		return questions[random];
	}
	
	
	
}
