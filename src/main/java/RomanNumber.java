/**
 * Created by Julia on 15.07.2016
 */

/*
Write a method that gets a number from 1-10 and return the roman number sign
 */

public class RomanNumber {

    public static void main(String [] args) {
        RomanNumber romanNumber = new RomanNumber();
        System.out.println(romanNumber.getRomanNumberSign(5));
    }

    public String getRomanNumberSign(int number) {
        String romanSign;
        switch (number) {
            case 1: romanSign = "I";
                break;
            case 2: romanSign = "II";
                break;
            case 3: romanSign = "III";
                break;
            case 4: romanSign = "IV";
                break;
            case 5: romanSign = "V";
                break;
            case 6: romanSign = "VI";
                break;
            case 7: romanSign = "VII";
                break;
            case 8: romanSign = "VIII";
                break;
            case 9: romanSign = "IX";
                break;
            case 10: romanSign = "X";
                break;
            default: romanSign = "Not supported number. Enter number from 1 to 10.";
                break;
        }
        return romanSign;
    }
}
