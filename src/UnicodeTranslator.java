import java.util.Scanner;

public class UnicodeTranslator {

    public static void main(String[] args) {
        System.out.println("Enter any amount of characters, and it will return their unicode value");
        Scanner sc = new Scanner(System.in);
        String character = sc.next();
        int count = 0;

        while(count < character.length()){
            char c = character.charAt(count);
            int unicode = (int)c;
            count++;

            System.out.println(unicode);
        }
    }
}
