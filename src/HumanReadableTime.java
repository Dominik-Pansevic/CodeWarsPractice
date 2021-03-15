public class HumanReadableTime {

    public static void main(String[] args) {
        System.out.println(makeReadable(359999));
    }

    public static String makeReadable(int seconds) {

        int humanHrs = seconds / 3600;
        int humanMin = (seconds / 60) % 60;
        int humanSec = seconds % 60;

        return String.format("%02d:%02d:%02d", humanHrs, humanMin, humanSec);
//        return  ("0" + humanHrs).substring(("0" + humanHrs).length() - 2) + ":" +
//                ("0" + humanMin).substring(("0" + humanMin).length() - 2) + ":" +
//                ("0" + humanSec).substring(("0" + humanSec).length() - 2);
    }
}
