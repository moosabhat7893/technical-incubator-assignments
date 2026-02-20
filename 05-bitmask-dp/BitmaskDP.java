import java.util.*;

public class BitmaskDP {

    static int[][] cost;
    static int[] dp;
    static int N;

    static int solve(int mask){

        if(mask==(1<<N)-1)
            return 0;

        if(dp[mask]!=-1)
            return dp[mask];

        int worker=Integer.bitCount(mask);

        int minCost=Integer.MAX_VALUE;

        for(int task=0;task<N;task++){

            if((mask&(1<<task))==0){

                minCost=Math.min(minCost,
                cost[worker][task]+solve(mask|(1<<task)));
            }
        }

        return dp[mask]=minCost;
    }

    public static void main(String[] args){

        cost=new int[][]{
            {9,2,7},
            {6,4,3},
            {5,8,1}
        };

        N=cost.length;

        dp=new int[1<<N];

        Arrays.fill(dp,-1);

        System.out.println(solve(0));
    }
}