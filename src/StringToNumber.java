public class StringToNumber {

    public static void main(String[] args) {
        StringToNumber app = new StringToNumber();
        System.out.println(app.stringToNumber("-76849"));
    }

    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

}