import java.util.*;
class nthlargest 
{
public static void main(String arg[])
{
Scanner input = new Scanner(System.in); 
int a[] = {14, 67, 48, 23, 5, 62}; 
int len = a.length; 
Arrays.sort(a); 
int N = 4; 
System.out.println(N + " Largest number: " + a[len-N]); 
}
}
