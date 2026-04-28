package S1_Methods2;

public class Sample11
{


    //method with 2 String parameter (String, String) parameter
    public static void studentFullName(String fn,String ln)     //fn=abc2, ln=xyz2
    {
        System.out.println("Firstname: "+fn);
        System.out.println("lastname: "+ln);
    }




    public static void studentInfo(String name,int rollNum,float per,char grade)
    {
        System.out.println("Student Name:-"+name);
        System.out.println("Student Roll Num:-"+rollNum);
        System.out.println("Student Percentage:-"+per);
        System.out.println("Student Grade:-"+grade);
    }




    public static void main(String[] args)
    {
        studentFullName("Dhanraj","Patil");

        System.out.println("-------------------");

        studentInfo("Dhanraj",23,65.1f,'A');


    }

}
