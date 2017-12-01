package gui.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		setupLayout();
		setupListeners();

	}
	
	/**
	 * Used to add all components to the subclass of JPanel
	 * This installs them into the panel so they are seen in the GUI.
	 */	
	private void setupPanel()  //this adds the button to the panel and makes the background color cyan
	{
		this.setBackground(Color.CYAN);
		this.setLayout(baseLayout);
		this.add(firstButton);
	}
	
	/**
	 * This is used to hold all the layout and arrangement code for SpringLayout.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 113, SpringLayout.NORTH, this);//this is the postion of the first button you have
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 137, SpringLayout.WEST, this);	
	}
	
	/**
	 * This helper method is used to link any GUI components the associated listeners.
	 */
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent click) //this makes it so when the button is pressed the action thats called works
				{
					changeBackgroundColor();
				}			
			});
	}
	
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256); //changes the background color to random color 
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
}
