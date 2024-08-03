import java.util.*;
class find
{
    public static void main(String args[])
    {
        int i,j;
        int[] data1=new int[5];
        int[] data2=new int[5];
        Scanner S=new Scanner(System.in);
        System.out.println("enter the array1");
         for(i=0;i<5;i++)
        {
            data1[i]=S.nextInt();
    }
    System.out.println("enter the values of array2");
    for(j=0;j<5;j++)
    {
        data2[j]=S.nextInt();
    }
    for(i=0;i<5;i++)
    {
        for(j=0;j<5;j++)
        {
            if(data1[i]==data2[j])
            {
                System.out.println(data1[i]+"is common");
                break;
            }
        }
    }
}
}
