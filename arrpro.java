import java.util.*;
public class arrmul
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int A[]=new int  [size];
		for (int i=0;i<size;i++)
		{
		    A[i]=sc.nextInt();
		}
		int pro=1;
		for(int i=0;i<size;i++)
		{
		    pro*=A[i];
		}
		System.out.println(pro);
	}
}