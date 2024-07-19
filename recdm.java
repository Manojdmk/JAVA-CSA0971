import java.util.*;
class Vote
{
	public static void main(String arg[]){
		int age,eligibleafter=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		age=sc.nextInt();
		if(age>=18){
			System.out.println("eligible for vote");
		}else{
			System.out.println("not eligible");
			eligibleafter=18-age;
			System.out.println("eligible after " + eligibleafter + " years");
		}
		}
}