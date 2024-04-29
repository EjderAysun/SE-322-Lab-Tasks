package apps;
import java.util.ArrayList;

public class JUnitApplication {
    // A perfect number is a positive integer that is equal
    //to the sum of its proper divisors (excluding itself)
    public boolean perfectNumber(int number) {
        if(number <= 0) return false;
        else {
            ArrayList<Integer> divisors = new ArrayList<>();
            for(int i = 1; i <= (number/2); i++) {
                if(number % i == 0) divisors.add(i);
            }
            int sum = 0;
            for(int k : divisors) {
                sum += k;
            }
            return sum == number;
        }
    }

    // It takes an integer between 1-100 and returns the
    //sum of odd integers from 1 to the given integer.
    public int sumOdds(int number) {
        if(number <= 0 || number > 100) return 0;
        else return (int) Math.pow((int)(Math.ceil(number/2.0)), 2);
    }

    // It takes two strings, concatenates them, adds a third string
    // called 'testingisgoodat' the end of it, and returns that string.
    public String concateText(String str1, String str2) {
        String str3 = "testingisgoodat";
        return str1+str2+str3;
    }

    // It takes an integer and returns the corresponding fibonacci number.
    // This Fibonacci series is based on https://oeis.org/A000045/b000045.txt resource for its index and value.
    public long fibonacci(int number) {
        if(number <= 0) return 0;
        long curr = 0;
        long next = 1;
        for(int i = 1; i <= number; i++) {
            long temp = curr;
            curr = next;
            next += temp;
        }
        return curr;
    }
}