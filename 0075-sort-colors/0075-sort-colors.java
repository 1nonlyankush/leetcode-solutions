class Solution {
    public void sortColors(int[] arr) {
      
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int st = 0;
            int maxVal = max(arr, st, last);
            swapp(arr, last, maxVal);
        }
        System.out.println(Arrays.toString(arr));
    }

    static int max(int arr[], int st, int last) {
        int maxx = st;
        for (int i = st; i <= last; i++) {
            if (arr[maxx] < arr[i]) {
                maxx = i;
            }
        }
        return maxx;
    }

    static void swapp(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    } 
    
}