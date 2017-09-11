package test;
import java.util.Scanner;
public class GitBucketTestClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number from 0-10");
		int i = sc.nextInt();
		if(i<0||i>10)
		{
			System.out.println("Enter with in range from 0-10");
			
		}
		else
		{
			if(i%2==0) 
				System.out.println("Even " + i);
			else
				System.out.println("Odd "+ i);
		}
	}
	

}
