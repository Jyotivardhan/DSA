class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int n1= a.length;
        int n2= b.length;
        int i=0;
        int j=0;
        
        ArrayList<Integer> list = new ArrayList<>();
        while(i<n1 && j<n2){
            int val;
            
            if(a[i]<b[j]){
                val=a[i];
                i++;
            }
            else if(a[i]>b[j]){
                val=b[j];
                j++;
            }
            else{
                val = a[i];
                i++;
                j++;
            }
            if(list.size()==0 || list.get(list.size()-1)!=val){
                list.add(val);
            }
        }
        while(i<n1){
            if(list.size()==0 || list.get(list.size()-1)!=a[i]){
                list.add(a[i]);
            }
            i++;
        }
        while(j<n2){
            if(list.size()==0 || list.get(list.size()-1)!=b[j]){
                list.add(b[j]);
            }
            j++;
        }
        return list;
    }
}
