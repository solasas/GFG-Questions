package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortOddinDescEvenInAsc {
    static void sortIt(int[] arr) {

        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        // Separate the elements into odds and evens
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                odds.add(arr[i]);
            } else {
                evens.add(arr[i]);
            }
        }

        // Sort odds in descending order
        Collections.sort(odds, Collections.reverseOrder());

        // Sort evens in ascending order
        Collections.sort(evens);

        // Merge both back into the original array
        int idx = 0;

        for (int i = 0; i < odds.size(); i++) {
            arr[idx++] = odds.get(i);
        }

        for (int i = 0; i < evens.size(); i++) {
            arr[idx++] = evens.get(i);
        }
    }
}

//approach2
//      |
//      |
//     \ /


//class Solution {
//    public void sortIt(int[] arr) {
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2!=0){
//                arr[i]=arr[i]*-1;
//            }
//        }
//
//        Arrays.sort(arr);
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2!=0){
//                arr[i]=arr[i]*-1;
//            }
//        }
//    }
//}
