package hashmap;

import java.util.HashMap;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store the indices of the elements
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            System.out.println("Complement is :" + complement);
            
            // If the complement exists in the map, return the indices
            if (map.containsKey(complement)) {
            	System.out.println("Exists : " + complement);
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, put the current element and its index into the map
            map.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array
        return new int[0];
    }
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
		
	}

}
