package ArraysDSA;

import java.util.ArrayList;

// : Given an array of distinct integer values, count the number of pairs of integers that 
// have difference k. For example, given the array {1 , 7, 5, 9, 2, 12, 3} and the difference 
// k = 2, there are four pairs with difference 2: (1 , 3) j (3 , S), (5 , 7), (7 , 9),

public class NumberOfPairThatHaveDifferenceK{
    
    public void getPairs(int[] arr, int N, int K){
        ArrayList<Integer[]> pairList = new ArrayList<>();
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                if((arr[i] - arr[j]) == K){
                    pairList.add(new Integer[] {arr[i], arr[j]});
                }
            }
        }
    }
}