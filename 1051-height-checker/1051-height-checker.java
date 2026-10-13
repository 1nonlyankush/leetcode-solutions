class Solution {
    public int heightChecker(int[] heights) {
        int ans = 0;
        int[] newArr = heights.clone();
        Arrays.sort(newArr);
        for(int i = 0 ; i < heights.length ; i++){
        if(newArr[i] != heights[i]){
            ans++;
        }
    }
    return ans;
    }
}