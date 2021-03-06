import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int[] left, int[] right) {
        if (right.length == 0) {
            return left;
        }
        int[] result = new int[left.length + right.length];
        int l = 0, r = 0, cur = 0;
        while (l < left.length || r < right.length) {
            if (l == left.length || (r < right.length && right[r] < left[l])) {
                result[cur++] = right[r++];
            }
            else {
                result[cur++] = left[l++];
            }
        }
        // 优先合并左数组
//        while (l < left.length && r < right.length) {
//            int leftNum = left[l];
//            int rightNum = right[r];
//            if (leftNum <= rightNum) {
//                result[cur++] = left[l++];
//            } else {
//                result[cur++] = right[r++];
//            }
//        }
//        // 合并剩下的右数组
//        if (cur < left.length + right.length) {
//            if (l == left.length) {
//                while (r < right.length) {
//                    result[cur++] = right[r++];
//                }
//            }
//            else if (r == right.length) {
//                while (l < left.length) {
//                    result[cur++] = left[l++];
//                }
//            }
//        }
        return result;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1 || array.length == 0) {
            System.out.println(Arrays.toString(array));
            return array;
        }
        // 左边
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, array.length/2));
        // 右边
        int[] right = mergeSort(Arrays.copyOfRange(array, array.length/2, array.length));
        // 左右归并
        int[] result = merge(left, right);
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        int[] a = { 56, 29, 35, 42, 15, 41, 75, 21 };
        a = mergeSort(a);
        System.out.println("排序结果：" + Arrays.toString(a));
    }
}
