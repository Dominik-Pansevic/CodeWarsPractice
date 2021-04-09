import java.util.ArrayList;
import java.util.HashMap;

public class GiveMeADiamond {

    public static void main(String[] args) {
        System.out.println(print(11));

    }

    public static String print(int n) {
        if(n>0 && n % 2 != 0)
        {
            int uniqueLayersAmount = 0;
            int backtrack = 0;

            HashMap<Integer, Integer> uniqueLayerInfo = new HashMap<Integer, Integer>();
            ArrayList<String> uniqueLayers = new ArrayList<String>();
            String output = "";

            //Find all odd numbers in range 1 - n
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    uniqueLayersAmount++;
                    uniqueLayerInfo.put(uniqueLayersAmount,i);
                }
            }

            //Form unique diamond layers and store in ArrayList as a String.
            for (int i = 1; i<=uniqueLayersAmount; i++) {
                int spaces = uniqueLayersAmount - i;
                int asterisks = uniqueLayerInfo.get(i);
                String layer = "";

                for(int j=0; j<(spaces+asterisks); j++) {
                    if(j<spaces) {
                        layer += " ";
                    } else {
                        layer += "*";
                    }
                    if(j == (spaces+asterisks - 1)) {
                        layer += "\n";
                    }
                }
                uniqueLayers.add(layer);
            }

            // Form final output String
            for(int i = 0; i<n; i++) {
                if(i<uniqueLayers.size())
                {
                    output += uniqueLayers.get(i);
                } else {
                    backtrack += 2;
                    output += uniqueLayers.get(i-backtrack);
                }
            }
            return output;
        }
        return null;
    }
}
