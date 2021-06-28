import java.util.Arrays;
import java.util.Scanner;

public class AskForFiveNumbers 
{
	public static void main(String[] args)
	{
		int numArray[] = new int[5];
		int sum = 0;
		int product = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the first number:");
		numArray[0] = input.nextInt();
		System.out.println("What is the second number:");
		numArray[1] = input.nextInt();
		System.out.println("What is the third number:");
		numArray[2] = input.nextInt();
		System.out.println("What is the fourth number:");
		numArray[3] = input.nextInt();
		System.out.println("What is the fifth number:");
		numArray[4] = input.nextInt();
		
		for (int i : numArray)
		{
			sum += i;
			product *= i;
		}
		
		Arrays.sort(numArray);
		
	    int min = numArray[0];
	    int max = numArray[numArray.length-1];

		System.out.println("Sum of numbers in Array is : " + sum);
		System.out.println("Product of numbers in Array is : " + product);
		System.out.println("The smallest number in the Array is : " + min);
		System.out.println("The largest number in the Array is : " + max);
	}

}
