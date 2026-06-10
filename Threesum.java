package demo;


	import java.util.HashMap;

	public class Threesum {

	    public static int[] threeSum(int[] nums, int target) {

	        for (int i = 0; i < nums.length - 2; i++) {

	            HashMap<Integer, Integer> map = new HashMap<>();

	            int remaining = target - nums[i];

	            for (int j = i + 1; j < nums.length; j++) {

	                int complement = remaining - nums[j];

	                if (map.containsKey(complement)) {
	                    return new int[] {i, map.get(complement), j};
	                }

	                map.put(nums[j], j);
	            }
	        }

	        return new int[] {};
	    }

	    public static void main(String[] args) {

	        int[] nums = {2, 7, 11, 15, 3};
	        int target = 20;

	        int[] result = threeSum(nums, target);

	        System.out.println(
	            result[0] + " " + result[1] + " " + result[2]
	        );
	    }
	}