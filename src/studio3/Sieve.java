package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		System.out.print("Enter in a number n: ");
		int n = in.nextInt();
		int[] values = new int[n];
		for(int i = 0; i < n; i++)
		{
			values[i] = i+2;
		}
		
		boolean [] primeNumber = new boolean[n];
		for(int i = 0; i < n; i++)
		{
			primeNumber[i] = true;
		}
		
		System.out.println();
		
		for(int i = 2; i < Math.sqrt(n); i++)
		{
			if(primeNumber[i] == true)
			{
				for(int j = i*i; j < n; j+= i)
				{
					primeNumber[j] = false;
				}
			}
		}
		
		
		for(int i = 0; i < n; i++)
		{
			if(primeNumber[i] == true)
			{
				System.out.print(i +" ");
			}
			
		}
			

	}

}
