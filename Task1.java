class Task1
{
	public static void main(String args[])
	{
		String name="Samiullah";
		int total_marks=95;
		byte b=(byte)total_marks;
		long obtained_marks=84;
		short i=(short)obtained_marks;
		double Percentage=(obtained_marks*100/total_marks);
		float f=(float) Percentage;        //The type cast causes an explicit conversion. 

		System.out.println("Name: "+ name);
		System.out.println("Total Marks: " + b);
		System.out.println("Obtained Marks: " + i);
		System.out.println("Percentage: " + f);

		if(f>=75 && f<85)
		{
			char Grade='C';
		System.out.println("Grade: "+ Grade);	
		}
		if(f>=85 && f<95)
		{
			char Grade='B';
			System.out.println("Grade: "+ Grade);
		}
		if (f>=95)
		{
			char Grade='A';
			System.out.println("Grade: "+ Grade);
		}

		if(f>=75)
		{
			boolean t=true;
			System.out.println("Status: you have passed");
		}
		if(f<75)
		{
			boolean y=false;
			System.out.println("Status: you have failed");
		}
    }
}