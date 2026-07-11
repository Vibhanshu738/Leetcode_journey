class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end=0;
        for(int num:nums)
        {
            end=Math.max(end,num);
        }
        int ans=0;
        while(start<=end)
        {
            int sum=0;
            int mid=start + (end - start) / 2;
            for(int i=0;i<nums.length;i++)
            {
                sum+=(int)Math.ceil((double)nums[i]/mid);
            }
            if(sum<=threshold)
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