package sample_Exception;

public class Sample_TryMultipleCatch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Sample_TryMultipleCatch.arraySample();
		Sample_TryMultipleCatch.add();
      
	}
	public static void arraySample()
	{
		 int[]arr= {1,2,3,4,5};
	      try {
	      System.out.println(arr[5]);
	      }
	      
	      catch(ArithmeticException obj1)
	      {
	    	  System.out.println(obj1);  
	      }
	      catch(ArrayIndexOutOfBoundsException obj2)
	      {
	    	System.out.println(obj2);  
	      }
	      catch(Exception obj3)  // this exception can be handled by any type of exception
	      {
	    	  System.out.println(obj3);
	      }
	}
	public static void add()
	{
		System.out.println("10+20 = "+(10+20));
	}

}
