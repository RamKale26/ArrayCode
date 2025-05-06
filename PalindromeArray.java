/*Q9. Check if Array is Palindrome
Description: Check if an array is the same when reversed.

Input: [1, 2, 3, 2, 1]

Output: Palindrome
*/

import java.util.*;
public class PalindromeArray
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Array Size :");
		int size=sc.nextInt();
		
		int[] a =new int[size];
		
		System.out.println("Enter Element Array :");
		for(int i=0;i<size;i++)
			{
				a[i]=sc.nextInt();
			}
		
		boolean isPalindrom=true;
			{
				for(int i=0;i<size/2;i++)
					{
						if(a[i]!=a[size-1-i])
							{
								isPalindrom=false;
								break;
							}
					}
					if(isPalindrom)
						{
							System.out.println("It is Palindrom");	
						}
					else
						{
							System.out.println("It Not Palindrom");
						}
			}
	
	}
}