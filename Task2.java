class Task2
{
	public static void main(String[] args) 
	{
		double num=50.25;
		long l=(long) num;// For integral part
		double d=num-l;
		System.out.println("Actual No is: " + num);
		System.out.println("Integral Part is: " + l);
		System.out.println("Fractional Part is: "+ d );
	}
}