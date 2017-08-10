import javax.swing.JOptionPane;

public class gui
{
	public static void main(String args[])
	{   
		start();
	}

	static void start()
	{
		String mess = "1.Calculator\n 2.Random Experiment\n\nPress # to exit";
		String ch = JOptionPane.showInputDialog(mess);
		int i = Integer.parseInt(ch);
		char c ='n';
		while(c!='#')
		{
		
			switch(i)
			{
				case 1:
				calc calcObj = new calc();
				calcObj.calculator();
				break;
		
			
				case 2:
				random randObj = new random();
				randObj.Gen();
				break;	
		
			}

		}
	}

}

