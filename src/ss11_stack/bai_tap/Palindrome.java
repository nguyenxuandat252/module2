package ss11_stack.bai_tap;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        int size = arr.length / 2;
        System.out.println(size);
        char[] arr1 = new char[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = arr[i];
        }
        System.out.println(arr1);
        char[] arr2 = new char[size];
        for (int i = 0; i < size; i++) {
            arr2[i] = arr[arr.length - size + i];
        }
        System.out.println(arr2);
        boolean check = true;
        for (int i = 0; i < size; i++) {
            if (arr1[i] != arr2[size - 1 - i]) {
                check = false;
            }
        }
        if (check) {
            System.out.println("Chuỗi là Palindrome.");
        } else {
            System.out.println("Chuỗi không phải là Palindrome.");
        }
    }
}
