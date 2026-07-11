class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=0;
        int end=0;
        for(int weight:weights)
        {
            start=Math.max(start,weight);
            end+=weight;
        }
        int ans=end;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int usedDays = 1;
            int load = 0;

            for (int w : weights) {

                if (load + w <= mid) {
                      load += w;
              } else {
                     usedDays++;
                     load = w;
              }
            }
          if(usedDays<=days)
          {
            ans=mid;
            end=mid-1;
          }
          else
          {
            start=mid+1;
          }
        }
        return ans;
    }
}