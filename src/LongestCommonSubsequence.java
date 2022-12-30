public class LongestCommonSubsequence {
    public static void main(String[] args) {

        System.out.println(longestCommonSubsequence("abcde","ace"));
    }

    //time complexcity
    //O(row * col )

    //space complexcity
    //O(row * col)
    private static int longestCommonSubsequence(final String text1, final String text2){
        final int row = text1.length();
        final int col = text2.length();

        final int[][] dp = new int [row+1][col+1];
        for(int i = row-1;i>=0;i--){
            for(int j= col-1;j>=0;j--){
                if(text1.charAt((i)) == text2.charAt(j)){
                    dp[i][j] = 1+dp[i+1][j+1];

                }else{
                    dp[i][j] = Math.max(dp[i][j+1],dp[i+1][j]);

                }
            }

        }
        return dp[0][0];
    }
}