class Solution {
    private void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void reverse(char[] arr, int i, int j){
        while(i<j)
            swap(arr, i++, j--);
    }
    public int nextGreaterElement(int c) {
        char[] arr = (""+c).toCharArray();

        int n = arr.length;
        int i = n-2;
        while(i >= 0 && arr[i+1] <= arr[i]) i--;
        if(i<0) return -1;
        int j = n-1;
        while(j>=0 && arr[j] <= arr[i]){
            j--;
        }
        swap(arr, i, j);
        reverse(arr, i+1, n-1);
        long result = Long.parseLong(new String(arr));
        return result > Integer.MAX_VALUE ? -1 : (int) result;
    }
}