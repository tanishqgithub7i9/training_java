public class marks
{
     public static void main(String[]args){
        int sub1=90,sub2=90,sub3=90,sub4=90,sub5=90;
        float num=(sub1+sub2+sub3+sub4+sub5)/5;
       // float avg=num;
        if(num>=90){
          System.out.println("A grade");
        }
        else if (num > 80 && num < 90)
{
             System.out.println("B grade");
        }
        else{
           System.out.println("C grade"); 
        }
     }

}