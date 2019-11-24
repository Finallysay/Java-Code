public class solution5 {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        boolean done = false;
        for (int i = 0; i < nums.length + 1 && !done; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    twoSum[0] = i;
                    twoSum[1] = j;
                    done = true;
                    break;
                }
            }

        }
        return twoSum;
    }
}
