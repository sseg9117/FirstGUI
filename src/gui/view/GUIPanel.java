package gui.view;

import gui.controller.GUIAppController;

import java.awt.Color.*;

import javax.swing.*;

public class GUIPanel
{
	private GUIAppController appController;
	
	private JButton firstButton;
	
	
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Wow a button");
				
				
	}
}
