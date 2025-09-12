package pac1;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {

		/*
		int[] arr = { 6, 9, 10, 2, 4, 67, 33 };

		Arrays.sort(arr);

		for (int i : arr) {
			System.out.println(i);

		}
		
		
				
		System.out.println("--------");

		int[] arr1=Arrays.copyOf(arr, 7);
		
		for(int k:arr1)
		{
			System.out.println(k);
		}
		*/
		
		
		/*
		
		System.out.println("--------");
	
		//converting an array to string:
		
		//it can be used with any datatype
		
		

		int[] arr= {4, 8, 12, 6};		
		
		String s=Arrays.toString(arr);
		
		System.out.println(s);   //[4, 8, 12, 6]
		
	

		
		char[] as= {'k', 'l', 'm'};
		
	String sss=Arrays.toString(as);	
	
	System.out.println(sss);       //[k, l, m]

	
	*/
		
		
		
	
	//largest number in a array:
	
	
		
		int lar=ArrayPractice.largest();	
		System.out.println(lar); //89     
	}

		
	
	
public static int largest()
{	
	
	int[] arr= {7, 1, 45, 89};
			
	int c=arr[0];
		
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]> c)
		{
			
			 c=arr[i];
		}
				
	}
	
	return c;
		
}











//




}
	
	
	
	


	
	
	 
	
	
	
			
		
		
		
		
		
	


