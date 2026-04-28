package S1_Methods2;

public class Sample9
{
    //without parameter
//    public static void add()
//    {
//        int num1=100;
//        int num2=200;
//        System.out.println(num1+num2);
//    }


    //with parameter (2 int parameter)
    public static void add(int num1, int num2)      //num=10, num=20
    {
        System.out.println(num1+num2);       //10+20=30
    }


    //with parameter (1 int parameter)
    public void squareOfNum(int num)     //num=5
    {
        System.out.println(num*num);       //5*5=25
    }


    public static void main(String[] args)
    {
        add(10,20);

        System.out.println("-----");

        Sample9 s9=new Sample9();
        s9.squareOfNum(5);

        System.out.println("------------------------------");

        Sample10.sub(80,65);

        Sample10 s10=new Sample10();
        s10.div(60,20);



    }

}
