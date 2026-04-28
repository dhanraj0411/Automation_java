package S2_Casting15;

public class TestUpCastingVehical
{
    public static void main(String[] args)
    {

        Vehicle v1 = new Car();// upcasting

        v1.speed();

        System.out.println("--**--**--**--**--");

        Vehicle v2 = new Bike();  // upcasting

        v2.speed();

    }
}
