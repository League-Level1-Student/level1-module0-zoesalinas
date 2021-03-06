package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		// 2. create a variable of type "Component" that will hold your image
Component imageHolder; 
	String imageUrl = "https://i.pinimg.com/originals/01/c9/68/01c968268d20ad50ff6ca8b4423d522e.jpg";

		// 3. use the "createImage()" method below to initialize your Component
imageHolder = createImage(imageUrl);
		// 4. add the image to the quiz window
quizWindow.add(imageHolder);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image.
String input = JOptionPane.showInputDialog("Is this slime?");
		// 7. print "CORRECT" if the user gave the right answer
if(input.equals("no")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "Wrong");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(imageHolder);
		// 10. find another image and create it (might take more than one line
		// of code)
Component imageHolder2;
String imageURL2 = "https://dl1.cbsistatic.com/i/2019/07/27/33dc7d16-3306-42ed-8276-50da3e472160/877ca91adb396d4f91cd624a38589643/imgingest-1039985783481801604.png";  
imageHolder2 = createImage(imageURL2);
		// 11. add the second image to the quiz window
quizWindow.add(imageHolder2);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
