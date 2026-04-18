public class binaarySearch {
    //sorting in java
      /* its works in sorting array
      int arr = [3,4,6,7,8,9,12,14,16,17,23,25,34]
      key = 3;
     low = 0 & high = n-1 & mid = (low+high)/2;
     while(low <= high){
    mid = (low+high)/2;
    if(key == arr[mid]{
    return mid;
    } else if (key <arr[mid]{
    high = m-1;
    low = l0w;
    } else {
    low = mid+1;
    high = high;
    }
}
time complextry = O(log n)
space complexty =
       */
    public static int binary(int[] arr, int key){
        int low =0, high = arr.length-1, mid = 0;
        while(low <= high){
            mid = (low+high)/2;
            if(key == arr[mid]){
            return mid;
            } else if(key < arr[mid]) {
            high = mid-1;
            low = low;
            } else {
                low = mid+1;
                high = high;
            }
        }
        return -1;
    }
    public static void main (String [] args){
        int[] arr = {3,4,6,7,8,9,12,14,16,17,23,25,34};
        int key = 14;
        System.out.println(binary(arr,key));
    }
}
