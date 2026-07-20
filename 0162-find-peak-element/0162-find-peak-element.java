class Solution {
    public int findPeakElement(int[] arr) {
           int st = 0;
        int end = arr.length - 1;
        while (end > st) {
            int mid = st + (end - st) / 2;
           if(arr[mid] > arr[mid + 1]) {
              end = mid ;
           }
           else{
            st = mid + 1;
           }

    }
    return st;
}
}