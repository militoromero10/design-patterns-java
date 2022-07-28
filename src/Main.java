import java.util.Arrays;

public class Main {


  public static void main(String[] args) {
    // A = 3,2,4,3  F=2  M = 4 -> 6,6
    // A = 1,5,6    F=4  M = 3 -> 2,1,2,4 | 6,1,1,1
    // A = 1,2,3,4  F=4  M = 6 -> 0
    // A = 6,1      F=1  M = 1 -> 0
    int A[] = {1,5,6}, F=4, M=3;



    System.out.println(Arrays.toString(solve(A,F,M)));
  }

  public static int[] solve(int[] A, int F, int M) {
    int m = A.length;
    int sum = 0;
    for ( int i =0; i < m; sum+=A[i++]);
    int aplusb = M * (m + F) - sum;
    if (aplusb <= 0 || aplusb < F) return new int[]{0};
    int start = aplusb / F;
    int mod = aplusb % F;
    if (start > 6 || start == 6 && mod > 0) return new int[]{0};
    int[] sol = new int[F];
    Arrays.fill(sol, start);
    for(int i = F-1;i >= 0 && mod > 0; sol[i] += 1,i--, mod--);
    return sol;
  }

}
