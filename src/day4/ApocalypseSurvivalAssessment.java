package day4;

import javax.swing.JOptionPane;

public class ApocalypseSurvivalAssessment {
	
	static String[][] questions = new String[][] {
		{"the longest time you've spent camping/outdoors?","Less than 1 day","2-3 days","4-6 days","7+ days"},
		{"the manner of the outdoors-ing?","Hike","Glamp","Camp","Backpacking"},
		{"your first aid experience?","none","basics class","professional class","[don't click here]"},
		{"hunting/gathering experience?","never did it","know how to do it","have done it","do it a lot"},
		{"optimal group of survivors?","1-2","3-10","10-30","30+"},
		{"a place you would shelter in?","urban area","rural area","evacuation zone / military installation","wilderness"},
	};
	
	static int[][] scores = new int[][] {
		{1,3,5,10},
		{0,1,5,10},
		{1,5,10,0},
		{0,1,7,10},
		{5,7,5,0},
		{0,5,2,5},
	};
	
	static String query(int question) {
		String answer = JOptionPane.showInputDialog(question + ". What is " + questions[question - 1][0] + "\n" + "A. " + questions[question - 1][1] + "\n" + "B. " + questions[question - 1][2] + "\n" + "C. " + questions[question - 1][3] + "\n" + "D. " + questions[question - 1][4] + "\n");
		return answer;
	}
	
	static int answerNumeric(String alpha, int question) {
		
		int num;
		
		if(alpha.equals("a") || alpha.equals("A")) {
			num = 1;
		}
		if(alpha.equals("b") || alpha.equals("B")) {
			num = 2;
		}
		if(alpha.equals("c") || alpha.equals("C")) {
			num = 3;
		}
		if(alpha.equals("d") || alpha.equals("D")) {
			num = 4;
		}
		else {
			return 0;
		}
		
		int score = scores[question][num - 1];
		
		return score;
	}
	
	public static void main(String[] args) {
		String[] answers = new String[6];
		int score = 0;
		
		for(int i = 0; i < 6; i++) {
			answers[i] = query(i + 1);
			score = score + answerNumeric(answers[i],i);
		}
		JOptionPane.showMessageDialog(null, "You scored:" + score);
	}
}
