package day3;

import java.util.Random;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {
	
	static Random rnd = new Random();
	
	static String[] words = new String[] {"Marmalade","Umbridge","Arduous","Supercalifragilistic-expialodocious"};

	public static void main(String[] args) {
		
		while(true) {
		int rand = rnd.nextInt(4);
			// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
			speak("Spell " + words[rand]);
			// 2. Catch the user's answer in a String
			String spell = JOptionPane.showInputDialog("Spell it:");
			// 3. If the user spelled the word correctly, speak "correct"
			if(spell.equals(words[rand])) {
				speak("Correct!");
			}
			else {
				speak("Incorrect!");
			}
		}
		
	}

	static void speak(String words) {
		Voice voice = VoiceManager.getInstance().getVoice("kevin16");
		voice.allocate();
		voice.speak(words);
		voice.deallocate();
	}
}


