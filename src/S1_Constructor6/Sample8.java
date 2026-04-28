package S1_Constructor6;

public class Sample8
{
    int a;
    int b;

    Sample8(int no1,int no2)
    {
        a=no1;
        b=no2;
    }

    public void add()
    {
        System.out.println(a+b);

    }

    public static void main(String[]args)
    {
        Sample8 s8=new Sample8(15,20);
        s8.add();

    }
}
