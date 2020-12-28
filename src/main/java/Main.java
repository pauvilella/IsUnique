import java.util.*;

public class Main {
    String good = "abcdefgjklmni";
    String bad = "abcddef";
    //In this implementation we assume that the characters only are from a to z in lowercase.
    boolean hasUniqueChars(String s) {
        int checker = 0;
        for(int i = 0; i < s.length(); i++) {
            int value = s.charAt(i) - 'a'; // This makes that every input that is from a-z in lower case get a valure between 0 and 25.
            if((checker & (1 << value)) > 0) { //We check if there is a one in the position of the value
                return false;
            } else {
                checker |= (1 << value); // If there is not a one, we put it.
            }
        }
        return true;
    }
    public static void main(String[]  args) {
        Main program = new Main();

        System.out.println(program.good);
        boolean resultGood = program.hasUniqueChars(program.good);
        System.out.println(resultGood);

        System.out.println(program.bad);
        boolean resultBad = program.hasUniqueChars(program.bad);
        System.out.println(resultBad);
    }
}
