import java.util.*;

class year3
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Principle Amount : ");
double a = sc.nextDouble();
System.out.print("Enter Rate of Interest : ");
double r = sc.nextDouble();
double t = 4;
int i = 1;
while(i<=3)
{
if(i==1)
{
System.out.println("Year 1 :");
double si = (a*r*1)/100;
System.out.println(" Amount is = " +a);
System.out.println("Rate is= " +r);
System.out.println("Time is = " +t);
System.out.println("Interest is = " +si);
double pay = a+si;
System.out.println(" Total payable amount = " +pay);
				
}

else if(i==2)
{
System.out.println("Year 2 :");
double si = (a*r*2)/100;
System.out.println(" Amount is = " +a);
System.out.println("Rate is = " +r);
System.out.println("Time is = " +t);
System.out.println("Interest is = " +si);
double pay = a+si;
System.out.println("Total payable amount = " +pay);

}	
	
else if(i==3 )
{
System.out.println("Year 3 :");
double si = (a*r*3)/100;
System.out.println(" Amount is = " +a);
System.out.println("Rate  is = " +r);
System.out.println("Time is = " +t);
System.out.println("Interest is = " +si);
double pay = a+si;
System.out.println("Total payable amount = "+pay);
}
i++;
}
}
}
