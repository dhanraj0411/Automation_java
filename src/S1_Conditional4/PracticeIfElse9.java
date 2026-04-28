package S1_Conditional4;

public class PracticeIfElse9
{
    public static void main(String[] args)
    {
        String user = "admin";
        String pass = "1234";

        if (user.equals("admin") && pass.equals("1234"))
        {
            System.out.println("Login successful");
        } else
        {
            System.out.println("Invalid credentials");
        }


    }
}
