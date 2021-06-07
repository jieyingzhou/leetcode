class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewel = new HashSet<>();
        for(char j : jewels.toCharArray()) {
            jewel.add(j);
        }
        int res = 0;
        for(char s: stones.toCharArray()) {
            if(jewel.contains(s)) {
                res++;
            }
        }
        return res;
    }
}