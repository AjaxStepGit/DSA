package StringsDSA;

public class URLfy {

    public String convertString(String S, int N){
        char[] charArr = S.toCharArray();
        StringBuilder str = new StringBuilder("");
        for(int i = 0; i < N; i++){
            if(charArr[i] == ' '){
                str.append("%20");
            }else{
                str.append(charArr[i]);
            }
        }
        return str.toString();
    }
    
}
