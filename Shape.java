/*
 * This is the quadrilateral shape that would be considered when placed on a plane;
 * I separated the quadrilaterals into independent line segments for better comparison
 */
public class Shape
{
	private LineSeg line1, line2, line3, line4; //Lines that make up the quadrilateral
	private LineSeg comparator = new LineSeg();
	private Point p1, p2, p3, p4; //Points that form the quadrilateral
	
	public Shape()
	{}
	
	public Shape(int[] coord) //Creates line segments given coordinates
	{
		p1 = new Point(coord[0], coord[1]);
		p2 = new Point(coord[2], coord[3]);
		p3 = new Point(coord[4], coord[5]);
		p4 = new Point(coord[6], coord[7]);
		line1 = new LineSeg(p1.giveX(), p1.giveY(), p2.giveX(), p2.giveY());
		line2 = new LineSeg(p2.giveX(), p2.giveY(), p3.giveX(), p3.giveY());
		line3 = new LineSeg(p3.giveX(), p3.giveY(), p4.giveX(), p4.giveY());
		line4 = new LineSeg(p4.giveX(), p4.giveY(), p1.giveX(), p1.giveY());
	}
	public int compareShapes(Shape s1, Shape s2) //Compares two shapes by whether their lines intersect
	{
		if(compareFromLine(s1.getLine1(), s2) == 0 || compareFromLine(s1.getLine2(), s2) == 0 || compareFromLine(s1.getLine3(), s2) == 0 ||  compareFromLine(s1.getLine4(), s2) == 0)
		{
			return 0;
		}
		else if(compareFromLine(s1.getLine1(), s2) == 1 || compareFromLine(s1.getLine2(), s2) == 1 || compareFromLine(s1.getLine3(), s2) == 1 ||  compareFromLine(s1.getLine4(), s2) == 1)
		{
			return 1;
		}
		return compareFromLine(s1.getLine1(), s2);
	}
	public LineSeg getLine1()
	{
		return line1;
	}
	public LineSeg getLine2()
	{
		return line2;
	}
	public LineSeg getLine3()
	{
		return line3;
	}
	public LineSeg getLine4()
	{
		return line4;
	}
	
	public int compareFromLine(LineSeg l, Shape s) //compares a single line to lines from another shape
	{
		if (comparator.comparePoints(l, s.getLine1()) == 0 || comparator.comparePoints(l, s.getLine2()) == 0 || comparator.comparePoints(l, s.getLine3()) == 0 || comparator.comparePoints(l, s.getLine4()) == 0) //If one line intersects, the quadrilateral itself will collide
		{
			return 0;
		}
		else if(comparator.comparePoints(l, s.getLine1()) == 1 || comparator.comparePoints(l, s.getLine2()) == 1 || comparator.comparePoints(l, s.getLine3()) == 1 || comparator.comparePoints(l, s.getLine4()) == 1) //If one line is collinear and the others don't intersect, the shapes will coincide
		{
			return 1;
		}
		else //No intercept or touching points
		{
			return 2;
		}
	}
}
