package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class ThisController
{
	public void start()
	{
		withoutx2();
	}
	
	public String withoutx2 (String str)
	{
		String output = "";
		String fir = str.substring(0,1);
		String sec = str.substring(1,2);
		
		if (fir.equalsIgnoreCase("x"))
		{
			output = str.substring(1);
		}
		
		return output;
	}
}
