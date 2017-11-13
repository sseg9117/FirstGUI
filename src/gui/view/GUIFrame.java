package gui.view;

import javax.swing.JFrame;

import gui.controller.GUIAppController;


public class GUIFrame extends JFrame
{
	private GUIAppController appController;
	private GUIPanel firstPanel;
	
	public GUIFrame(GUIAppController appController)
	{
		super();
		this.appController = appController;
		this.firstPanel = new GUIPanel(appController);
		
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(firstPanel);
		this.setTitle("GUIFrame Window");
		this.setSize(500,500);
		this.setResizable(false);
		this.setVisible(true);
	}
}
