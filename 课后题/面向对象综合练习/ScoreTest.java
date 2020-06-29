package object;
import java.util.Vector;
import java.util.Scanner;

public class ScoreTest{
    
	public static void main(String[] args) {
	
	System.out.println("please enter score");
	
	Scanner scanner = new Scanner(System.in);
	Vector vector = new Vector();
	
	int max = 0;
	while(true) {
		int score = scanner.nextInt();
		if (score < 0) {
			break;
		} else if (score >= 0 && score <= 100) {
			vector.addElement(score);
			if (score > max) {
				max = score;
			}
		}
	}
	
	char level;
	for (int i = 0; i < vector.size(); i++) {
		//before JDK5.0
		Object obj = vector.elementAt(i);
		//Integer inScore = (Integer)obj;
		//int score = inScore.intValue();
		
		int score = (int)obj;
		
		if(max - score <= 10) {
			level = 'A';
		} else if (max - score <= 20) {
			level = 'B';
		} else if (max - score <= 30) {
			level = 'C';
		} else {
			level = 'D';
		}
		System.out.println("student" + i + " score is " + score
				+ " level is " + level);
	}
	
	    
	    
	}
}	
	
