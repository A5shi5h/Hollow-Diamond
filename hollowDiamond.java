package practice;

import java.util.Scanner;

public class hollowDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any odd number : ");
		int n = sc.nextInt() ;
		int half = n/2;
		int right = half;
		int left = half;
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				if(j == right || j == left ) 
				{
				 System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
				if(i < half)
				{
					right++;
					left--;
				}
				else
				{
					right--;
					left++;
				}
			System.out.println();
		}
	}
}
