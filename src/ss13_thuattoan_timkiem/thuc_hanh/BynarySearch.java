package ss13_thuattoan_timkiem.thuc_hanh;

public class BynarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int bynarySearch(int[] list, int key) {
        int left = 0;
        int right = list.length - 1;
        while (right >= left) {
            int mid = (right + left) / 2;
            if (key < list[mid]) {
                right = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(bynarySearch(list, 2));  /* 0 */
        System.out.println(bynarySearch(list, 11)); /* 4 */
        System.out.println(bynarySearch(list, 79)); /*12 */
        System.out.println(bynarySearch(list, 1));  /*-1 */
        System.out.println(bynarySearch(list, 5));  /*-1 */
        System.out.println(bynarySearch(list, 80)); /*-1 */
    }
}
