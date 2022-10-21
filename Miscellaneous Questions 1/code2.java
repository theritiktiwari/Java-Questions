public class code2 {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 4, 5, 6, 7, 8, 9, 10 };
        int count = 0;
        System.out.print("Original array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }

        System.out.print("After removing even elements : ");
        for (int i = 0; i < arr.length - count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}