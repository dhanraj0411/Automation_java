package S1_Conditional4;

public class PracticeNestedIf15
{
    public static void main(String[] args)
    {
        int balance = 5000;
        int withdrawAmount = 2000;

        if (balance >= withdrawAmount)
        {
            if (withdrawAmount % 100 == 0)
            {
                System.out.println("Transaction successful");
            }
        }


    }
}
