package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

import model.Character;
import model.Character.afiliation;
import model.Character.devilFruit;
import model.Character.gender;
import model.Character.haki;
import model.Character.origin;
import model.Model;
import model.MoneyConverter;
import visual.UserInterface;

public class Controller {
	
	private UserInterface userInterface;
	private Model model;
	
	public Controller() {
		this.model = new Model();
		this.userInterface = new UserInterface();
		inizialiteUIButtons();
	}

	private void inizialiteUIButtons() {
		
		loadBoxcharacterNames();
		this.userInterface.getButtonExit().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userInterface.getFrame().dispose();
			}
		});
		/*
		this.userInterface.getButtonGuess().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(model.isTheCharacter(userInterface.inputName.getText()) && !userInterface.inputName.getText().isEmpty()) {
					changeGuessLabels(model.getCharacterFromNameSelected(userInterface.inputName.getText()));
					JOptionPane.showMessageDialog(userInterface.frame.getContentPane(), "YOU WON!!!", "YOU'LL BE THE KING OF THE PIRATES", JOptionPane.INFORMATION_MESSAGE);
					userInterface.inputName.setText(null);
				}else {
					if(model.getCharacterFromNameSelected(userInterface.inputName.getText()) == null){
						JOptionPane.showMessageDialog(userInterface.frame.getContentPane(), "Write A Valid Name", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);

							userInterface.inputName.setText(null);
						}
					else {
						changeGuessLabels(model.getCharacterFromNameSelected(userInterface.inputName.getText()));
					}
					
				}
				
			}

		});
		*/
		this.userInterface.getButtonGuess().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(userInterface.getComboBox().getSelectedItem().toString() == "") {
					JOptionPane.showMessageDialog(userInterface.getFrame().getContentPane(), "SELECT A CHARACTER FROM THE LIST", "BAKA, MARIMO!",  JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					if(userInterface.getComboBox().getSelectedItem().toString().equalsIgnoreCase(model.getSelectedCharacter().getName())) {
						changeGuessLabels(model.getCharacterFromNameSelected(userInterface.getComboBox().getSelectedItem().toString()));
						JOptionPane.showMessageDialog(userInterface.getFrame().getContentPane(), "YOU WON!!!", "YOU'LL BE THE KING OF THE PIRATES", JOptionPane.INFORMATION_MESSAGE);
						cleanGuessLabels();
					}
					else {
						changeGuessLabels(model.getCharacterFromNameSelected(userInterface.getComboBox().getSelectedItem().toString()));	
					}
			}
		}
	});
			
	} 
	private void changeGuessLabels(Character characterFromNameSelected) {
		setLabelGuessAfiliation(characterFromNameSelected);
		setLabelGuessBounty(characterFromNameSelected);
		setLabelGuessDevilFruit(characterFromNameSelected);
		setLabelGuessGenre(characterFromNameSelected);
		setLabelGuessHaki(characterFromNameSelected);
		setLabelGuessOrigin(characterFromNameSelected);
		setLabelGuessHeight(characterFromNameSelected);
	}
	
	private void cleanGuessLabels() {
		userInterface.getLabelGuessOrigin().setText(null);
		userInterface.getLabelGuessAfiliation().setText(null);
		userInterface.getLabelGuessDevilFruit().setText(null);
		userInterface.getLabelGuessGenre().setText(null);
		userInterface.getLabelGuessHaki().setText(null);
		userInterface.getLabelGuessHeight().setText(null);
		userInterface.getLabelGuessBounty().setText(null);
		userInterface.getComboBox().setSelectedIndex(0);
	}
	
	
	
	
	private void setLabelGuessOrigin(Character characterFromNameSelected) {
		if (model.getSelectedCharacter().getOrigin() == characterFromNameSelected.getOrigin()) {
			userInterface.getLabelGuessOrigin().setForeground(Color.GREEN);	
		} 
		else {
			userInterface.getLabelGuessOrigin().setForeground(Color.RED);
		}
			if (characterFromNameSelected.getOrigin() == origin.NORTH) {
				userInterface.getLabelGuessOrigin().setText("NORTH BLUE");
			}
			if (characterFromNameSelected.getOrigin() == origin.SOUTH) {
				userInterface.getLabelGuessOrigin().setText("SOUTH BLUE");
			}
			if (characterFromNameSelected.getOrigin() == origin.EAST) {
				userInterface.getLabelGuessOrigin().setText("EAST BLUE");
			}
			if (characterFromNameSelected.getOrigin() == origin.WEST) {
				userInterface.getLabelGuessOrigin().setText("WEST BLUE");
			}
			if (characterFromNameSelected.getOrigin() == origin.GRANDLINE) {
				userInterface.getLabelGuessOrigin().setText("GRAND LINE");
			}
			if (characterFromNameSelected.getOrigin() == origin.UNKNOWN) {
				userInterface.getLabelGuessOrigin().setText("IT'S UNKNOWN");
			}
			if (characterFromNameSelected.getOrigin() == origin.MARYJGEOISE) {
				userInterface.getLabelGuessOrigin().setText("MARY GEOISE");
			}

	}
	private void setLabelGuessHeight(Character characterFromNameSelected) {
		if(model.getSelectedCharacter().getHeight() == characterFromNameSelected.getHeight()) {
			userInterface.getLabelGuessHeight().setForeground(Color.GREEN);
			userInterface.getLabelGuessHeight().setText(String.valueOf(characterFromNameSelected.getHeight()) + " Cm");
		}	
		else {
			userInterface.getLabelGuessHeight().setForeground(Color.RED);
			if(model.getSelectedCharacter().getHeight() > characterFromNameSelected.getHeight()) {
				userInterface.getLabelGuessHeight().setText("MORE THAN " + characterFromNameSelected.getHeight() + " Cm");
			}else {
				userInterface.getLabelGuessHeight().setText("LESS THAN " + characterFromNameSelected.getHeight() + " Cm");

			}
		}
	}
	
	private void setLabelGuessHaki(Character characterFromNameSelected) {
		if (model.getSelectedCharacter().getHaki() == characterFromNameSelected.getHaki()) {
			userInterface.getLabelGuessHaki().setForeground(Color.GREEN);
		}
		else{
			userInterface.getLabelGuessHaki().setForeground(Color.RED);
		}
		if (characterFromNameSelected.getHaki() == haki.ALL) {
			userInterface.getLabelGuessHaki().setText("CONQUERORS, ARMAMENT & OBSERVATION");
		}
		if (characterFromNameSelected.getHaki() == haki.OBSERVATION) {
			userInterface.getLabelGuessHaki().setText("OBSERVATION");
		}
		if (characterFromNameSelected.getHaki() == haki.OBSV_ARMT) {
			userInterface.getLabelGuessHaki().setText("ARMAMENT & OBSERVATION");
		}
		if (characterFromNameSelected.getHaki() == haki.ARMAMENT) {
			userInterface.getLabelGuessHaki().setText("ARMAMENT");
		}
		if (characterFromNameSelected.getHaki() == haki.NONE) {
			userInterface.getLabelGuessHaki().setText("DOESN'T HAVE HAKI");
		}
		
	}

	private void setLabelGuessGenre(Character characterFromNameSelected) {
		if (model.getSelectedCharacter().getGend()  == characterFromNameSelected.getGend()) {
			userInterface.getLabelGuessGenre().setForeground(Color.GREEN);
		}
		else {
			userInterface.getLabelGuessGenre().setForeground(Color.RED);
		}
		if (characterFromNameSelected.getGend() == gender.MALE) {
			userInterface.getLabelGuessGenre().setText("MALE");
		}
		if (characterFromNameSelected.getGend() == gender.FEMALE) {
			userInterface.getLabelGuessGenre().setText("FEMALE");
		}
	}

	private void setLabelGuessDevilFruit(Character characterFromNameSelected) {
		if (model.getSelectedCharacter().getDevilFruit() == characterFromNameSelected.getDevilFruit()) {
			userInterface.getLabelGuessDevilFruit().setForeground(Color.GREEN);
		} 
		else {
			userInterface.getLabelGuessDevilFruit().setForeground(Color.RED);
		}
		if (characterFromNameSelected.getDevilFruit() == devilFruit.NONE) {
			userInterface.getLabelGuessDevilFruit().setText("DOESNT HAVE A DEVIL FRUIT");
		}
		if (characterFromNameSelected.getDevilFruit() == devilFruit.LOGIA) {
			userInterface.getLabelGuessDevilFruit().setText("LOGIA");
		}
		if (characterFromNameSelected.getDevilFruit() == devilFruit.PARAMECIA) {
			userInterface.getLabelGuessDevilFruit().setText("PARAMECIA");
		}
		if (characterFromNameSelected.getDevilFruit() == devilFruit.ZOAN) {
			userInterface.getLabelGuessDevilFruit().setText("ZOAN");
		}
	}

	private void setLabelGuessAfiliation(Character characterFromNameSelected) {
		if(model.getSelectedCharacter().getAfiliation() == characterFromNameSelected.getAfiliation()) {
			userInterface.getLabelGuessAfiliation().setForeground(Color.GREEN);
		}
		else {
			userInterface.getLabelGuessAfiliation().setForeground(Color.RED);
		}
			if(characterFromNameSelected.getAfiliation() == afiliation.MARINE) {
				userInterface.getLabelGuessAfiliation().setText("MARINE");
			}
			if(characterFromNameSelected.getAfiliation() == afiliation.PIRATE) {
				userInterface.getLabelGuessAfiliation().setText("PIRATE");
			}
			if(characterFromNameSelected.getAfiliation() == afiliation.SWORD) {
				userInterface.getLabelGuessAfiliation().setText("SWORD");
			}
			if(characterFromNameSelected.getAfiliation() == afiliation.NONE) {
				userInterface.getLabelGuessAfiliation().setText("NO AFILIATION");
			}
	}
	
	private void setLabelGuessBounty(Character characterFromNameSelected) {
		if(model.getSelectedCharacter().getBounty() == characterFromNameSelected.getBounty()) {
			userInterface.getLabelGuessBounty().setText(MoneyConverter.moneyConversorString(characterFromNameSelected.getBounty()));
			userInterface.getLabelGuessBounty().setForeground(Color.GREEN);
		}	
		else {
			userInterface.getLabelGuessBounty().setForeground(Color.RED);	
			if(model.getSelectedCharacter().getBounty() > characterFromNameSelected.getBounty()) {
				userInterface.getLabelGuessBounty().setText("MORE THAN " + MoneyConverter.moneyConversorString(characterFromNameSelected.getBounty()));
			}else {
				userInterface.getLabelGuessBounty().setText("LESS THAN " + MoneyConverter.moneyConversorString(characterFromNameSelected.getBounty()));
			}
		}
	}
	
	private void loadBoxcharacterNames() {
		ArrayList<String> names = new ArrayList<String>();
		for(Character c: model.getCharacterList()) {
			names.add(c.getName());
		}
		Collections.sort(names);
		userInterface.getComboBox().addItem("");
		for(String characterName: names) {
			userInterface.getComboBox().addItem(characterName.toUpperCase());
		}
	}
}
