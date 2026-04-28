package S1_Constructor6;

public class Sample7
{
    int a;
    int b;


    //without parameter constructor
    Sample7()
    {
        a=10;
        b=20;
    }


    //with(2 int) parameter constructor
    Sample7(int num1, int num2)
    {
        a=num1;
        b=num2;
    }


    public void add()
    {
        System.out.println(a+b);
    }


    public static void main(String[] args)
    {
        Sample7 s7=new Sample7();
        s7.add();


        Sample7 s8=new Sample7(5,6);
        s8.add();
    }

}
