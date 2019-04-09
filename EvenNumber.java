
class EvenNo
{
 public void calculate()
{
	System.out.println("Even Numbers from 1 to 100 are:-");
	
  for(int count=1;count<=100;count++)
  {
    if(count%2==0)
    {
	System.out.println(count);
    }
  }
}

}

class EvenNumber{

public static void main(String args[])
{
EvenNo obj = new EvenNo();
obj.calculate();
}
}