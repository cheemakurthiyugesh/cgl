
public class GameCord 
{
	private int width, height, gen;

    public GameCord (int w,int h) 
    {
        width = w;
        height = h;
    }

    public void randomPopulation(double fill) 
    {
        System.out.println("LifeModel: Call to randomPopulation(" + fill + ")");
    }

    public void newGeneration() 
    {
        gen++;
        System.out.println("LifeModel: Call #" + gen + " to newGeneration()");
    }

    public void setCell(int i, int j, boolean b) 
    {
        System.out.println("LifeModel: Call to setCell(" + i + "," + j + "," + b + ")");
    }

    public boolean getCell(int i, int j) 
    {
        if (i==0 && j==0)
            System.out.println("LifeModel: Call to getCell(" + i + "," + j + ")");
        return (i+j)%2==0;
    }

    public int getWidth() 
    {
        System.out.println("LifeModel: Call to getWidth()");
        return width;
    }

    public int getHeight() 
    {
        System.out.println("LifeModel: Call to getHeight()");
        return height;
    }
    
    public int getGen() 
    {
        System.out.println("LifeModel: Call to getGen()");
        return gen;
    }

	/**
	 * @return 
	 * 
	 */
	public GameCord() 
	{
		// TODO Auto-generated constructor stub
	}

	public void setXcord(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setYcord(int i) {
		// TODO Auto-generated method stub
		
	}

}
