
/**
 * SkillBuilder6 is a class for completing this Skill
 * Builder assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder6 {
    private static final char CHAR_T = 'T';
    private static final char CHAR_t = 't';
    private static final char CHAR_Y = 'Y';
    private static final char CHAR_y = 'y';
    // replace this line with your constants

    public static String findTYPattern(String s) {
        StringBuilder string = new StringBuilder();
        boolean foundT = false;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (!foundT && (currentChar == 't' || currentChar == 'T')) {
                foundT = true;
                string.append(currentChar);
            } else if (foundT) {
                string.append(currentChar);
                if (currentChar == 'y' || currentChar == 'Y') {
                    return string.toString();
                }
            }
        }
        return "";
    }
}