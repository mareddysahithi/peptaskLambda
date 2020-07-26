package com.peptask.Lambda_Exp;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
	interface average
	{
		public float avg();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		average a=()->{
			System.out.println("Enter no of elements");
			int n=sc.nextInt();
			ArrayList<Integer> a1=new ArrayList<Integer>();
			System.out.println("Enter"+n+" elements");
			for(int i=0;i<n;i++)
			{
				int z=sc.nextInt();
				a1.add(z);
			}
			int s=0;
			for(Integer i:a1)
			{
				s=s+i;
			}
			float AvgOfList=(float)(s)/a1.size();
			return AvgOfList;
		};
		System.out.println("Average of the list of given integers are:"+a.avg());
		sc.close();
	}
}
