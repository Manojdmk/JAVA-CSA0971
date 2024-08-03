import java.util.*;
class multiplication 
{
	public static void main(String arg[]){
	int n,i,mul;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of n:");
	n=sc.nextInt();
	for(i=1;i<=10;i++){
	mul=i*n;
	System.out.println(i+"*"+n+"="+mul);
		}
	}
}
