import java.util.*;
import java.util.regex.Pattern;

public class CountTheSmileyFaces {

    public static void main(String[] args) {
       System.out.println(countSmileys(Arrays.asList(new String[]{"oX","oD", "p-)", "4D", ":D", "-X",";8D", "8~D", "(o)", "-;D", ":-d", "5D", "oD", "po)", ":X)", ":-p", "5x)P", "pd)", "pD", ":D", "(~p"})));
    }

    public static int countSmileys(List<String> arr) {
        int smileyCount = 0;
        Pattern pattern = Pattern.compile("^[:;][-~]?[)D]$");
        for(int i = 0; i<arr.size(); i++) {

            if(pattern.matcher(arr.get(i)).find()) {
                smileyCount++;
            }
        }
        return smileyCount;
    }
}
