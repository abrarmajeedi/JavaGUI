import java.util.Random;

import javax.swing.JOptionPane;
public class random {
		public void Gen(){ 	
		String mess = "What do you want to do:\n1.Toss a coin\n2.Roll a die\n3.Generate a random number\n"
				+ "4.Back to Main Menu\nPress # to exit";
		
		char c ='n';
		while(c!='#')
		{
			String ch = JOptionPane.showInputDialog(mess);
			int i = Integer.parseInt(ch);
			
			
			switch(i)
			{
			case 1:
				int r = getRandom(2);
				if(r==1){
						JOptionPane.showMessageDialog(null, "Heads!","Spirit Calculator",JOptionPane.PLAIN_MESSAGE);
						}
				else
					JOptionPane.showMessageDialog(null, "Tails!","Spirit Calculator",JOptionPane.PLAIN_MESSAGE);
				break;
				
			case 2:
				r = getRandom(6);
				JOptionPane.showMessageDialog(null, r ,"Spirit Calculator",JOptionPane.PLAIN_MESSAGE);
				break;
			case 3:
				ch = JOptionPane.showInputDialog("Enter the upper bound, below which you want the Number to be:");
				i = Integer.parseInt(ch);
				String p = Integer.toString(getRandom(i));

				JOptionPane.showMessageDialog(null, p ,"Spirit Calculator",JOptionPane.PLAIN_MESSAGE);
				break;
				
			case 4:
				gui.start();
				return;
				
			default:
				break;
			}
		}
			
	}

		public int getRandom(int x){
			int y;
			Random rand = new Random();
			y = 1+ rand.nextInt(x); 
			return y;
		}
}
