public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 8 };
        int target = 12;

        int[] resultado = twoSum(nums, target);
        System.out.println("[" + resultado[0] + ", " + resultado[1] + "]");
    }
}
