class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int rs = 0 , mxcnt = 0 ;
        for( int n : nums){
            map.put(n ,map.getOrDefault(n,0)+1);
            if(map.get(n) > mxcnt){
                rs = n;
                mxcnt = map.get(n);
            }
        }
        return rs;
    }
}