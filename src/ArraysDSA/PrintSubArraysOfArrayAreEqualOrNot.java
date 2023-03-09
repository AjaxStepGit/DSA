package ArraysDSA;

import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class PrintSubArraysOfArrayAreEqualOrNot {

    public String canEquallyDivided(int[] arr, int N){
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> resultList = getSumOfAllSubArrays(arr, 0, 0, new ArrayList<Integer>());
        String answer = "FALSE";
        for(int i = 0; i < resultList.size(); i++){
            if(hashSet.contains(resultList.get(i))){
                answer = "TRUE";
                break;
            }
            hashSet.add(resultList.get(i));
            
        }

        return answer;
    }

    public ArrayList<Integer> getSumOfAllSubArrays(int[] arr, int start, int end, ArrayList<Integer> result){
        int sum = 0;
        if(end == arr.length){
            return result;
        }

        if(start > end){
            getSumOfAllSubArrays(arr, 0, end+1, result);
        }else{
            for(int i = start; i < end; i++){
                sum += arr[i];
            }
            sum += arr[end];
            result.add(sum);
            getSumOfAllSubArrays(arr, start+1, end, result);
        }
        return result;
    }
    
}
