
public class LineSeg
{
	Point p1, p2;
	double dist;
	
	public LineSeg()
	{}
	public LineSeg(int x1, int y1, int x2, int y2) //Constructs a vector given 2 points
	{
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
		dist = setDistance(x1, y1, x2, y2);
	}
	
	public double setDistance(int x1, int y1, int x2, int y2)
	{
		return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	}
	
	public int comparePoints(LineSeg l1, LineSeg l2) //Compares two points for intersection or collinearity
	{
		int pos1, pos2, pos3, pos4;
		//Checking all positional cases
		pos1 = position(l1.getPoint1(), l1.getPoint2(), l2.getPoint1());
		pos2 = position(l1.getPoint1(), l1.getPoint2(), l2.getPoint2());
		pos3 = position(l2.getPoint1(), l2.getPoint2(), l1.getPoint1());
		pos4 = position(l2.getPoint1(), l2.getPoint2(), l1.getPoint2());
		if(pos1 != pos2 && pos3 != pos4) //Intersects
		{
			return 0;
		}
		else if((pos1 == 0 && orientCheck(l1.getPoint1(), l2.getPoint1(), l1.getPoint2())) || (pos2 == 0 && orientCheck(l1.getPoint1(), l2.getPoint2(), l1.getPoint2())) || (pos3 == 0 && orientCheck(l2.getPoint1(), l1.getPoint1(), l2.getPoint2())) || (pos4 == 0 && orientCheck(l2.getPoint1(), l1.getPoint2(), l2.getPoint2()))) //Is collinear
		{
			return 1;
		}
		return 2; //Not intersecting
	}
	
	public boolean orientCheck(Point p, Point q, Point r) //Checks for parallel intersection through the use of vector comparison.
	{
		if(q.giveX() <= Math.max(p.giveX(), r.giveX()) && q.giveX() >= Math.min(p.giveX(), r.giveX())) //Determines if the points match on a segment
		{
			return true;
		}
		return false;
	}
	
	public int position(Point p, Point q, Point r) //Converts a triplet to the correct orientation case.
	{
		int check = (q.giveY() - p.giveY()) * (r.giveX()-q.giveX()) - (q.giveX() - p.giveX()) * (r.giveY()-q.giveY());
		
		if (check == 0) //Collinear
		{
			return 0;
		}
		else if(check > 0) //Clockwise
		{
			return 1;
		}
		return 2; //Counterclockwise
	}
	
	public Point getPoint1() //First point's coordinates
	{
		return p1;
	}
	public Point getPoint2() //Second point's coordinates
	{
		return p2;
	}
}
