package q55563;
import java.util.Scanner;

public class VowelConsonantExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      String s = scanner.nextLine();
      // Input must be exactly one character and a letter
      if (s.length() != 1 || !Character.isLetter(s.charAt(0))) {
        throw new Exception("Invalid");
      }

      char ch = s.charAt(0);
      char lower = Character.toLowerCase(ch);

      if (lower == 'a' || lower == 'e' || lower == 'i' ||
          lower == 'o' || lower == 'u') {
        System.out.println(ch + " is a vowel");
      } else {
        System.out.println(ch + " is a consonant");
      }
    } catch (Exception e) {
      System.out.println("Error");
    } finally {
      scanner.close();
    }
  }
}