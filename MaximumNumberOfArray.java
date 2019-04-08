import java.util.Scanner;


class MaximumNumberOfArray
{

public static void main(String args[])
{

int max, length;

Scanner s = new Scanner(System.in);

System.out.print("Enter no of elements in array:-");
length= s.nextInt();

int array[] = new int[length];
System.out.println("Enter elements of array:-");

for(int count=0;count<length;count++)
{
array[count] = s.nextInt();
}

max = array[0];
for(int count=0;count<length;count++)
{
	if(array[count]>max)
	{
		max= array[count];
	}
	
}

System.out.println("Largest Number present in an array is:-"+max);

}
}