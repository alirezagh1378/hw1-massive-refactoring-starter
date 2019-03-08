package ir.ac.kntu;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Character;
import java.lang.String;

public class MassiveRefactoring {
  public static void isOldWordAndNewWordSame(String[] Old, String[] New, int n) {
    int Check = 0;
    String[] S = new String[n];
    String[] T = new String[n];
    for (int i = 0; i < n; i++) {
      char[] s = S[i].toCharArray();
      char[] t = T[i].toCharArray();
      char[] OldChar = Old[i].toCharArray();
      char[] Newchar = New[i].toCharArray();
      if (Newchar[i] != OldChar[i]) {
        Check = 1;
        s[i] = OldChar[i];
        t[i] = Newchar[i];

        if (Check == 1) {
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
        System.out.println(S[i]);
        System.out.println(T[i]);

      }
      System.out.println("NO");
    }

  }

  public static void main(String[] args) {
    Scanner useInput = new Scanner(System.in);
    int changeWordNumber = useInput.nextInt();
    String[] oldWords = new String[changeWordNumber];
    String[] newWords = new String[changeWordNumber];
    for (int i = 0; i < changeWordNumber; i++) {
      oldWords[i] = useInput.nextLine();
    }
    for (int i = 0; i < changeWordNumber; i++) {
      newWords[i] = useInput.nextLine();
    }
    isOldWordAndNewWordSame(oldWords, newWords, changeWordNumber);
    useInput.close();
  }
}
