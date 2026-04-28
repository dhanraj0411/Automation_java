package S2_Casting15;
public class TestUpCastingFath
{

   public static void main(String[] args) {
    //Create object of Sub class with ref/dataType of super class - up Casting
       Father f = new Son();
       f.car();
       f.money();
       f.home();
//      f.mobile();
   }
}

