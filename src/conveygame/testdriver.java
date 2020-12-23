package conveygame;
import java.util.Scanner;


public class testdriver
{
	static int Xaxis;
	static int Yaxis;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			Scanner read = new Scanner(System.in);
			game G = new game();
			System.out.println("X-axis");
			G.setXaxis(Xaxis=read.nextInt());
			System.out.println("Y-axis");
			G.setXaxis(Yaxis=read.nextInt());
			
			System.out.println("The value width:"+Xaxis);
			System.out.println("The value height:"+Yaxis);
	
			
	}
}

