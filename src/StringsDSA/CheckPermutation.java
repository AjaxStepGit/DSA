package StringsDSA;


import java.util.Arrays;

public class CheckPermutation {

    public boolean checkPermutation(String s1, String s2, int N){
        char[] s1Char = s1.toCharArray();
        char[] s2Char = s2.toCharArray();
        Arrays.sort(s1Char);
        Arrays.sort(s2Char);
        for(int i = 0; i < N; i++){
            if(s1Char[i] != s2Char[i])
                return false;
        }
        return true;
    }


    
}
