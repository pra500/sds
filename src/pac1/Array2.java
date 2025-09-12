package pac1;

import java.util.Arrays;

public class Array2 {
	
	public static void main(String[] args) {		
				
		
		//adding elements of an array
		//multi dim array
									
		
		
		//adding elements of an array		
		
	/*	
int[] arr= {4, 8, 9};
int  sum=0;

for(int i=0;i<arr.length;i++)
{
		
	sum = sum+ arr[i];
		
}
	
System.out.println(sum);  //21
	
*/
		
		
		
		
		
		
//multi dim array	
//0, 0 - need to check again		

		/*
int[][] arr= {
		
		{1, 5, 6, 12},
		{7, 10, 2, 11},
		{11, 9, 4, 30}		
		
			
};

System.out.println(arr[2][3]);  //30

System.out.println("----------");

for(int i=0;i<arr.length;i++)
{
	for(int j=0; j<arr[i].length;j++)
	{
		System.out.println(arr[i][j]); 
	}
}

*/
		

	
		
		
		
//Arrays.equals:
//same order/same content 
//can be used with any data type -  int[], char[], String[]
		
		
int[] arr= {8, 12, 89};
int[] arr1= {8, 12, 89};
int[] arr2= {3, 6, 9};



boolean b =Arrays.equals(arr,  arr1);
System.out.println(b);  //true 


boolean b1 =Arrays.equals(arr,  arr2);
System.out.println(b1);  //false




String[] s1= {"ll", "hj", "yu"};
String[] s2= {"ll", "hj", "yu"};

boolean b2=Arrays.equals(s1,s2);   
System.out.println(b2);  //true























	












//
//
//boolean b2 =Arrays.equals(arr,  arr1);
//System.out.println(b1);
//














	






		
		
		










	}

}
