package S1_ThisAndSuper8;

public class Sample3
{

        int x;   // Global variable

        // constructor
        Sample3(int x)
        {
            this.x = x;     // access current class Global variable
        }

        void show()
        {       // Global method
            System.out.println(x);
        }

        void display()
        {
            this.show();   // access current class method
        }

        public static void main(String[] args)
        {
            Sample3 s3 = new Sample3(10);  // constructor call
            s3.display();
        }


}
