package S1_Logical7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex12_GetCurrentDate
{
    public static void main(String[] args)
    {
//        System.out.println(LocalDate.now());

        Date date = new Date();
        SimpleDateFormat simpleDateFormatObj = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
        System.out.println(simpleDateFormatObj.format(date));
    }
}
