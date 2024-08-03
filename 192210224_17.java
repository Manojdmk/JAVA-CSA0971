import java.util.*;
class binary
{
public static void main(String arg[])
{
Scanner input=new Scanner(System.in); 
String bin=input.nextLine(); 
int dec=Integer.parseInt(bin,2); 
System.out.println("Decimal: "+dec); 
String oct=Integer.toOctalString(dec); 
System.out.println("Octal: "+oct);
}
}
