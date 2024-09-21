import java.text.SimpleDateFormat;

public class Date {
    public static void main(String []args)throws Exception{
        String sDate="29/03/2000";
        java.util.Date date1=new SimpleDateFormat("dd/mm/yyyy").parse(sDate);

        System.out.println(sDate +" " +date1);
    }
}
