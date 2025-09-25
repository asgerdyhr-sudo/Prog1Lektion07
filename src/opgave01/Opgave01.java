package opgave01;

public class Opgave01 {
    public static void main(String[] args) {
        int[] integerArray = getIntegerArray();
        //opgave A
        System.out.println("Printer array:");
        printAraay(integerArray);

        System.out.println();

        //Opgave B
        System.out.println("Printer summen af array");
        System.out.println(sumArray(integerArray));

        System.out.println();

        //Opgave C
        System.out.println("Gennemsnitten af arrayet er:");
        System.out.println(averageArray(integerArray));

        System.out.println();

        //Opgave D
        System.out.println("Tværsummen af arret er;");
        printAraay(crossSumArray(integerArray));

        System.out.println();
        System.out.println();

        //Opgave E
        System.out.println("Tværsummen af tværsummer er:");
        printAraay(singleDigtCrossSumArray(integerArray));
    }

    public static int crossSum(int number) {
        int crossSum = 0;
        while (number > 0) {
            crossSum += number % 10;
            number = number / 10;
        }
        return crossSum;
    }

    private static int[] getIntegerArray() {
        int[] integerArray = {1095, 12, 9065, 387, 700, 20, 5, 2065, 97654, 103, 789, 50, 1972, 200, 35, 98, 1002};
        return integerArray;
    }

    public static void printAraay(int[] array) {
        System.out.println("Dit array indeholde følgende tal:");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum += array[index];

        }
        return sum;
    }

    public static double averageArray(int[]array){
        int average = sumArray(array) / array.length;
        return average;
    }

    public static int [] crossSumArray(int[]array){
        int [] tværsum = new int [array.length];
        for (int i = 0;i<array.length;i++){
            tværsum[i] = crossSum(array[i]);
        }
        return tværsum;
    }

    public static int [] singleDigtCrossSumArray(int[]array){
        int [] singleDigtCrossSum = new int [9];
        for (int i = 0;i<array.length;i++){
            int crossSum = crossSum(array[i]);
            while (crossSum > 9){
                crossSum = crossSum(crossSum);
            }
            singleDigtCrossSum[crossSum-1]++;
        }
        return singleDigtCrossSum;

    }


}