class Solution {
    public int minimumDeletions(String s) {
        int ans=0;
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='b'){
                count+=1;
            }
            else if (count>0){
                ans+=1;
                count-=1;
            }
        }
        return ans;
    }
}
