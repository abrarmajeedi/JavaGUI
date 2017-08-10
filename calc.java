import javax.swing.JOptionPane;

public class calc {
   public void calculator(){
	   String mess = "What do you want to calculate:\n1.Sum\n2.Difference\n3.Product\n4.Square Root\n"
	   		+ "5.Division\n6.Back to Main Menu\nPress # to exit";
		
		char c ='n';
		while(c!='#')
		{
			String ch = JOptionPane.showInputDialog(mess);
			int i = Integer.parseInt(ch);
			double num1,num2, answer = 0;
			
			switch(i)
			{
			case 1:
				num1 =  Double.parseDouble(JOptionPane.showInputDialog("Enter first number"));
				num2  = Double.parseDouble(JOptionPane.showInputDialog("Enter Second number"));
				answer = num1 + num2;
				break;
				
			case 2:
				num1 =  Double.parseDouble(JOptionPane.showInputDialog("Enter first number"));
				num2  = Double.parseDouble(JOptionPane.showInputDialog("Enter Second number"));
				answer = num1 - num2;
				break;
			case 3:
				num1 =  Double.parseDouble(JOptionPane.showInputDialog("Enter first number"));
				num2  = Double.parseDouble(JOptionPane.showInputDialog("Enter Second number"));
				answer = num1 * num2;
				break;
			case 4:
				num1 =  Double.parseDouble(JOptionPane.showInputDialog("Enter number"));
				answer = Math.sqrt(num1);
				break;
				
			case 5:
				num1 =  Double.parseDouble(JOptionPane.showInputDialog("Enter first number"));
				num2  = Double.parseDouble(JOptionPane.showInputDialog("Enter Second number"));
				if(num2!=0)answer = num1 / num2;
				else {
					answer = 000;
					JOptionPane.showMessageDialog(null, "Error","Spirit Calculator",JOptionPane.PLAIN_MESSAGE);
					}
				break;
			case 6:
				gui.start();
				return;
			default:
				break;
			}
			JOptionPane.showMessageDialog(null, "The answer is "+answer,"Spirit Calculator",JOptionPane.PLAIN_MESSAGE);
   }
  }
}
