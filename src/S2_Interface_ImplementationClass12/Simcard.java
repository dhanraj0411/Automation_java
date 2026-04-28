package S2_Interface_ImplementationClass12;

public interface Simcard
{

    void data();

    void ac();

    default void sms()
    {
        System.out.println("sms: 100");
    }
}
