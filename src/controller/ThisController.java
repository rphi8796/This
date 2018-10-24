package controller;

public class ThisController
{
	public void start()
	{
		withoutx2("xenophobia");
	}
	
	public String withoutx2 (String str)
	{
		String output = "";
		
		
		if (str.length() >= 2)
		{
			String fir = str.substring(0,1);
			String sec = str.substring(1,2);
			
			if (fir.equalsIgnoreCase("x"))
			{
				output = str.substring(1);
				
				if (sec.equalsIgnoreCase("x"))
				{
					output = str.substring(2);
				}
				
				else
				{
					output = str.substring(1);
				}
			}
			
			else if (!(fir.equalsIgnoreCase("x")))
			{
				if (sec.equalsIgnoreCase("x"))
				{
					output = str.substring(0, 1);
					output += str.substring(2);
				}
				
				else
				{
					output = str;
				}
				
			}
			
			else 
			{
				output = str;
			}

		}
		
		else if (str.length() == 1)
		{
			if (str.equalsIgnoreCase("x"))
			{
				str = "";
				output = str;
			}
			else
			{
				output = str;
			}
		}
		
		else
		{
			output = str;
		}
		return output;
	}
}
	
