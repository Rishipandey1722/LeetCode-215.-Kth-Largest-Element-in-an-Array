class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {

        int n = queries.length;
        int ans[] = new int[n];

        for(int i = 0 ; i < n; i++)
        {
            int start = queries[i][0];
            int right = queries[i][1];
            int xor  = 0;

            while(start <= right)
            {
                xor^= arr[start];
                start++;
            }

            ans[i] = xor;
        }

        return ans;
        
    }
}
