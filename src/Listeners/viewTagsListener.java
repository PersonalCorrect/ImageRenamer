package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import photo_renamer.TagListSingleton;

public class viewTagsListener implements ActionListener {

	private JTextArea textArea;
	
	public viewTagsListener(JTextArea textArea) {
		this.textArea = textArea;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		textArea.setText(TagListSingleton.getInstance().toString());
	}

}
