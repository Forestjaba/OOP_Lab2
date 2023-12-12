import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        String regex = "abcdefghijklmnopqrstuv18340";
        String s = "abcdefghijklmnopqrstuv18340";
        Pattern p2 = Pattern. compile (regex);
        Matcher m2 = p2.matcher(s);
        boolean b1 = m2.matches();
        System.out.println(b1);
    }
}