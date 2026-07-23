class Solution {
    int search(int arr[] , int target){
  
    int pivot = pivotel(arr);

    if (pivot == -1) {
        return binary(arr, target, 0, arr.length - 1);
    }
   else if (arr[pivot] == target) {
    return pivot;
}
    else if(arr[arr.length - 1] >= target ){
        return binary(arr, target, pivot + 1, arr.length - 1);
    }

    return binary(arr, target, 0, pivot - 1);
 }

     int binary(int arr[] , int target , int st , int end){
       while(end >= st){
         int mid = st + ( end - st)/2;
         if(arr[mid] == target){
            return mid;
         }
         else if(arr[mid] > target){
            end = mid - 1;
         }
         else{
            st = mid + 1;
         }
       }

        return -1;
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

