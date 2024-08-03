import java.util.*;
class pri extends Thread{
public void run(){
int n=10;
int count=0;
for(int i=1;i<=n;i++){
if(n%i==0){
count++;
}
}
if(count==2){
System.out.println("prime number");
}
else{
System.out.println("not prime number");
}
}
}
public class threadprime{
public static void main(String arg[]){
pri p1=new pri();
pri p2=new pri();
p1.start();
p2.start();
}
}
