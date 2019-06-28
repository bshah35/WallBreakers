/**
Using a HashMap store target-nums[i] as key and the index as value. Doing would gurantee and yeild the result because the key would
be found in the map.

Language: Java

Time complexity: O(n)

Space complexity: O(n)

Runtime: 2 ms, faster than 98.95% of Java online submissions for Two Sum.
Memory Usage: 37.4 MB, less than 99.58% of Java online submissions for Two Sum.
**/


 public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                res[0] = map.get(nums[i]);
                res[1] = i;
                return res;
            }
            map.put(target - nums[i], i);
        }
        return res;
    }