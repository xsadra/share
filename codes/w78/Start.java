package w78;

public class Start {
    public static void main(String[] args) {
        IntToRoman intToRoman = new IntToRoman();

        String roman = intToRoman.getRoman(1776 );

        System.out.println(roman);
        System.out.println("MDCCLXXVI");

    }
}
