public class Point //A point which contains x and y coordinates that will later form a connected line
{
	int x, y; //Coordinates in integer form
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	//Gives exact x and y location of the point
	public int giveX()
	{
		return x;
	}
	public int giveY()
	{
		return y;
	}
}
