public class Linear_search {
    public static void sort() {
        int[] arr = Data.arr;
        int len = Data.len;
        int i,j;

        for(i = 0; i < len-1 ; i++) {
            for(j = i+1; j < len; j++){
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}