class Solution {
    public boolean search(int[] arr, int target) {
       int pivot = pivotel(arr);

    if (pivot == -1) {
        return binary(arr, target, 0, arr.length - 1);
    }
   else if (arr[pivot] == target) {
    return true;
}
    else if(arr[arr.length - 1] >= target ){
        return binary(arr, target, pivot + 1, arr.length - 1);
    }

    return binary(arr, target, 0, pivot - 1);
 }

     boolean binary(int arr[] , int target , int st , int end){
       while(end >= st){
         int mid = st + ( end - st)/2;
         if(arr[mid] == target){
            return true;
         }
         else if(arr[mid] > target){
            end = mid - 1;
         }
         else{
            st = mid + 1;
         }
       }

        return false;
    }

     int pivotel(int arr[]) {
        int st = 0;
        int end = arr.length - 1;
        while(end >= st){
            int mid = st + (end - st)/2;

        if(mid < end && arr[mid] > arr[mid + 1]){
            return mid;
        }
        else if(mid > st && arr[mid] < arr[mid - 1]){
            return mid - 1;  
        }


          if (arr[st] == arr[mid] && arr[mid] == arr[end]) {
                if (st < end && arr[st] > arr[st + 1]) {
                    return st;
                }
                st++;

                if (end > st && arr[end - 1] > arr[end]) {
                    return end - 1;
                }
                end--;
            }
        else if (arr[mid] >= arr[st] ){
            st = mid + 1;
        }
        else{
            end = mid - 1;
        }

        }
        return -1;  
    }
}