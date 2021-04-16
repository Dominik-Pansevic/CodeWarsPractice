import java.util.HashMap;

public class VasyaClerk {

    public static void main(String[] args) {

        int[] arr1 = {25,25,50};
        int[] arr2 = {25,100};
        int[] arr3 = {25, 25, 50, 50, 100};

        System.out.println(Tickets(arr1));
        System.out.println(Tickets(arr2));
        System.out.println(Tickets(arr3));
    }

    public static String Tickets(int[] peopleInLine)
    {
        int quarter = 0;
        int fifty = 0;

        for(int BILL : peopleInLine) {
            if(BILL == 25) {
                quarter++;
            } else if(BILL == 50){
                quarter--;
                fifty++;
            } else {
                if(fifty >= 1 && quarter>=1){
                    fifty--;
                    quarter--;
                } else  {
                    quarter -= 3;
                }
            }
            if(quarter<0 || fifty < 0) {
                return "NO";
            }
        }
        return "YES";
    }
}
