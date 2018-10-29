import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    /*给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

    你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

    示例:

    给定 nums = [2, 7, 11, 15], target = 9

    因为 nums[0] + nums[1] = 2 + 7 = 9
    所以返回 [0, 1]*/

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 5, 5, 11};
        print(solution.twoSum2(nums, 10));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }



    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complete = target - nums[i];
            if(map.containsKey(complete) && map.get(complete) != i) {
                return new int[] {i,map.get(complete)};
            }
        }

        throw new IllegalArgumentException("not found");

    }

    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complete = target - nums[i];
            if(map.containsKey(complete)) {
                return new int[] {map.get(complete), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("not found");
    }



    public static void print(int[] nums) {
        Arrays.stream(nums).forEach(System.out::println);
    }

}
