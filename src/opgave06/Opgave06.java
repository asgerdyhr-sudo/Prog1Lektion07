package opgave06;

public class Opgave06 {
    public static void main(String[] args) {
        char[] romanNumber = {'X', 'I', 'X', 'X', 'I', 'X'}; //1061
        System.out.println(romanNumberToArabicNumber(romanNumber));
    }

    private static int romanNumberToArabicNumber(char[] romanNumber) {
        //Din implementering her.
        int total = 0;  // Dette er den variabel, der holder det samlede arabertal

        // Gå igennem alle romertal i arrayet (fra venstre mod højre)
        for (int i = 0; i < romanNumber.length; i++) {
            // Tjek om vi er i slutningen af arrayet, eller om det nuværende romertal er mindre end det næste
            if (i + 1 < romanNumber.length && SingleRomanNumberToArabicNumber(romanNumber[i]) < SingleRomanNumberToArabicNumber(romanNumber[i + 1])) {
                // Hvis romertallet til venstre er mindre end det til højre (f.eks. IV eller IX), trækker vi det fra
                total -= SingleRomanNumberToArabicNumber(romanNumber[i]);
            } else {
                // Ellers lægger vi det nuværende romertal til totalen
                total += SingleRomanNumberToArabicNumber(romanNumber[i]);
            }
        }

        return total;  // Returner den samlede værdi
    }

    private static int SingleRomanNumberToArabicNumber(char roman) {
        return switch (roman) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException(roman + " is not a valid roman number literal.");
        };
    }
}
