package RealProbelmsonHashes1;

public class pracIspalin {
    public static void main(String[] args) {
        String s1="aab";
        int val=minCut(s1);
        System.out.println(" ");
        System.out.println("Min Val "+val);
    }
    public static int  minCut(String s){
        int n=s.length();
        boolean isPalin[][]=new boolean[n][n];
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(j-i<2){
                        isPalin[i][j]=true;
                    }
                    else{
                        isPalin[i][j]=isPalin[i+1][j-1];
                    }
                }

            }
        }

            int dp[]=new int[n];
            for(int i=0;i<n;i++){
                if(isPalin[0][i]){
                    dp[i]=0;
                }
                else{
                    dp[i]=i;

                    for(int j=0;j<i;j++){
                        if(isPalin[j+1][i]){
                            dp[i]=Math.min(dp[i],dp[j]+1);
                        }
                    }
                }
            }
            return dp[n-1];


    }
    
}
