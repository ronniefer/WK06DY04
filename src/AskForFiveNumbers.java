import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AskForFiveNumbers 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numArrayList = new ArrayList<Integer>(5);
		
		int sum = 0;
		int product = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the first number:");
		numArrayList.add(input.nextInt());
		System.out.println("What is the second number:");
		numArrayList.add(input.nextInt());
		System.out.println("What is the third number:");
		numArrayList.add(input.nextInt());
		System.out.println("What is the fourth number:");
		numArrayList.add(input.nextInt());
		System.out.println("What is the fifth number:");
		numArrayList.add(input.nextInt());
		
		for (int i : numArrayList)
		{
			sum += i;
			product *= i;
		}
		
	    int min = Collections.min(numArrayList);
	    int max = Collections.max(numArrayList);

		System.out.println("Sum of numbers in ArrayList is : " + sum);
		System.out.println("Product of numbers in ArrayList is : " + product);
		System.out.println("The smallest number in the ArrayList is : " + min);
		System.out.println("The largest number in the ArrayList is : " + max);
	}

}
