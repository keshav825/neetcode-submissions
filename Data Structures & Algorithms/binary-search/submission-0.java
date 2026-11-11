class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int high=nums.length-1;
        while(l<=high){
            int mid=l+(high-l)/2;
            if(nums[mid]==target)return mid;
            if(nums[mid]<target){
             l=mid+1;
            }else{
        high=mid-1;
            }
            
        }
      return -1;
    }
}
