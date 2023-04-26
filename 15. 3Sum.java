class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums); // sorting the vector
        List<List<Integer>> ans = new ArrayList<>(); // creating the answer

        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {

            // always the first one or the current num different than the before
            if (i == 0 || nums[i - 1] != nums[i]) {
                sum(i, nums, ans); // funtion
            }
        }
        return ans;
    }

    public void sum(int i, int[] nums, List<List<Integer>> ans) {
        int left = i + 1;
        int right = nums.length - 1;
        while (left < right) {
            int tempSum = nums[i] + nums[right] + nums[left];

            // the TempSum cant be negative, the current num must be different than the
            // before and the left cant be higher than the current index plus one. So we add
            // one in left
            if (tempSum < 0 || (nums[left] == nums[left - 1] && left > i + 1)) {
                left++;
            }

            // the TempSum cant be higher than 0, the current num must be different than the
            // before and the right cant be lower than the vector size. So we subtract one
            // in the right
            else if (tempSum > 0 || (right < nums.length - 1 && nums[right] == nums[right + 1])) {
                right--;
            }

            // tempSum == 0
            else {
                ans.add(Arrays.asList(nums[left++], nums[i], nums[right--]));
            }
        }
    }
}