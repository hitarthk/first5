package first;

import java.util.Arrays;
import java.util.Scanner;

public class jersy 
{
	public static void main(String[] args)
	{
		new jersy().start();
	}
	public void start()
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		int c=0;
		long ans=0L;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(i==0)
			{
				ans+=arr[0];
				break;
			}
			ans+=arr[i];
			if(arr[i-1]==arr[i])
			{
				c++;
			}
			else
			{
				i-=(c+1);
				c=0;
			}
		}
		System.out.println(ans);
	}

}
