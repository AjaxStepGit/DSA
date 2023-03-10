package RecursionDSA;

public class Factorial {

    public int print(int N){

        if(N == 1)
            return 1;

        return N * print(N -1);
    }
    
}
