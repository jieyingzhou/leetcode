class Solution {
    public String reverseOnlyLetters(String S) {
        char[] res = S.toCharArray();
        int i = 0;
        int j = S.length() - 1;
        while(i < j) {
            while(i < j && !Character.isLetter(S.charAt(i))) {
                i++;
            }
            while(i < j && !Character.isLetter(S.charAt(j))) {
                j--;
            }
            char temp = res[i];
            res[i++] = res[j];
            res[j--] = temp;
        }
        return new String(res);
    }
}