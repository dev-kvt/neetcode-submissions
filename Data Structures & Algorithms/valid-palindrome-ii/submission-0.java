class Solution {
    public boolean validPalindrome(String s) {
        char[] arr = s.toCharArray();
        int l = 0 ;
        int r = arr.length - 1;

        while(l < r){
            if(arr[l] != arr[r]){
                return isPalin(arr, l,r-1) || isPalin(arr,l+1 , r);
            }
            l++;
            r--;
        }
        return true ;
    }
    private boolean isPalin(char[] arr ,int l , int r){
        while(l<r){
            if(arr[l]!=arr[r]) 
            {return false ;}
            l++;
            r--;
        }
        return true ;
    }
}