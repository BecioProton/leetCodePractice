public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int totalWater = 0;

        // Two pointer approach
        while (left <= right) {
            if (height[left] <= height[right]) {
                // If the current height at left is less than or equal to the height at right
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // Update leftMax
                } else {
                    totalWater += leftMax - height[left]; // Water trapped at left
                }
                left++;
            } else {
                // If the current height at right is less than height at left
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // Update rightMax
                } else {
                    totalWater += rightMax - height[right]; // Water trapped at right
                }
                right--;
            }
        }

        return totalWater;
    }
}