package visual;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.JComboBox;

public class UserInterface {
	
	private JFrame frame;
	private JButton buttonExit;
	private JButton buttonGuess;
	private JPanel characterPanel;
	private JLabel labelGenre;
	private JLabel labelHeight;
	private JLabel labelBounty;
	private JLabel labelAfiliation;
	private JLabel labelDevilFruit;
	private JLabel labelHaki;
	private JLabel labelOrigin;
	private JLabel labelGuessGenre;
	private JLabel getLabelGuessHeight;
	private JLabel labelGuessBounty;
	private JLabel labelGuessAfiliation;
	private JLabel labelGuessDevilFruit;
	private JLabel labelGuessHaki;
	private JLabel labelGuessOrigin;
	private JComboBox<String> comboBox;

	public UserInterface() {
		initialize();
	}

	
	private void initialize() {
		FlatDarculaLaf.setup();
		
		Image imgGuesser = new ImageIcon(this.getClass().getResource("/guess who.png")).getImage();
		//Image imgLogo = new ImageIcon(this.getClass().getResource("/onePieceLogo.png")).getImage();
		
		frame = new JFrame("One Piece: Guess the Character");
		frame.setBounds(100, 100, 499, 712);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		buttonExit = new JButton("EXIT");
		buttonExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonExit.setBounds(169, 629, 138, 33);
		frame.getContentPane().add(buttonExit);
		
		characterPanel = new JPanel();
		characterPanel.setBounds(137, 73, 170, 183);	
		
		frame.getContentPane().add(characterPanel);
		characterPanel.setLayout(null);
		JLabel lblCharacter = new JLabel("");
		lblCharacter.setBounds(-35, -45, 320, 298);
		lblCharacter.setIcon(new ImageIcon(imgGuesser));
		characterPanel.add(lblCharacter);
		
		
		
		JLabel lblNewLabel = new JLabel("GUESS THE CHARACTER");
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(114, 25, 237, 37);
		frame.getContentPane().add(lblNewLabel);
		

		buttonGuess = new JButton("GUESS");
		buttonGuess.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonGuess.setBounds(136, 308, 172, 30);
		frame.getContentPane().add(buttonGuess);
		
		labelGenre = new JLabel("GENRE:");
		labelGenre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelGenre.setBounds(10, 375, 60, 20);
		frame.getContentPane().add(labelGenre);
		
		labelHeight = new JLabel("HEIGHT:");
		labelHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelHeight.setBounds(10, 405, 60, 20);
		frame.getContentPane().add(labelHeight);
		
		labelBounty = new JLabel("BOUNTY:");
		labelBounty.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelBounty.setBounds(10, 435, 82, 20);
		frame.getContentPane().add(labelBounty);
		
		labelAfiliation = new JLabel("AFILIATION:");
		labelAfiliation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelAfiliation.setBounds(10, 465, 94, 20);
		frame.getContentPane().add(labelAfiliation);
		
		labelDevilFruit = new JLabel("DEVIL FRUIT:");
		labelDevilFruit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelDevilFruit.setBounds(10, 495, 104, 20);
		frame.getContentPane().add(labelDevilFruit);
		
		labelHaki = new JLabel("HAKI:");
		labelHaki.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelHaki.setBounds(10, 525, 60, 20);
		frame.getContentPane().add(labelHaki);
		
		labelOrigin = new JLabel("ORIGIN:");
		labelOrigin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelOrigin.setBounds(10, 555, 60, 20);
		frame.getContentPane().add(labelOrigin);
		
		labelGuessGenre = new JLabel("");
		labelGuessGenre.setForeground(new Color(0, 0, 0));
		labelGuessGenre.setHorizontalAlignment(SwingConstants.LEFT);
		labelGuessGenre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelGuessGenre.setBounds(114, 376, 128, 19);
		frame.getContentPane().add(labelGuessGenre);
		
		getLabelGuessHeight = new JLabel("");
		getLabelGuessHeight.setHorizontalAlignment(SwingConstants.LEFT);
		getLabelGuessHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		getLabelGuessHeight.setBounds(114, 405, 219, 19);
		frame.getContentPane().add(getLabelGuessHeight);
		
		labelGuessBounty = new JLabel("");
		labelGuessBounty.setHorizontalAlignment(SwingConstants.LEFT);
		labelGuessBounty.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelGuessBounty.setBounds(114, 435, 263, 19);
		frame.getContentPane().add(labelGuessBounty);
		
		labelGuessAfiliation = new JLabel("");
		labelGuessAfiliation.setHorizontalAlignment(SwingConstants.LEFT);
		labelGuessAfiliation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelGuessAfiliation.setBounds(114, 465, 128, 19);
		frame.getContentPane().add(labelGuessAfiliation);
		
		labelGuessDevilFruit = new JLabel("");
		labelGuessDevilFruit.setHorizontalAlignment(SwingConstants.LEFT);
		labelGuessDevilFruit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelGuessDevilFruit.setBounds(114, 495, 237, 20);
		frame.getContentPane().add(labelGuessDevilFruit);
		
		labelGuessHaki = new JLabel("");
		labelGuessHaki.setHorizontalAlignment(SwingConstants.LEFT);
		labelGuessHaki.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelGuessHaki.setBounds(114, 525, 314, 19);
		frame.getContentPane().add(labelGuessHaki);
		
		labelGuessOrigin = new JLabel("");
		labelGuessOrigin.setHorizontalAlignment(SwingConstants.LEFT);
		labelGuessOrigin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelGuessOrigin.setBounds(114, 555, 128, 19);
		frame.getContentPane().add(labelGuessOrigin);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(137, 280, 170, 30);
		frame.getContentPane().add(comboBox);
		
		
		
		frame.setVisible(true);
	}
	
	

	public JFrame getFrame() {
		return frame;
	}

	public JButton getButtonExit() {
		return buttonExit;
	}

	public JButton getButtonGuess() {
		return buttonGuess;
	}

	public JPanel getCharacterPanel() {
		return characterPanel;
	}

	public JLabel getLabelGenre() {
		return labelGenre;
	}

	public JLabel getLabelHeight() {
		return labelHeight;
	}

	public JLabel getLabelBounty() {
		return labelBounty;
	}

	public JLabel getLabelAfiliation() {
		return labelAfiliation;
	}

	public JLabel getLabelDevilFruit() {
		return labelDevilFruit;
	}
	
	public JLabel getLabelHaki() {
		return labelHaki;
	}

	public JLabel getLabelOrigin() {
		return labelOrigin;
	}

	public JLabel getLabelGuessGenre() {
		return labelGuessGenre;
	}

	public JLabel getLabelGuessHeight() {
		return getLabelGuessHeight;
	}

	public JLabel getLabelGuessBounty() {
		return labelGuessBounty;
	}

	public JLabel getLabelGuessAfiliation() {
		return labelGuessAfiliation;
	}

	public JLabel getLabelGuessDevilFruit() {
		return labelGuessDevilFruit;
	}

	public JLabel getLabelGuessHaki() {
		return labelGuessHaki;
	}

	public JLabel getLabelGuessOrigin() {
		return labelGuessOrigin;
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}
}
