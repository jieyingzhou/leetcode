class Solution {
    public int balancedStringSplit(String s) {
        int balanceCount = 0;
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            char[] str = s.toCharArray();
            if(str[i] == 'L') {
                count++;
            } else if(str[i] == 'R') {
                count--;
            }
            if(count == 0) {
                balanceCount++;
            }
        }
        return balanceCount;
    }
}