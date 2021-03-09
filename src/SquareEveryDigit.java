public class SquareEveryDigit {

    public static void main(String[] args) {
        SquareEveryDigit app = new SquareEveryDigit();
        System.out.println(app.squareDigits(123));
    }

    public int squareDigits(int n) {
        String result = "";

        while (n != 0) {
            int digit = n % 10 ;
            result = digit*digit + result ;
            n /= 10 ;
        }
        return Integer.parseInt(result) ;
    }

}
