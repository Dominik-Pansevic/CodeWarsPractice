public class TheHighestProfitWins {

    public static int[] minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for(int i=1; i < arr.length; i++) {
            //check for min
            if(min > arr[i]){
                min = arr[i];
            }
            //check for max
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return new int[] {min, max};
    }
}
