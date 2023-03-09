package StringsDSA;

import java.util.Arrays;

public class CheckUniqueStringWithoutDS {

//     Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you 
// cannot use additional data structures? 


    //efdcgwserft

    //O(N^2) APPROACH
    public boolean checkStringisUnique(String S, int N){
        
        for(int i = 0; i < N; i++){
            char c = S.charAt(i);
            for(int j = i+1; j < N; j++){
                if(c == S.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }

    //N(Log(N) Approach)

    public boolean checkStringIsUnique(String S, int N){
        char[] charArr = S.toCharArray();
        Arrays.sort(charArr);
        for(int i = 0; i < N-1; i++){
            if(charArr[i] == charArr[i+1])
                return false;            
        }
        return true;
    }
    
}


//MAIN METHOD      
// String S = "easdfe";
//         CheckUniqueStringWithoutDS C1 = new CheckUniqueStringWithoutDS();
//         if(C1.checkStringisUnique(S, S.length())){
//             System.out.println("String is unique");
//         }else{
//             System.out.println("String is not unique");
//         }

//         CheckUniqueStringWithoutDS C2 = new CheckUniqueStringWithoutDS();
//         if(C2.checkStringIsUnique(S, S.length())){
//             System.out.println("String is unique");
//         }else{
//             System.out.println("String is not unique");
//         }
