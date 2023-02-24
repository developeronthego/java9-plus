package jdk.java12.features;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatting {
    public static void main(String[] args) {
        NumberFormat numberShort =
                NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        System.out.println(numberShort.format(3000000));
        NumberFormat numberLong =
                NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        System.out.println(numberLong.format(3000000));
    }
}
