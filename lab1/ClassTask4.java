/*Calculate factorial when a number is supplied on runtime.*/
class ClassTask4
{
	public static void main(String[] args) 
	{
		int fact=1;
		for(int i=1;i<=6;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial: "+fact);
	}
}