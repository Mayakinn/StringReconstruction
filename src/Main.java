import java.sql.SQLOutput;
import java.util.HashMap;

import static java.awt.SystemColor.text;

public class Main {
    /**
     * Main Method
     * @param args
     */
    public static void main(String[] args) {

        String originalString = "aaaabbbbssssaaaa";
        String deconstructedString = Deconstruct(originalString);

        System.out.println(deconstructedString);

        String constructed = Construct(deconstructedString);

        System.out.println(constructed);

    }

    /**
     * Method to deconstruct a string
     * @param originalString The original string that is needed to deconstruct
     * @return Returns the deconstructed string
     */
    static String Deconstruct(String originalString) {
        StringBuilder Deconstruced = new StringBuilder();
        int count = 0;

        if (!originalString.isEmpty()) {
            char prev = originalString.charAt(0);
            for (int i = 0; i < originalString.length(); i++) {
                char ch = originalString.charAt(i);
                if (ch == prev) {
                    count++;
                    if (originalString.length() - 1 == i) {
                        Deconstruced.append(prev);
                        Deconstruced.append(count);
                        prev = ch;
                        count = 1;
                    }
                } else {
                    Deconstruced.append(prev);
                    Deconstruced.append(count);
                    prev = ch;
                    count = 1;
                }
            }
        }
        return Deconstruced.toString();
    }

    /**
     * Constructs the string that was previously deconstructed
     * @param deconstructedString The deconstructed string
     * @return returns the constructed string
     */
    static String Construct(String deconstructedString) {
        StringBuilder Constructed = new StringBuilder();
        if (!deconstructedString.isEmpty()) {
            for (int i = 0; i < deconstructedString.length() - 1; i += 2) {
                char letter = deconstructedString.charAt(i);
                int rec = deconstructedString.charAt(i + 1);
                int a = rec - '0';
                Constructed.append(String.valueOf(letter).repeat(a));
            }
        }
        return Constructed.toString();
    }
}