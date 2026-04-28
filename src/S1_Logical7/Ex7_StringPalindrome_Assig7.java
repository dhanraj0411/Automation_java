package S1_Logical7;

public class Ex7_StringPalindrome_Assig7
{
    public static void main(String[]args)
    {
        String org="Dhanraj";  //madam,cdc
        String rev="";

        for(int i=org.length()-1; i>=0; i--)
        {
            rev=rev+org.charAt(i);
        }

        System.out.println(rev);

        if(org.equals(rev))
        {
            System.out.println("Given String is Palindrome");
        }
        else
        {
            System.out.println("Given String is Not Palindrome");
        }
    }
}
