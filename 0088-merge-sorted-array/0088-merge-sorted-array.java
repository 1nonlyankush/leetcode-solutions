class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ans [] = new int [m + n];
for(int i = 0 ; i <= ans.length - 1 ; i++){
    if(i < m){
        ans[i] = nums1[i];
    }
    else{
        ans[i] = nums2[i - m];
    }
    
}

Arrays.sort(ans);
   for(int i = 0; i < ans.length; i++) {
            nums1[i] = ans[i];
        }

            }
}