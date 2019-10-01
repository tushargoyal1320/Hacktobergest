import java.util.*;
public class fibonacci
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int lim=sc.nextInt();
	    int a=0,b=1;
	    int c=0;

	    Sytem.out.println(a);
	    Sytem.out.println(b);

	    for(int i=0;i<lim-2;i++)
	    {
	    	c=a+b;
	    	Sytem.out.println(c);
	    	a=b;
	    	b=c;

	    }