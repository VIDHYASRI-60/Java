package demo;

import java.util.HashMap;
import java.util.Arrays;

public class FourSum {

    public static int[] fourSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 3; i++) {

            for (int j = i + 1; j < nums.length - 2; j++) {

                HashMap<Integer, Integer> map = new HashMap<>();

                int remaining = target - nums[i] - nums[j];

                for (int k = j + 1; k < nums.length; k++) {

                    int complement = remaining - nums[k];

                    if (map.containsKey(complement)) {
                        return new int[] {
                            i,
                            j,
                            map.get(complement),
                            k
                        };
                    }

                    map.put(nums[k], k);
                }
            }
        }

        return new int[] {-1, -1, -1, -1};
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int target = 10;

        int[] result = fourSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}