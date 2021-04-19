import java.util.Arrays;
import java.util.HashMap;

public class WhereIsMyParent {
    public static void main (String[] args) {
        System.out.println(findChildren("qppqYyyqpPHSyQhhCccGgIiiOooMmmmmTtttK"));
    }

    static String findChildren(String text) {
        String output = "";
        HashMap<String, String> mothersMap = new HashMap<String, String>();
        String[] mothers = text.replaceAll("[a-z]", "").split("");
        String[] children = text.replaceAll("[A-Z]", "").split("");
        Arrays.sort(mothers);
        Arrays.sort(children);

        //Create mothers hashMap
        for(int i=0; i<mothers.length; i++) {
            mothersMap.put(mothers[i], "");
        }
        //Populate mothers hashMap with children strings
        for(int i=0; i<children.length;i++) {
            mothersMap.put(children[i].toUpperCase(), mothersMap.get(children[i].toUpperCase()) + children[i]);
        }
        //Create output string with mothers (key) and their children (value)
        for(int i=0; i<mothers.length;i++) {
            output = output + mothers[i] + mothersMap.get(mothers[i]);
        }
        return output;
    }
}