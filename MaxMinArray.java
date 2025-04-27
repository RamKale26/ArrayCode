import java.util.*;
public class MaxMinArray
{
   public static void main(String x[])
        {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array of Size :");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter Number In Array");
	for(int i=0; i<a.length; i++)
	{
		a[i]=sc.nextInt();
	}
	int max=a[0],min=a[0];
	for(int i=0; i<a.length; i++)
	{
		if(a[i]>max)
	     {
		max=a[i];
	     }
	System.out.println(" "+a[i]);
	}
	System.out.println("Maximum Number is :"+max);

	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	
        }System.out.println("Minimun Number Is :"+min);
	
     }
  }
