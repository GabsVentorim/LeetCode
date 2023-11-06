class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String resp = strs[0];
        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(resp) != 0) {
                resp = resp.substring(0, resp.length() - 1);
                if (resp.isEmpty()) return "";
            }
        }
        return resp;
    }
}