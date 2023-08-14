// Example 1:

// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5



class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele: nums)
            pq.add(ele);

        int ans = 0;

        while(k-- > 0)
        {
            ans = pq.poll();
        }

        return ans;
        
    }

  // TC = O(nlogn)
  // Sc = O(N)
  
}
