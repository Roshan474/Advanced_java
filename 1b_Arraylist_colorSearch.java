/*Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not
*/

package arraylistLinkedlist;

import java.util.*;

public class colorsearch {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Colors: " + colors);

        if (colors.contains("Red")) {
            System.out.println("Color 'Red' is available.");
        } else {
            System.out.println("Color 'Red' is not available.");
        }
    }
}
