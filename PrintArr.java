public class PrintArr {
    static void print() {
        int arr[] = Data.arr;
        int len = Data.len;

        int i;
        for(i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }
}