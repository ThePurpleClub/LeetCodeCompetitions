//3069. Distribute Elements Into Two Arrays I
//weekly contest 387
class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(nums[0]);
        if(n>1) list2.add(nums[1]);
        for (int i = 2; i < n ; i++) {
            if (list1.getLast() > list2.getLast())
                list1.add(nums[i]);
            else
                list2.add(nums[i]);
        }
        
        ArrayList<Integer> merge = new ArrayList<>();
        merge.addAll(list1);
        merge.addAll(list2);
        return merge.stream().mapToInt(i -> i).toArray();

    }
}
