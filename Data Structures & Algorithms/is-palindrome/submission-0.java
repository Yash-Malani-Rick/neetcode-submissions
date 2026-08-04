class Solution {
    public boolean isPalindrome(String s) {
        String sb = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        char [] ch = sb.toCharArray();
        int left= 0 ;
        int right = ch.length - 1 ;
        while(left < right) {
            if(ch[left] != ch[right]) {
                return false ;
            }
            left ++ ;
            right -- ;
        }
        return true ;
    }
}
