public class QuickSort {
    public static void main(String[] args){
        int[] arr = {6,3,8,23,83,8,5,43};
    }
    public static void qs(Integer[] arr){
        quickSort(arr,0,arr.length-1);
    }

    public static void quickSort(Integer[] arr,int startindex,int endindex){
        int idx = partition(arr, startindex, endindex);

        if (startindex < idx - 1) {
            quickSort(arr, startindex, idx - 1);
        }

        if (endindex > idx) {
            quickSort(arr, idx, endindex);
        }
    }

    public static int partition(Integer[] arr,int left,int right){
        int pivot=arr[left];
        while(left<=right){
            while(arr[left]<pivot){
                left++;
            }
            while(arr[right]>pivot){
                right--;
            }
            if(left<=right){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;

                left++;
                right--;
            }

        }
        return left;
    }
}