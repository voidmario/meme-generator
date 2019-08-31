

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PersonalProject extends JFrame {
	
	JFrame frame;
	JPanel customize, picture;
	JTextField topTextTextField, bottonTextTextField;
	JLabel topTextLabel, bottomTextLabel, pictureLabel, topLabel, bottomLabel, colorLabel;
	JButton topTextButton, bottomTextButton, pictureButton, colorButton;
	JComboBox<String> pictureOptions, colorOptions;
	
	
	public PersonalProject() {
		
		// Setting up

		frame = new JFrame();
		
		frame.setSize(900, 900);
		frame.setTitle("Meme Generator");
		frame.getContentPane().setBackground(Color.pink);
		
		ImageIcon icon = new ImageIcon("src/kitty.png");
		frame.setIconImage(icon.getImage());
		
		
		// This is the edit bar on the top of the screen
		customize = new JPanel();
		customize.setOpaque(false);
		customize.setSize(900, 100);
		customize.setBackground(Color.pink);
		customize.setLocation(0, 0);
		
		
		frame.add(customize);
		customize.setLayout(new FlowLayout());
		
		
		// Initiating the stuff...
		
		// Text Boxes
		topTextTextField = new JTextField(10);
		bottonTextTextField = new JTextField(10);
		
		
		// Labels
		topLabel = new JLabel("Top Text:");
		
		bottomLabel = new JLabel("Bottom Text:");
		
		pictureLabel = new JLabel("Picture:");
		
		topTextLabel = new JLabel("text");
		bottomTextLabel = new JLabel("test");
		
		colorLabel = new JLabel("Text Color:");
		
		
		
		// Combo Box
		String[] images = {"Kermit", "Jordan", "Simply", "Trump", "Spidey", "Instructions"};
		pictureOptions = new JComboBox<String>(images);
		
		String[] colors = {"Black","Pink","White"};
		colorOptions = new JComboBox<String>(colors);
		
		topTextButton = new JButton("Done");
		bottomTextButton = new JButton("Done");
		
		pictureButton = new JButton("Done");
		
		
		
		// Adding
		customize.add(pictureLabel);
		customize.add(pictureOptions);
		
		
		customize.add(topLabel);
		customize.add(topTextTextField);

		
		customize.add(bottomLabel);
		customize.add(bottonTextTextField);
		
		customize.add(colorLabel);
		customize.add(colorOptions);
		customize.add(bottomTextButton);
		
		// Initializing JLabel for images
		JLabel kermit = new JLabel(new ImageIcon("images/kermit.png"));
		JLabel trump = new JLabel(new ImageIcon("images/trump.png"));
		JLabel jordan = new JLabel(new ImageIcon("images/jordan.png"));
		JLabel simply = new JLabel(new ImageIcon("images/simply.png"));
		JLabel spidey = new JLabel(new ImageIcon("images/spidey.png"));
		JLabel instructions = new JLabel(new ImageIcon("images/instructions.png"));

		JLabel[] labels = {kermit, trump, jordan, simply, spidey, instructions};
		// FUNCTIONALITY HERE
		
		frame.setLayout(new BorderLayout());
		
		bottomTextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pictureDisplay = pictureOptions.getSelectedItem().toString();
				String colorChosen = colorOptions.getSelectedItem().toString();

				if(pictureDisplay.equals("Instructions")){
					for(int i = 0; i < labels.length; i++){
						labels[i].setVisible(false);
			
					} 
					instructions.setVisible(true);
				}
				
				if(pictureDisplay.equals("Kermit")) {
					
					// Prepares the image that was requested

					for(int i = 0; i < labels.length; i++){
					
						labels[i].setVisible(false);
					
					}
					kermit.setVisible(true);
						
					
					topTextLabel.setText(topTextTextField.getText());
					topTextLabel.setFont(new Font("Serif", Font.BOLD, 55));
					topTextLabel.setSize(topTextLabel.getPreferredSize());
					
					if(colorChosen.equals("White")) {
						topTextLabel.setForeground(Color.WHITE);
					}
					else if(colorChosen.equals("Black")) {
						topTextLabel.setForeground(Color.BLACK);
					}
					else {
						topTextLabel.setForeground(Color.PINK);
					}
					topTextLabel.setLocation(450 - topTextLabel.getWidth()/2, 265);
					
					
					bottomTextLabel.setText(bottonTextTextField.getText());
					bottomTextLabel.setFont(new Font("Serif", Font.BOLD, 55));
					bottomTextLabel.setSize(bottomTextLabel.getPreferredSize());
					if(colorChosen.equals("White")) {
						bottomTextLabel.setForeground(Color.WHITE);
					}
					else if(colorChosen.equals("Black")) {
						bottomTextLabel.setForeground(Color.BLACK);
					}
					else {
						bottomTextLabel.setForeground(Color.PINK);
					}
					
					bottomTextLabel.setLocation(450 - bottomTextLabel.getWidth()/2, 650);
					
					kermit.add(topTextLabel);
					kermit.add(bottomTextLabel);
					frame.add(kermit);
					
					frame.setVisible(true);
					
					
					
					
				}
				else if(pictureDisplay.equals("Trump")) {

					for(int i = 0; i < labels.length; i++){
					
						labels[i].setVisible(false);
					
					}
					trump.setVisible(true);
					
					topTextLabel.setText(topTextTextField.getText());
					topTextLabel.setFont(new Font("Serif", Font.BOLD, 55));
					topTextLabel.setSize(topTextLabel.getPreferredSize());
					if(colorChosen.equals("White")) {
						topTextLabel.setForeground(Color.WHITE);
					}
					else if(colorChosen.equals("Black")) {
						topTextLabel.setForeground(Color.BLACK);
					}
					else {
						topTextLabel.setForeground(Color.PINK);
					}
					topTextLabel.setLocation(450 - topTextLabel.getWidth()/2, 265);
					
					
					bottomTextLabel.setText(bottonTextTextField.getText());
					bottomTextLabel.setFont(new Font("Serif", Font.BOLD, 55));
					bottomTextLabel.setSize(bottomTextLabel.getPreferredSize());
					if(colorChosen.equals("White")) {
						bottomTextLabel.setForeground(Color.WHITE);
					}
					else if(colorChosen.equals("Black")) {
						bottomTextLabel.setForeground(Color.BLACK);
					}
					else {
						bottomTextLabel.setForeground(Color.PINK);
					}
					bottomTextLabel.setLocation(450 - bottomTextLabel.getWidth()/2, 650);
					
					trump.add(topTextLabel);
					trump.add(bottomTextLabel);
					frame.add(trump);
					
					frame.setVisible(true);
					
					
				}
				else if(pictureDisplay.equals("Jordan")) {
					for(int i = 0; i < labels.length; i++){
					
						labels[i].setVisible(false);
					
					}
					jordan.setVisible(true);
					
					topTextLabel.setText(topTextTextField.getText());
					topTextLabel.setFont(new Font("Serif", Font.BOLD, 55));
					topTextLabel.setSize(topTextLabel.getPreferredSize());
					if(colorChosen.equals("White")) {
						topTextLabel.setForeground(Color.WHITE);
					}
					else if(colorChosen.equals("Black")) {
						topTextLabel.setForeground(Color.BLACK);
					}
					else {
						topTextLabel.setForeground(Color.PINK);
					}
					topTextLabel.setLocation(450 - topTextLabel.getWidth()/2, 265);
					
					
					bottomTextLabel.setText(bottonTextTextField.getText());
					bottomTextLabel.setFont(new Font("Serif", Font.BOLD, 55));
					bottomTextLabel.setSize(bottomTextLabel.getPreferredSize());
					if(colorChosen.equals("White")) {
						bottomTextLabel.setForeground(Color.WHITE);
					}
					else if(colorChosen.equals("Black")) {
						bottomTextLabel.setForeground(Color.BLACK);
					}
					else {
						bottomTextLabel.setForeground(Color.PINK);
					}
					bottomTextLabel.setLocation(450 - bottomTextLabel.getWidth()/2, 625);
					
					jordan.add(topTextLabel);
					jordan.add(bottomTextLabel);
					frame.add(jordan);
					
					frame.setVisible(true);
				}
				else if(pictureDisplay.equals("Simply")) {
					for(int i = 0; i < labels.length; i++){
					
						labels[i].setVisible(false);
					
					}
					simply.setVisible(true);
					
					topTextLabel.setText(topTextTextField.getText());
					topTextLabel.setFont(new Font("Serif", Font.BOLD, 55));
					topTextLabel.setSize(topTextLabel.getPreferredSize());
					if(colorChosen.equals("White")) {
						topTextLabel.setForeground(Color.WHITE);
					}
					else if(colorChosen.equals("Black")) {
						topTextLabel.setForeground(Color.BLACK);
					}
					else {
						topTextLabel.setForeground(Color.PINK);
					}
					topTextLabel.setLocation(450 - topTextLabel.getWidth()/2, 265);
					
					
					bottomTextLabel.setText(bottonTextTextField.getText());
					bottomTextLabel.setFont(new Font("Serif", Font.BOLD, 55));
					bottomTextLabel.setSize(bottomTextLabel.getPreferredSize());
					if(colorChosen.equals("White")) {
						bottomTextLabel.setForeground(Color.WHITE);
					}
					else if(colorChosen.equals("Black")) {
						bottomTextLabel.setForeground(Color.BLACK);
					}
					else {
						bottomTextLabel.setForeground(Color.PINK);
					}
					bottomTextLabel.setLocation(450 - bottomTextLabel.getWidth()/2, 650);
					
					simply.add(topTextLabel);
					simply.add(bottomTextLabel);
					frame.add(simply);
					
					frame.setVisible(true);
				}
				else if(pictureDisplay.equals("Spidey")) {
					for(int i = 0; i < labels.length; i++){
					
						labels[i].setVisible(false);
					
					}
					spidey.setVisible(true);
					
					topTextLabel.setText(topTextTextField.getText());
					topTextLabel.setFont(new Font("Serif", Font.BOLD, 55));
					topTextLabel.setSize(topTextLabel.getPreferredSize());
					if(colorChosen.equals("White")) {
						topTextLabel.setForeground(Color.WHITE);
					}
					else if(colorChosen.equals("Black")) {
						topTextLabel.setForeground(Color.BLACK);
					}
					else {
						topTextLabel.setForeground(Color.PINK);
					}
					topTextLabel.setLocation(450 - topTextLabel.getWidth()/2, 265);
					
					
					bottomTextLabel.setText(bottonTextTextField.getText());
					bottomTextLabel.setFont(new Font("Serif", Font.BOLD, 55));
					bottomTextLabel.setSize(bottomTextLabel.getPreferredSize());
					if(colorChosen.equals("White")) {
						bottomTextLabel.setForeground(Color.WHITE);
					}
					else if(colorChosen.equals("Black")) {
						bottomTextLabel.setForeground(Color.BLACK);
					}
					else {
						bottomTextLabel.setForeground(Color.PINK);
					}
					bottomTextLabel.setLocation(450 - bottomTextLabel.getWidth()/2, 650);
					
					spidey.add(topTextLabel);
					spidey.add(bottomTextLabel);
					frame.add(spidey);
					
					frame.setVisible(true);
					
				}
				
			}
		});
		frame.add(instructions);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		PersonalProject memeGenerator = new PersonalProject();
		
	}
	

}
