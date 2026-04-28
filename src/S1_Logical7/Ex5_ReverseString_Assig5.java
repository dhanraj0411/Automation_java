package S1_Logical7;

public class Ex5_ReverseString_Assig5
{
    public static void main(String[] args)
    {
        String org="Dhanraj";
        String rev="";

        for(int i=org.length()-1; i>=0; i--)
        {
            rev=rev+org.charAt(i);
        }

        System.out.println(org);
        System.out.println(rev);
    }
}
