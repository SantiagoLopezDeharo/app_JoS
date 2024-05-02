public class str_dist {
    
    private static int min(int a, int b)
    {
        if (a > b)
            return b;
        return a;
    }
    
    private static int d(String a, String b)
    {
        int n = a.length();
        int m = b.length();
        int[][] OPT = new int[n][m];
        if (a.charAt(0) == b.charAt(0))
            OPT[0][0] = 0;
        else
            OPT[0][0] = 1;
        
        for (int i = 1; i < m; i++)
            OPT[0][i] = OPT[0][i-1] + 1;

        for (int i = 1; i < n; i++)
            OPT[i][0] = OPT[i-1][0] + 1;
        
        
        for (int i = 1; i < n; i++)
            for (int j = 1; j < m; j++)
            {
                if(a.charAt(i) == b.charAt(j))
                    OPT[i][j] = OPT[i-1][j-1];
                else
                    OPT[i][j] = 1 + min(min(OPT[i-1][j-1], OPT[i-1][j]), OPT[i][j-1]);
            }
        
        return OPT[n-1][m-1];
    }
    
    public static void main(String args[]) {
      String a = "numdo";
      String b = "mundo";
      int dist = d(a, b);
      

      System.out.println(dist);
    }
}