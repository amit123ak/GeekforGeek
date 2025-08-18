class GFG {
    
    // Function to find the length of longest common subsequence
    static int lcs(int m, int n, String a, String b) {
        int dp[][] = new int[m + 1][n + 1];

        // Initialize dp array with -1
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }

        return lcsUtil(m, n, a, b, dp);
    }

    // Utility recursive function with memoization
    static int lcsUtil(int m, int n, String a, String b, int dp[][]) {
        if (m == 0 || n == 0)
            return 0;

        if (dp[m][n] != -1)
            return dp[m][n];

        if (a.charAt(m - 1) == b.charAt(n - 1)) {
            dp[m][n] = 1 + lcsUtil(m - 1, n - 1, a, b, dp);
            return dp[m][n];
        } else {
            dp[m][n] = Math.max(lcsUtil(m - 1, n, a, b, dp),
                                lcsUtil(m, n - 1, a, b, dp));
            return dp[m][n];
        }
    }

    // Driver code
    public static void main(String[] args) {
        String a = "ABCDGH";
        String b = "AEDFHR";
        int m = a.length();
        int n = b.length();

        System.out.println("Length of LCS is " + lcs(m, n, a, b));
    }
}
