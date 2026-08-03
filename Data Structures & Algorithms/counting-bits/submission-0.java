class Solution {
    public int[] countBits(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = new int [n+1] ;
        
        for(int i =0  ; i <= n ; i++) {
            int c = 0 ;
            int diff = 0 ;
            String s = Integer.toBinaryString(i);
            char [] chars = s.toCharArray();
            for(char ch : chars) {
                if(ch != '1') {
                    c ++ ;
                }
            }
            diff = s.length() - c ;
            list.add(diff) ;
        }

        for(int i =0 ; i < list.size() ; i++) {
            arr[i] = list.get(i) ;
        }

        return arr ;
    }

}
