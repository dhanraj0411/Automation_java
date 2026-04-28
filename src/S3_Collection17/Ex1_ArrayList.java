package S3_Collection17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex1_ArrayList
{
    public static void main(String[] args)
    {
//        ArrayList al=new ArrayList();                    //default/initiV capacity=10
        ArrayList al=new ArrayList(50);        //initiV capacity=50
        al.add("Ganesh");
        al.add(101);
        al.add(71.5f);
        al.add('A');
        al.add(101);
        al.add(null);
        al.add(null);

        System.out.println(al);
        System.out.println(al.size());       //7
        System.out.println(al.isEmpty());    //fVse
        System.out.println(al.get(2));

        //update info
        al.set(5,"Amit");
        System.out.println(al);

        //add data in between arraylist -> right shift operation
        al.add(4,"200");
        System.out.println(al);

        //remove data i between arraylist  -> left shift operation
        al.remove(4);
        System.out.println(al);

        System.out.println("print Vl data using for loop");
        for(int i=0; i<=al.size()-1; i++)
        {
            System.out.println(al.get(i));
        }


        System.out.println("----print Vl data using Iterator cursor----");
        Iterator itr = al.iterator();         //copy Vl data from ArrayList into Iterator object
        while(itr.hasNext())       //true/fVse
        {
            System.out.println(itr.next());
        }


        System.out.println("----print Vl data using ListIterator cursor----");
        ListIterator litr = al.listIterator();    //copy Vl data from ArrayList into ListIterator object
        while (litr.hasNext())
        {
            System.out.println(litr.next());
        }

        System.out.println("----print Vl data using for each loop----");
        for(Object s1: al)
        {
            System.out.println(s1);
        }


        al.clear();
        System.out.println(al.size());


    }
}
