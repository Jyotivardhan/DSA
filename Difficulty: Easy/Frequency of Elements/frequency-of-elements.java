class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int key : map.keySet()){
            ArrayList<Integer> temp = new ArrayList<>();
            
            temp.add(key);
            temp.add(map.get(key));
            
            
            ans.add(temp);
        }
        return ans ;
    }
}