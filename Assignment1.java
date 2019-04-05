
class Arithmetic{
	
	void square(float value)
	{
		System.out.println("Square of number is"+(value*value));
	}
	
	void addition(int num)
	{
		System.out.println("Addition is-->"+(num+num));
	}
	
    void addition(double num1, double num2)
	{
		System.out.println("Addition is-->"+(num1+num2));
	}
}

class Assignment1
{
public static void main(String args[])
{
int number = 10 ;
String Var = "20";

number =Integer.parseInt(Var);

System.out.println("Typecasting of Var is :"+number);

Arithmetic obj = new Arithmetic();
obj.square(23.09f);
obj.addition(78);
obj.addition(1020.00d,34654.78d);
}

}