class Solution {
    public int[] twoSum(int[] nums, int target) {
    //    for(int i=0;i<nums.length;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //         if(nums[i]+nums[j]==target){
    //             return new int[]{i,j};
    //         }
    //     }
    //    } 
    //    return new int[]{};

    HashSet<Integer>set=new HashSet<>();
    for(int i=0;i<nums.length;i++){
       int rem=target-nums[i];
       if(set.contains(rem)){
        for(int j=0;j<i;j++){
            if(nums[j]==rem){
                return new int[]{j,i};
            }
        }
       }
       else{
        set.add(nums[i]);
       }
    }
    return new int []{};
    }
}
