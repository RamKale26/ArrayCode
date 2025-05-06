/*Q7. Find the Common Elements in Two Arrays
Description: Find the common elements between two arrays.

Input: [1, 2, 3, 4], [3, 4, 5, 6]

Output: [3, 4]
*/

import java.util.*;
public class CommanElementApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size :");
		int size=sc.nextInt();
		
		int[] arr1=new int[size];
		int[] arr2=new int[size];
		
		System.out.println("Enter Element in First Array :");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter Element in Second Array :");
		for(int i=0;i<size;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("Comman Element :");
		for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr2.length;j++)
					{
						if(arr1[i]==arr2[j])
							{
								System.out.println(arr1[i]+" ");
								break;
							}
					}
			}
		
	}
}