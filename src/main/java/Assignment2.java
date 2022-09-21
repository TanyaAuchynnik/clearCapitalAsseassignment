import java.util.Arrays;

/**
 * Assignment #2: Refactor Java code
 * Junior automation engineer was asked to implement a utility method that:
 * accepts a string that includes from 0 to N words of a name
 * returns a string that represents the first letter from each word in the name followed by "."
 * For example:   "Bruno Mars" →  "B.M."
 * "Dave M Jones" → "D.M.J."
 * "MichaelSmith" → "M."
 * Please, review his implementation, see if there is a room for improvement and refactor it.
 */
public class Assignment2 {
    /**
     * There is no requirement to capitalise resulting letters.
     * @param name a string that includes from 0 to N words
     * @return a string that represents the first letter from each word in the name followed by "."
     */
    public static String convertNameToInitials(String name) {
        if(name == null) {
          return null;
        }
        if(name.equals("")) {
           return "";
        }
        StringBuilder initials = new StringBuilder();
        String[] array = name.split(" ");
        char initial;
        for (String s : array) {
            initial = s.charAt(0);
            initials.append(initial).append(".");
        }
        return initials.toString();
    }
}
