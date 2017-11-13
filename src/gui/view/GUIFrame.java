package gui.view;

import javax.swing.JFrame;

import gui.controller.GUIAppController;


public class GUIFrame extends JFrame
{
	private GUIAppController appController;
	
	public GUIFrame(GUIAppController appController)
	{
		super();
		this.appController = appController;
		
		setupFrame();
	}
	private void setupFrame()
	{
		this.setTitle("GUIFrame Window");
		this.setSize(500,500);
		this.setResizable(false);
		this.setVisible(true);
	}
}
