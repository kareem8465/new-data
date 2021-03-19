public class LeapYear
{
pulic static void main(String args[])
{
int year=2400;
if(year%400==0)
{
System.out.println("It is a leap year");
}
else if(year%4==0 && year%100!=0)
{
System.out.pritln("It is a leap year");
}
else
{
System.out.println("Not a leap year");
}
}
}
