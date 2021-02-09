package Test;

import java.util.Scanner;

public class TestUSN {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		System.out.println(testUsn(number));
		System.out.println("hellooooo");
		System.out.println("welcome");
		System.out.println("mindtree.com");
	}
	 public static String testUsn(String number) {
		String positive = "Success";
		String negative = "Failure";
		
		{
			if( number.charAt(0)=='1'||number.charAt(0)=='2' ) 
			{
			if(number.charAt(1)>='A'&& number.charAt(1)<='Z')
			{
			if(number.charAt(2)>='A'&& number.charAt(2)<='Z') {
				
			if(number.charAt(3)>='0'&& number.charAt(3)<='9')
			{
			
			if(number.charAt(4)>='0'&& number.charAt(4)<='9')
			{

			if((number.charAt(5)=='C'&& number.charAt(6)=='S')||
			   (number.charAt(5)=='M'&& number.charAt(6)=='E')||
			   (number.charAt(5)=='I'&& number.charAt(6)=='S')||
			   (number.charAt(5)=='E'&& number.charAt(6)=='C'))
			{
		
			if(number.charAt(7)>='0'&& number.charAt(7)<='9')
			{
				
			if(number.charAt(8)>='0'&& number.charAt(8)<='9')
			{
				
			if(number.charAt(9)>='0'&& number.charAt(9)<='9')
			{
				return positive;
		    }
			
			}
		    }
	        }
			}
			}
			}
			}
			}
		    } return negative;
	 }
}
