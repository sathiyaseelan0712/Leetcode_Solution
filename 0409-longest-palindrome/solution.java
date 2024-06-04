class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();

        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z')
                arr1[ch-'a']++;
            else
                arr2[ch-'A']++;
        }
        int ans=0,odd=0;
        for(var a:arr1){
            ans+=(a/2)*2;
            if(a%2==1)
                odd=1;
        }
        for(var a:arr2){
            ans+=(a/2)*2;
            if(a%2==1)
                odd=1;
        }

        return ans+odd;
    }
}
