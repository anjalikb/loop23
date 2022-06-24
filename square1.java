import java.util.*;
class square1
{
  public static void main(String args[])
 {
  int count1,count2;
  int sum=0;
  count1=0;
  count2=0;
  int i=201;
  int s1=0;
 
 while(n<=400)
{
if(n%2==0)
{
sum=n+sum;
count1++;
}
else
{
s1=n+s1;
count2++;
}
i++
}
System.out.println("total even no="+sum);
System.out.println("total odd no="+s1);
int difference=sum-s1;
System.out.println("difference="+difference);
System.out.println("count total even no=" +count1);
System.out.println("count total odd no="+count2);
}
}
