/*
 * Note: I've decided to use Java to do this program as it
 * is more rigorous in its OOP capabilities and simpler to
 * go through.
 * Author: Owen S.
 * 
 */
import java.util.*;
public class Detection {

	public static void main(String[] args)
	{
		Shape shape1, shape2, shapeComp; //Quadrilateral shapes for comparison and additional shape method
		shapeComp = new Shape();
		//Note: Concave option will not detect coincidence, can only judge collision
		Scanner s = new Scanner(System.in);
		System.out.print("Please Refer to \"readme.txt\" for input format\nEnter X Y Coordinates of First Convex Quadrilateral in Connected Order Separated by Spaces: ");
		String[] input = s.nextLine().split(" "); //Cleans the inputted data for later grouping
		int [] coord1 = new int[8];
		for(int i = 0; i < coord1.length; i++)
		{
			coord1[i] = Integer.parseInt(input[i]);
		}
		shape1 = new Shape(coord1);
		System.out.print("Enter X Y Coordinates of Second Convex Quadrilateral in Connected Order Separated by Spaces: ");
		input = s.nextLine().split(" ");
		int [] coord2 = new int[8];
		for(int i = 0; i < coord1.length; i++)
		{
			coord2[i] = Integer.parseInt(input[i]);
		}
		shape2 = new Shape(coord2);
		switch(shapeComp.compareShapes(shape1, shape2))
		{
			case 0:
				System.out.println("Collided");
				break;
			case 1:
				System.out.println("Coincide");
				break;
			case 2:
				System.out.println("Apart");
				break;
		}
		s.nextLine();
	}

}
