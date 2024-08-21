public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
                13, 14, 15, 16};

        int num = 5;

        int middle = array.length / 2;
    }
        private static int binarySearch(int[] array, int num, int left, int right) {
            if(left == right) {
                return (array[left] == num) ? left : -1;
            }
            int middle = left + (right - left) / 2;

            if(num > array[middle]) {
                return binarySearch(array, num, middle + 1, right);
            } else if(array[middle] > num) {
                    return binarySearch(array, num, left, middle - 1);
            }
            return middle;
    }
}
