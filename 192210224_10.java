class income{
public static void main(String arg[]){
int income=100000; 
float tax; 
if(income<=150000) 
System.out.println("No tax"); 
else if(income>=150001 && income<=300000) 
System.out.println("Tax= "+income/10); 
 
else if(income>=300001 && income<=500000) 
    System.out.println("Tax= "+income/20); 
else 
    System.out.println("Tax= "+income/30); 
}
}
