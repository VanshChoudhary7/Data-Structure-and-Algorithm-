public class Selection_sort {
    public static void sort() {
        int[] arr = Data.arr;
        int len = Data.len;
        int i,j;

        for(i = 0; i < len-1; i++) {
            int min = i;
            for(j = i+1; j < len; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
} 
}