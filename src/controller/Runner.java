package controller;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Runner
{
	public static void main(String[] args)
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				CardLayoutDemo.createAndShowGUI();
			}
		});
	}
}
