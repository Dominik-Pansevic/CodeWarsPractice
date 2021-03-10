public class MexicanWave {

    public static String[] wave(String str) {
        String[] result = new String[str.replaceAll("\\s+","").length()];
        int resultIterator = 0;
        for(int i = 0; i<str.length(); i++) {
            if(!(str.charAt(i) == ' ')) {
                result[resultIterator] = str.substring(0, i) + str.substring(i, i + 1).toUpperCase() + str.substring(i + 1);
                resultIterator++;
            }
        }
        return result;
    }


}
