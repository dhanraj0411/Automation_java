package S1_TypesofVariable5;

public class sample1
{
    int num3=30;           // global variable


    public void m1()
    {
        int num1=10;                      //local variable
        System.out.println(num1);    //10
        System.out.println(num3);    //30
    }


    public void m3()
    {
//        System.out.println(num1);    //no access
//        System.out.println(num2);    //no access
        System.out.println(num3);      //30
    }


    public static void main(String[] args)
    {
        sample1 s1=new sample1();
        s1.m1();
        s1.m3();
    }
}


