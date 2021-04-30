package typewriter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Orig_type_writer {

	public static void main(String[] args) throws InterruptedException{
		//type writer effect
		
		String author = "Jane Doe";
		String title = "\n"
						+ "New Zoo Exhibit"; 
		String date = "\n"
						+ "October 10, 2020";
				
		JTextArea article = new JTextArea();
		JLabel label = new JLabel();
		JPanel panel = new JPanel();
		JFrame type = new JFrame("Home Page");
		
		//frame
		type.add(article);
		type.add(panel);
		type.setFont(new Font("Times New Roman", Font.PLAIN,15)); //sets the font
		type.setForeground(new Color(0xf6c0d0)); //sets the foreground
		type.getContentPane().setBackground(Color.white); //sets the background
		type.setSize(500, 500); //sets the size of the frame
		type.setVisible(true); //sets the frame to be visible
		
		//text area
		article.setPreferredSize(new Dimension(450, 450)); //sets a size of the text area
		article.setFont(new Font("Times New Roman", Font.PLAIN, 12)); //sets the font
		
		//panel
		panel.setBorder(new EmptyBorder(10,10,10,10)); //sets a new empty border with padding of 10
		panel.add(Box.createRigidArea(new Dimension(0,5)));
		panel.setBackground(Color.decode("#869D7A"));
		
		//label
		label.setVerticalTextPosition(JLabel.BOTTOM); //sets vertical text to bottom
		label.setHorizontalTextPosition(JLabel.CENTER); // sets horizontal text to center
		label.setText("NY Post");
		
		panel.add(label);
		
		//i is less than the author's length
		for(int i=0; i < author.length(); i++) {
		//System.out.printf("%c", author.charAt(i)); // prints in console
		panel.add(article); //add the text area to the panel
		article.append(author.charAt(i) + "");
		Thread.sleep(300);
		}	
				
		for(int i=0; i < title.length(); i++) {
			article.append(title.charAt(i)+ "");
			Thread.sleep(300);
		}
				
		for(int i = 0; i < date.length(); i++) {
			article.append(date.charAt(i) + "");
			Thread.sleep(300);
		}
		
		String paragraph = "";
		
	}

}
