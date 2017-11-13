package gui.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import gui.controller.GUIAppController;

public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Wow a button");	
		baseLayout = new SpringLayout();	
		
		setupPanel();
	}
	
	/**
	 * Used to add all components to the subclass of JPanel
	 * This installs them into the panel so they are seen in the GUI.
	 */	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
	}
	
	/**
	 * This is used to hold all the layout and arrangement code for SpringLayout.
	 */
	private void setupLayout()
	{
		
	}
	
	/**
	 * 
	 */
	private void setupListeners()
	{
		
	}
}
