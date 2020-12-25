import java.util.Scanner;


public class TestDriver
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

	public TestDriver() 
	{
		// TODO Auto-generated constructor stub
	}
	public void GameCord() 
	{
		// TODO Auto-generated constructor stub
	}

}
