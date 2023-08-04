package LeetCode;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length ; i ++){
            for (int j = 0; j < nums.length; j++){
                //kiểm tra xem i + j có bằng target không?
                if (nums [i] + nums[j] == target && i != j){
                    result [0] = i;
                    result [1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
