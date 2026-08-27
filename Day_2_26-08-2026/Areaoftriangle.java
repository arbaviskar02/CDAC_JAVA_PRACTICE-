//Write A program to calculate area of triangle,rectangle.
import java.util.*;
public class Areaoftriangle {

	public static void main(String[] args) {
		int choice;
		double base,height,length,width;
		System.out.println("\nENTER YOUR CHOICE 1. FOR AOT \n 2. FOR AOR: ");
		Scanner object = new Scanner(System.in);
		choice = object.nextInt();
		switch(choice)
		{
		case 1:
					System.out.println("enter Dimensions for triangle(Base and Height) : ");
					base= object.nextDouble();
					height= object.nextDouble();
					double aot = (double)(0.5*(base*height));
					System.out.println("The Area of Triangle is : " + aot);
					break;
		case 2:
			System.out.println("enter Dimensions for Rectangle(Length and Width) : ");
			length= object.nextDouble();
			width= object.nextDouble();
			double aor = (double)(length*width);
			System.out.println("The Area of Rectangle is : " + aor);
			break;
					
				
	}

}
}
