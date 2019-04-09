import java.util.Scanner;


class PyramidStarPattern
{
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the length:-");
	int length = scan.nextInt();

for(int row=0;row<length;row++)
{
	for(int colomn =length-row; colomn >1;colomn--)
	{
		System.out.print(" ");
	}
	
	for(int colomn=0;colomn <=row;colomn++)
	{
		System.out.print("* ");
	}
	
	System.out.println("");

}

}

}