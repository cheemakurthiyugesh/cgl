import java.util.Scanner;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.commons.annotation.Testable;



public class TestDriver<CellStates>
{
	static int Xcord;
	static int Ycord;


	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			Scanner read = new Scanner(System.in);
			GameCord G = new GameCord();
			System.out.println("Xcord");
			G.setXcord(Xcord=read.nextInt());
			System.out.println("Ycord");
			G.setYcord(Ycord=read.nextInt());
			
			System.out.println("Xcord:"+Xcord);
			System.out.println("Ycord:"+Ycord);
	
			
	}

	public TestDriver() {
		
	}

		// TODO Auto-generated constructor stub
	
		@Test
			public void boardTestOne()
			{
				
				int live[][] = {{1,2}}; 
				CellStates sc= new CellStates(3,live);
			    System.out.println("======TEST ONE EXECUTED=======");
			    Assertions.assertEquals("...\n..*\n...",sc.toString());
			    }
			
	public void CGLBoard() 
	{
		// TODO Auto-generated constructor stub
		@Testable
		public void boardTestOne1()
		{
			
			int live[][] = {{1,2}}; 
			CellStates b = new CellStates(3,live);
		    System.out.println("======TEST ONE EXECUTED=======");
		    Assertions.assertEquals("...\n..*\n...",b.toString());
		
		
	}
}

