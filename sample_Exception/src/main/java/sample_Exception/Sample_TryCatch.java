package sample_Exception;

public class Sample_TryCatch {

	public void divideByZero()
	{
		int a=10;
		try
		{
		System.out.println("Value divided by 0 : "+(a/0)); //exception
		}
		catch(ArithmeticException obj2)
		{
			System.out.println("Show the exception happened");
			System.out.println(obj2);
		}
		
	 }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Sample_TryCatch obj=new Sample_TryCatch();
		obj.divideByZero();
	}

}
