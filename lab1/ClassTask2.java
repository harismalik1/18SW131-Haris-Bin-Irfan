/*Generate a series of Odd number and even number using for and
while loop.*/
class ClassTask2
{
	public static void main (String args[])
	{
		System.out.println("Even Number");
		for (int i=0;i<=40;i+=2) 
		{
			System.out.print(i+",");
		}
		System.out.println();
		System.out.println("Odd Number");
		for (int j=1;j<=40;j+=2) 
		{
			System.out.print(j+",");
		}
	}
}