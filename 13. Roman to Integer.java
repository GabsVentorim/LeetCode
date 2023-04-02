class Solution {
    public int romanToInt(String s) {
        return value(s);
    }

    private int value(String s) {
        int i, ans;

        char[] sChar = s.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        ans = 0;
        for (i = 0; i < s.length() - 1; i++) {
            if (hm.get(sChar[i]) >= hm.get(sChar[i + 1])) {
                ans += hm.get(sChar[i]);
            } else {
                ans -= hm.get(sChar[i]);
            }
        }
        return ans + hm.get(sChar[s.length() - 1]);
    }
}