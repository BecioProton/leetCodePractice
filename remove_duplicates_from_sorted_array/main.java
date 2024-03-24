class Solution {
    public int removeDuplicates(int[] nums) {
        int p2=1;
        for(int p1=1;p1<nums.length;p1++){
            nums[p2] = nums[p1];
            if(nums[p2] != nums[p2-1]){
                p2++;
            }
        }
        return p2;
    }
}