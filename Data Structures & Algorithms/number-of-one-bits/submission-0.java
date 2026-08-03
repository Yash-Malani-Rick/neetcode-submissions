class Solution {
    public int hammingWeight(int n) {
        int c = 0 ;
        String str = Integer.toBinaryString(n) ;
        for(int i : str.toCharArray()) {
            if(i != '1') {
                c ++ ;
            }
        }

        return str.length() - c ;
    }
}
