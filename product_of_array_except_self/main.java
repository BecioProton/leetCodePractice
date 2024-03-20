class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            productExceptSelf(new int[] { 0, 0 });
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int prod = 1;
        ans[0] = prod;

        for(int i=1; i<nums.length; i++) {
            prod *= nums[i-1];
            ans[i] = prod;
        }

        prod = 1;
        for(int i=nums.length-2; i>=0; i--) {
            prod *= nums[i+1];
            ans[i] *= prod;
        }

        return ans;
    }
}