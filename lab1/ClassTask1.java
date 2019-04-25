/* 10000 – 20000 Manager Operations
 20000 – 30000 Manager
 30000 – 40000 Area Manager
 40000 – 50000 Regional Manager*/
class ClassTask1
{
	public static void main(String[] args) 
	{
		int salary=25000;
		if (salary>10000 && salary<=20000) 
		{
			System.out.println("Manager Operations");
		}
		if (salary>20000 && salary<=30000) 
		{
			System.out.println("Manager");
		}
		if (salary>30000 && salary<=40000) 
		{
			System.out.println("Area Manager");
		}
		if (salary>40000 && salary<=50000) 
		{
			System.out.println("Regional Manager");
		}
	}
}