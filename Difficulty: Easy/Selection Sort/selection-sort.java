class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        int min_idx;
        for(int i = 0; i<=n-2; i++){
            min_idx = i ;
            for(int j = i; j<=n-1;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i]= temp;
        }
    }
}