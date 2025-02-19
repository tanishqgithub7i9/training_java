class Calculater
{
        int add(int a,int b)
        {
        return a+b;
        }
         int add(int a,int b,int c)
         {
        return a+b+c;
         }
        double add(double a,double b)
        {
          return a+b;
        }
}
public class inherit2
{
    public static void main(String args[])
    {
        Calculater cals=new Calculater();
        System.out.println(cals.add(5,10));
        System.out.println(cals.add(5,10,15));
        System.out.println(cals.add(5.5,2.5));
    }
}