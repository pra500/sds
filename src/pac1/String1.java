package pac1;

public class String1 {

	public static void main(String[] args) {
		
		/*
		// TODO Auto-generated method stub
		
		//print only disits in a string

		String str="piorTU78kl";
		
		int count=0;

		for(int i=0;i<=str.length()-1;i++)

		{

		    if(str.charAt(i)>=0 && str.charAt(i)<=9)
		    {

		        System.out.println(str.charAt(i));
		        count++;

		    }

		}

System.out.println(count);
		
*/	
		
		//length starts 1, index 0    in string and array
		
		
		//substring:	
		
		
		/*
		String str="hello world";		
	String st=str.substring(3);		
		System.out.println(st);    //lo world
		
		
		String st1=str.substring(4, 9);  //o wor
		System.out.println(st1);
		
		

		String st3=str.substring(12, 14);
		System.out.println(st3);             //java.lang.StringIndexOutOfBoundsException:   ll come
		
		
		
		
		String str11="parul good";
		String st2=str11.substring(4, 4);  
		System.out.println(st2);              //empty string ll come   ""
		*/
		
		
		
		
		
		//very imp:
		
		
		/*
		 		
		String str="";
		int t=str.length();
		System.out.println(t);  //0
		
		
		String str111=" ";
		int t1=str111.length();
		System.out.println(t1);  //1
		
		*/
			
		
		
		
		
						
		
		//3 pgm's:
		
		// print vowels in a string		
		
		
		/*
		
		String str="pragtiossdeuYUBAE";
		
	String ss=str.toLowerCase();
		
		int count=0;		
		
		for(int i=0;i<=ss.length()-1;i++){
			
			
			if(ss.charAt(i)== 'a' || ss.charAt(i)== 'e' || ss.charAt(i)== 'i' || ss.charAt(i)== 'o' ||
					ss.charAt(i)== 'u')			
			{
				System.out.println(ss.charAt(i));  //aioeuUAE
				count++;
				
			}		
					
		}			
		
		System.out.println(count);	   //8
						
			
		*/			
			
			
		
		
		
		
		// print disits in a string	
		
		/*
		
		String str="po90ThJK";
		
		int count =0;
				
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				System.out.println(str.charAt(i));
				count++;
			}
		}
		
		
		System.out.println(count);	
		
			
		*/
		
		
		
		// print consonant in a string		
				
		String str="paiTYUjkio";
	    String ss1=	str.toLowerCase();
		
		int count=0;
		
		
		for(int i=0;i<=str.length()-1;i++)
		{
			
			if(ss1.charAt(i) != 'a' || ss1.charAt(i)!= 'e' || ss1.charAt(i)!= 'i' || ss1.charAt(i)!= 'o' ||
					ss1.charAt(i)!= 'u')	
			{
							
				System.out.println(ss1.charAt(i));
				count++;				
				
			}			
						
		}
		
		
		
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
