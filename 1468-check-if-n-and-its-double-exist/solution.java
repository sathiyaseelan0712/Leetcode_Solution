class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && 0<=i&&j<arr.length&& arr[i]==2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
