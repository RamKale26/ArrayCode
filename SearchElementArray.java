import java.util.*;
public class SearchElementArray
{
   public static void main(String x[])
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of Array");
	int size=sc.nextInt();
	int a[]=new int[size];
	
	System.out.println("Enter Values in Array");
	
	for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	System.out.println("Serch element in Array");
	int skey=sc.nextInt();
	int index=-1;
	
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==skey)
			{
				index=i;
			}
		}
		if(index!=-1)
		{
			System.out.println("Search Element Found");
		}
		else{
			System.out.println("Search Element Not Found");
		}
	}
   }
}