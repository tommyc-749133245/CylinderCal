import java.util.Scanner;
public class CylinderCal 
{

	
	public static void main(String[] args) 
	{
		
		//create a scanner object
		Scanner sc = new Scanner(System.in);
		
		//ask user to enter radius
		System.out.print("Enter radius of cylinder:");
		int r = sc.nextInt();
		
		//ask user to enter height
		System.out.print("Enter height of cylinder:");
		int h = sc.nextInt();
		
		//calculate the surface area
		double surface = 2* Math.PI * r * h;
		
		//display the result of surface area
		System.out.println("Surface area is "+surface);
		
		//calculate the volume
		double Volume = Math.PI * r * r * h;
		
		//display the result of volume
		System.out.println("Volume is "+ Volume );
		
	}

}
