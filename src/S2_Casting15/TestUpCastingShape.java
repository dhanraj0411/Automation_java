package S2_Casting15;

public class TestUpCastingShape
{
    static void display(Shape s)
    {   // parent reference
        s.draw();
    }

    public static void main(String[] args) {

        display(new Circle());   // upcasting
        display(new Square());   // upcasting
    }
}
