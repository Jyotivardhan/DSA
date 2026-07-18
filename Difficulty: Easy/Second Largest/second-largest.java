class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = arr[0];
        int Slargest = -1;
        for(int i=1; i<arr.length ; i++){
            if(arr[i]>largest){
                Slargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>Slargest){
                Slargest = arr[i];
            }
        }
        return Slargest;
    }
}