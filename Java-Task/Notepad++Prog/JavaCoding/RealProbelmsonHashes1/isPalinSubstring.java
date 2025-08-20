package JavaCoding.RealProbelmsonHashes1;

public class isPalinSubstring {
    public static void main(String[] args) {
        String s1="aabbcbc";
        int valu=minCut(s1);
        System.out.println(valu);
        // pairs(s1);

    }
    public static int minCut(String s) {
    int n = s.length();
    boolean[][] isPalindrome = new boolean[n][n];

    
    for (int i = n - 1; i >= 0; i--) {
        for (int j = i; j < n; j++) {

            if (s.charAt(i) == s.charAt(j)) {
                if (j - i < 2) {
                    isPalindrome[i][j] = true;  //in the substring is the palin it will return true
                } else {
                    isPalindrome[i][j] = isPalindrome[i + 1][j - 1];   //s[1] ===s[3] it will return the true
                }
            }
        }
    }
    

    
    int[] dp = new int[n];
    for (int i = 0; i < n; i++) {
        if (isPalindrome[0][i]) {
            dp[i] = 0;
            //  System.out.println("dp[" + i + "] = " + dp[i] + " (entire substring is palindrome)");
        } else {
            dp[i] = i; //here it will cut 
            for (int j = 0; j < i; j++) {
                if (isPalindrome[j + 1][i]) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
    }
    
System.out.println(" ");
    // System.out.println("final cut values "+java.util.Arrays.toString(dp));
    return dp[n - 1];
   
}

    public static void pairs(String s){
    char ch[]=s.toCharArray();
   for(int i=0;i<s.length();i++){
    for(int j=i;j<s.length();j++){
        System.out.print(ch[j]);
    }
    System.out.println(" ");
   }
 }
}
