class Fibonacci
{
	public static void main(String arg[])
	{
		int a=0,b=1,c,i;
		for(i=0;i<=5;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}