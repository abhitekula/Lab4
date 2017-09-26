/**
 * The following code needs a lot of TLC. So give it some! 1. Fix all checkstyle errors 2. Determine
 * what it does (it's going to be tough before you finish #1) 3. Improve the name of the methods and
 * variables 4. Add comments and Javadoc comments where needed 5. Remove unnecessary comments as
 * appropriate Finds the longest common substring
 */

public class ReclamationProject {
    /**
     * @param a first input
     * @param b second input
     * @return returns longest common subtsring
     */
    static String doit(final String a, final String b) {
        String a1 = a, b1 = b;
        if (a.length() > b.length()) {
            final String c = a;
            a1 = b;
            b1 = c;
        }
        String r = "";
        for (int i = 0; i < a1.length(); i++) {
            for (int j = a1.length() - i; j > 0; j--) {
                for (int k = 0; k < b1.length() - j; k++) {
                    if (a1.regionMatches(i, b1, k, j) && j > r.length()) {
                        a1.substring(i, i + j);
                    }
                }
            }
        }
        return r;
    }
}
