class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //nums1 = [1,2,3,0,0,0], m = 3, 
        //nums2 = [2,5,6], n = 3

        int p1 = m-1;
        int p2 = n-1;

        for(int p=m+n-1;p2>=0;p--){
            if(p1>=0 && nums1[p1]>nums2[p2]){//value1>value2
                nums1[p] = nums1[p1];
                p1--;
            }else{
                nums1[p] = nums2[p2];
                p2--;
            }
        }
    }
}