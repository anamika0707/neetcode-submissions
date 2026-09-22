class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            int n=target-nums[i];
            if(map.containsKey(n) && map.get(n) != i){
                int j=map.get(n);
               ans[0]=Math.min(i,j);
               ans[1]=Math.max(i,j);
                break;
            }
        }
        return ans;
    }
}
