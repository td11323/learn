import static java.lang.System.out;

import java.util.Date;

public class Output {
    public static void main(String[] args) {
        floatFormat();
        timeFormat();
    }

    private static void timeFormat() {
        Date date = new Date();
        out.println(date);
        out.printf("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS \r\n", date);        
    }

    private static void floatFormat() {
        double a = Math.PI;
        out.printf("%f \r\n", a);
        out.printf("%3.2f \r\n", a);
        out.printf("%.2f \r\n", a);
        out.printf("%e \r\n", a);
        out.printf("%g \r\n", a);
        a = 1000023.234324324;
        out.printf("%+,.3f \r\n", a);
        out.printf("%+0,15.3f \r\n", a);
        a = -123.664;
        out.printf("%+.2f \r\n", a);
        out.printf("%(.2f \r\n", a);
    }
}