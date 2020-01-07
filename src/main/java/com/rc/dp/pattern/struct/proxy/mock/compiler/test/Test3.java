package com.rc.dp.pattern.struct.proxy.mock.compiler.test;

import java.util.Arrays;

/**
 * @ClassName Test3
 * @Description TODO
 * @Author liux
 * @Date 19-12-24 下午9:38
 * @Version 1.0
 */
public class Test3 {

    public static void main(String[] args) {
        int[] numArray = {0, 1, 2, 2, 2, 3, 3, 6, 6, 7, 7, 10};
        removeDuplicates(numArray);
        System.out.println(Arrays.toString(numArray));

    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                if (q - p > 1) {
                    nums[p + 1] = nums[q];
                }
                p++;
            }
            q++;
        }
        return p + 1;
    }
}
