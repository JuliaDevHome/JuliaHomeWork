/**
 * Created by Julia on 15.07.2016
 */

/*
Write a program called HowManyEven which prints how many even digits number n has (Assumption: n>0).
For example - per given 254698 number the program should print 4
 */
public class HowManyEven {

    public static void main(String[] args) {
        HowManyEven howManyEven = new HowManyEven(); {
          howManyEven.countEvenDigits(478692536);
        }
    }

    public void countEvenDigits(int number) {
        int countDigits = 0;
        if(number > 0) {
            String tmp = "" + number;
            for(int i = 0; i < tmp.length(); i++) {
                int n = tmp.charAt(i);
                if(n%2 == 0){
                    countDigits++;
                }
            }
            System.out.println(String.format("Number '%s' has %s even digits", number, countDigits));
        }
        else {
            System.out.println("Unsupported number. Should be > 0.");
        }
    }
}
