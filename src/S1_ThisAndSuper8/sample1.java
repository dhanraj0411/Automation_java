package S1_ThisAndSuper8;

public class sample1 extends sample
{
      int num1=20;

    public void m1()
    {
        int num1=10;
        System.out.println(num1);
        System.out.println(this.num1);
        System.out.println(super.num1);

    }

    public static void main(String[]args)
    {
        sample1 d1=new sample1();
        d1.m1();
       System.out.println(d1.num1);

    }
}
