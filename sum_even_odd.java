class sum_even_odd
{
 public static void main(String args[])
{
   long A=34567834, i,rem;
   long sum=0;
   long sum2=0;
   i=A;
  
 while(i!=0)
{
 rem=i%10;
 
  if(rem%2==0)
  sum=sum+rem;
  else
  sum2=sum2+rem;
  i=i/10;
}

   System.out.println("sum of even no = " + sum);
   System.out.println("sum of odd no =" +sum2);
}
}

    
