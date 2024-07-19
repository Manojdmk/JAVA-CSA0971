import java.util.*;
class oddoreven{
	public static void main(String arg[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		n=sc.nextInt();
		if(n%2==0){
			System.out.println("even number");
		}
		else{
			System.out.println("odd number");
		}
	}
}