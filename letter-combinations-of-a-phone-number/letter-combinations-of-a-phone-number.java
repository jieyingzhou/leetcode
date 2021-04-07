class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0) {
            return res;
        }
        String[] mapping = {
            " ",    //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };
        dfs(res, "", 0, digits, mapping);

        return res;
    }
    
    public void dfs(List<String> res, String curr, int index, String digits, String[] mapping) {
        if(index == digits.length()) {
            res.add(curr);
            return;
        }
        String s = mapping[digits.charAt(index) - '0'];
        for(int i = 0; i < s.length(); i++) {
            dfs(res, curr + s.charAt(i), index + 1, digits, mapping);
        }
    }
}