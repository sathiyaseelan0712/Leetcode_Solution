class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        int n=details.length;
        for(int i=0;i<n;i++){
            String a=details[i].substring(11,13);
            int b=Integer.parseInt(a);
            if(b>60)
            {
                count++;
            }
        }
        return count;
    }
}
