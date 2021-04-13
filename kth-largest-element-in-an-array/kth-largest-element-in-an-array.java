class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums == null ||  nums.length == 0){
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;
        while(true){
            // pos + 1就是第几大数
            // pos就是位置，所以比第几大数少一个
            int pos = position(nums, left, right);
            if(pos + 1 == k){
                return nums[pos];
            // 加入求第四大数
            // 而此时pos = 4
            // pos + 1 > 4
            // right = 3
            // 这时，让然包括了结果
            } else if(pos + 1 > k){
                right = pos - 1;
            } else {
                left = pos + 1;
            }
        }

    }

    private int position(int[] nums, int left, int right){
        int pivot = nums[left];
        int l = left + 1;
        int r = right;
        // 使得pivot左边的值都大于它，右边的值都小于它
        // 要使用 <=
        // 否则[2,1] 1这种情况会报错
        while(l <= r){
            if(nums[l] < pivot && nums[r] > pivot){
                swap(nums, l, r);
                l++;
                r--;
            }
            // 跳过符合条件的值
            if(nums[l] >= pivot) l++;
            if(nums[r] <= pivot) r--;
        }

        swap(nums, left, r);
        return r;
    }

    private void swap(int[] nums, int left, int right){
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
}