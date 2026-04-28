package S1_Logical7;

public class Ex6_ReverseNumber_Assig6
{
   public static void main(String[]args)
   {
       int orgNum=777009409;
       int revNum=0;
       for(int i=orgNum; i>0; i=i/10)
       {
           int rem=i%10;
           revNum=revNum*10+rem;
       }
       System.out.println(orgNum);
       System.out.println(revNum);

       System.out.println("----***------");
       //logic 1:get last digit from org NUm
       int rem=orgNum%10;
       System.out.println(rem);

       System.out.println("----***------");
       //logic 2:remove last digit from org Num
       orgNum=orgNum/10;
       System.out.println(orgNum);
    }
}
