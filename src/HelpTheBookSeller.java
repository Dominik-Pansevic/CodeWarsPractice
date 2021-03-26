import java.util.HashMap;

public class HelpTheBookSeller {

    public static void main(String[] args) {

        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B"};

        System.out.println(stockSummary(art,cd));

    }
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        String output = "";
        HashMap<String, Integer> stockMap = new HashMap<String, Integer>();

        if(lstOfArt.length == 0 || lstOf1stLetter.length == 0){return output;}

        //Make a hashmap of all categories and amounts
        for (int i=0; i<lstOfArt.length; i++) {
            String[] sp = lstOfArt[i].split(" ");
            String currentCategory = lstOfArt[i].charAt(0)+"";
            int amount = Integer.parseInt(sp[1]);

            if(stockMap.containsKey(currentCategory)) {
                stockMap.put(currentCategory, stockMap.get(currentCategory) + amount);
            } else {
                stockMap.put(currentCategory,amount);
            }
        }

        //Search hashmap to create necessary output string
        for(int j=0; j<lstOf1stLetter.length; j++) {
            int amount = 0;

            if(stockMap.containsKey(lstOf1stLetter[j])) {
                amount = stockMap.get(lstOf1stLetter[j]);
            }

            output += "("+lstOf1stLetter[j] + " : " + amount + ")";
            if(lstOf1stLetter.length-j > 1){output+=" - ";}
        }
        return output;
    }

}
