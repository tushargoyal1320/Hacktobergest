import java.util.*;
public class arrsum
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int A[]=new int  [];
		for (int i=0;i<size;i++)
		{
		    A[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++)
		{
		    sum+=A[i];
		}
		System.out.println(sum);
	}
}