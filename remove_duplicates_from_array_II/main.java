class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int p2=2;
        for(int p1=2;p1<nums.length;p1++){
            nums[p2] = nums[p1];
            if(nums[p2] != nums[p2-2]){
                p2++;
            }
        }
        return p2;
    }
}