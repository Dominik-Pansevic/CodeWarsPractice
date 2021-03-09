public class CreditCardMask {


    public static void main(String[] args) {
        System.out.println(maskify("213123214"));
    }

    public static String maskify(String str) {
        if (str.length() <= 4) return str;

        String result = "";

        for (int i = 0; i < str.length()-4; i++) {
            result += "#";
        }
        return result + str.substring(str.length()-4);

        }
}

