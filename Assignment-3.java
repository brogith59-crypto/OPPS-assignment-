public class GenericSwap {

    // Generic static method to swap two elements
    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swapping (Integer): ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }

        // Swap elements
        swap(intArray, 1, 3);

        System.out.println("\nAfter swapping (Integer): ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }

        // String array
        String[] strArray = {"Java", "Python", "C++", "Ruby"};
        System.out.println("\n\nBefore swapping (String): ");
        for (String str : strArray) {
            System.out.print(str + " ");
        }

        // Swap elements
        swap(strArray, 0, 2);

        System.out.println("\nAfter swapping (String): ");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
    }
}
