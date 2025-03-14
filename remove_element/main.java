class Solution {
    public int removeElement(int[] nums, int val) {
        int p1 = 0;
        int p2 = nums.length;

        while(p1<p2){
            if(nums[p1] == val){
                nums[p1] = nums[p2-1];
                p2--;
            }else{
                p1++;
            }
        }
        return p2;
    }
}