import java.util.*;
class vote{
	public static void main(String arg[]){
		int age,eligibleafter;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age:");
		age=sc.nextInt();
		if(age>=18){
			System.out.println("eligible to vote");
		}else{
			System.out.println("not eligible to vote");
			eligibleafter=18-age;
			System.out.println("eligible after: "+eligibleafter+ " years");
		}
	}
}