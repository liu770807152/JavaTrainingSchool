import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        double[] d;
        d = new double[5];
        // double[] d = new double[5];
        d[0] = 99.9;
        // 中间自动填充0
        d[2] = 88.8;
        d[3] = 77.7;
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        System.out.println(d[3]);
        System.out.println(d[4]);
        System.out.println("Length of d is: "+d.length);

        int x = 7;
        // int[] i = new int[5];
        int[] i = { 2, 3, 4, 5, x};
        System.out.println(i[0]);
        System.out.println(i[4]);
        x = 42;
        // i[4]已经指向了7的内存区域，x重定向至新的内存区域不影响数组i (传值)
        // 结果是？
        System.out.println(i[4]);

        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
        for (double temp : d) {
            System.out.println(temp);
        }
    }
}
