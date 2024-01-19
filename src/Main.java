import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = scan.nextLine();
        String regex = "abcdefghijklmnopqrstuv18340";
        Pattern p2 = Pattern. compile (regex);
        Matcher m2 = p2.matcher(s);
        boolean b1 = m2.matches();
        if (b1 == true)
            System.out.println("Выражение правильное");
        else
            System.out.println("Выражение неправильное");
    }
}