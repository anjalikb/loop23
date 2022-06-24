import java.util.*;
class sum_of_no
{
   public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the value of A");
  long i=1;
  long sum=0;
   while(i!=0)
   {
   
      sum=sum+i;
      i=sc.nextLong();
    }
 System.out.println("the sum =" + sum);
}
}