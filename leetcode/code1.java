class code1 {

    //解题思路：双指针
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length ; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    int[] res = new int[2];
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return null;
    }
}