/* Q6. Find the Second Largest Element in Array
Description: Find the second largest element in an array.

Input: [10, 20, 30, 40, 50]

Output: 40
*/

import java.util.Scanner;
public class SecondLargestApp 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter Elements:");
        for (int i = 0; i < size; i++) 
		{
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 1; i < size; i++) 
		{
            if (arr[i] > largest) 
			{
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == -1) 
		{
            System.out.println("No second largest element (all elements may be equal).");
        } else {
            System.out.println("Second Largest Element: " + secondLargest);
        }
    }
}
