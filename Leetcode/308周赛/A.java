import java.util.Arrays;

/**
 * Copyright (c) 2022, Bongmi
 * All rights reserved
 * Author: yinpeng@bongmi.com
 */


class A {
  public int[] answerQueries(int[] nums, int[] queries) {
    int[] ans = new int[queries.length];
    //排序
    Arrays.sort(nums);
    //前缀和
    int[] preSum = new int[nums.length + 1];
    for (int i = 1; i < preSum.length; i++) {
      preSum[i] = preSum[i - 1] + nums[i - 1];
    }
    for (int k = 0; k < queries.length; k++) {
      //二分
      int left = 1;
      int right = preSum.length;
      while (left < right) {
        int mid = left + (right - left) / 2;
        if (preSum[mid] <= queries[k]) {
          left = mid + 1;
        } else {
          right = mid;
        }
      }
      ans[k] = left - 1;
    }
    return ans;
  }
}
