package S3_Array16;

import java.util.Arrays;

public class StringArray_Sorting
{
    public static void main(String[] args)
    {
        String [] ar=new String[6];

        ar[0]="Amol";
        ar[1]="Dhanraj";
        ar[2]="Aadesh";
        ar[3]="Saurabh";
        ar[4]="Vijay";
        ar[5]="Ashish";


        System.out.println("--**--Original--**--");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);

        }

        Arrays.sort(ar);
        System.out.println("--**--Ascending--**--");
        for (int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);

        }

        System.out.println("--**--Descending--**--");
        for(int i=ar.length-1; i>=0; i--)
        {
            System.out.println(ar[i]);
        }


    }
}
