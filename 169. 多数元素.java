class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> counter = new HashMap<>();

        for(int num :nums){
            counter.put(num,counter.getOrDefault(num,0)+1);
            if (counter.get(num) > nums.length>>1){
                return num;
            }
        }
        return -1;
    }
}
