class PalindromeOrNot
{
	public static void main(String arg[])
	{
		int n,rev=0,rem,m;
		n=121;
		m=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(m==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
		