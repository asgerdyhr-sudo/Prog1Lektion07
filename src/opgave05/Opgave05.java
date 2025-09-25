package opgave05;

public class Opgave05 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 8};
        int[] result = intArrayFourInrow(array);
        if (result.length == 0) {
            System.out.println("Der er ingen fire ens i træk i arrayet.");
        } else {
            System.out.print("Fire ens i træk fundet på positionerne: ");
            for (int index : result) {
                System.out.print(index + " ");
            }
        }
    }

        private static int[] intArrayFourInrow ( int[] array){
            for (int i = 0; i < array.length - 3; i++) {
                if (array[i] == array[i + 1] && array[i] == array[i + 2] && array[i] == array[i + 3]) {
                    return new int[]{i, i + 1, i + 2, i + 3};
                }
            }
            return new int[]{};
        }
}
