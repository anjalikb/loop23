import java.util.*;
class sum_of_no
{
   public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the value of A");
  long A=34567834;
  long i;
  long rem;
  long sum=0L;
  i=A;
   while(i!=0)
   {
      rem=i%10;
      sum=sum+rem;
      i=i/10;
      
    }
 System.out.println("the sum =" + sum);
}
}