import java.util.Arrays;
import java.util.HashMap;


public class NewCashierDoesNotKnowAboutSpaceOrShift {

    public static void main(String[] args) {

        System.out.println(getOrder("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"));

    }
    public static String getOrder(String input) {
        String[] menu = {"burger","fries","chicken","pizza","sandwich","onionrings","milkshake","coke"};
        HashMap<String, Integer> orderByNameLookup = new HashMap<>();
        HashMap<Integer, String> orderByPositionLookup = new HashMap<>();
        String regex = "";
        String output="";

        //Build regex and populate hashmaps
        for(int i=0; i<menu.length; i++) {
            regex = regex + "(?="+menu[i]+")";
            if(i+1<menu.length) { regex = regex + "|";}
            orderByNameLookup.put(menu[i],i+1);
            orderByPositionLookup.put(i+1,menu[i]);
        }

        //Split the string based on regex pattern
        String[] words = input.split(regex);
        Integer[] wordPositions = new Integer[words.length];

        //Change item names into their position numbers according to the menu list
        for(int i=0; i<words.length; i++) {
            wordPositions[i] = orderByNameLookup.get(words[i]);
        }
        Arrays.sort(wordPositions);

        //Translate position numbers to item names and capitalise the first letter of each array item while building an output string
        for(int i=0; i<wordPositions.length; i++) {
            String word = orderByPositionLookup.get(wordPositions[i]);
            output = output + (word.substring(0,1).toUpperCase() + word.substring(1)) + " ";
        }
        return output.trim();
    }
}
