package S1_Logical7;
public class Ex11_ArmstrongNumber_Assig8
{ public static void main(String[] args)
    {
        for (int num = 100; num <= 999; num++)
        {
            int orgNum = num;
            int sum = 0;
            while (num > 0)
            {
                int rem = num % 10;
                sum = sum + (rem * rem * rem);
                num = num / 10;
            }
            if (sum == orgNum)
            {
                System.out.println(orgNum);
            }
            num=orgNum;
        }
    }
}
