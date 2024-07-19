class Fib
{
	public static void main(String arg[])
	{
		int a,b,c,n,i;
		a=0;
		b=1;
		n=6;
		for(i=1;i<=n;i++)
		{
                        c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
	}
}