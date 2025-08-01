package Business.Modules;

import java.util.LinkedList;

public class Parser {
    /**
     * Array of strings with the multipliers.
     */
    private String[] noNumbers = {"Hundred",
            "Thousand",
            "Ten thousand",
            "Hundred thousand",
            "Million",
            "Billion",
            "Trillion",
            "Quadrillion",
            "Quintillion",
            "Sextillion",
            "Septillion",
            "Octillion",
            "Nonillion",
            "Decillion",
            "Undecillion",
            "Duodecillion",
            "Centillion"};

    /**
     * This function multiplies the number with the corresponding pultiplier.
     *
     * @param numberName: the multiplier in words.
     * @param number: the number to multiply.
     * @return the number multiplied.
     */
    public static long scaleNumber(String numberName, long number) {
        // Centillion = 10^303, too large for long → throw exception or use BigInteger
        return switch (numberName) {
            case "Hundred" -> number * 100L;
            case "Thousand" -> number * 1_000L;
            case "Ten thousand" -> number * 10_000L;
            case "Hundred thousand" -> number * 100_000L;
            case "Million" -> number * 1_000_000L;
            case "Billion" -> number * 1_000_000_000L;
            case "Trillion" -> number * 1_000_000_000_000L;
            case "Quadrillion" -> number * 1_000_000_000_000_000L;
            case "Quintillion" -> number * 1_000_000_000_000_000_000L;
            case "Sextillion" -> number * (long) Math.pow(10, 21);
            case "Septillion" -> number * (long) Math.pow(10, 24);
            case "Octillion" -> number * (long) Math.pow(10, 27);
            case "Nonillion" -> number * (long) Math.pow(10, 30);
            case "Decillion" -> number * (long) Math.pow(10, 33);
            case "Undecillion" -> number * (long) Math.pow(10, 36);
            case "Duodecillion" -> number * (long) Math.pow(10, 39);
            case "Centillion" ->
                    throw new IllegalArgumentException("Centillion is too large for long. Use BigInteger.");
            default -> throw new IllegalArgumentException("Unknown number name: " + numberName);
        };
    }

    /**
     * That funcion returns the relative long number of the string.
     *
     * @param word: string to convert into a long number.
     * @return the long number.
     */
    public static long wordToNumber(String word) {
        switch (word) {
            case "Zero": return 0L;
            case "One": return 1L;
            case "Two": return 2L;
            case "Three": return 3L;
            case "Four": return 4L;
            case "Five": return 5L;
            case "Six": return 6L;
            case "Seven": return 7L;
            case "Eight": return 8L;
            case "Nine": return 9L;
            case "Ten": return 10L;
            case "Eleven": return 11L;
            case "Twelve": return 12L;
            case "Thirteen": return 13L;
            case "Fourteen": return 14L;
            case "Fifteen": return 15L;
            case "Sixteen": return 16L;
            case "Seventeen": return 17L;
            case "Eighteen": return 18L;
            case "Nineteen": return 19L;
            case "Twenty": return 20L;
            case "Twenty-one": return 21L;
            case "Twenty-two": return 22L;
            case "Twenty-three": return 23L;
            case "Twenty-four": return 24L;
            case "Twenty-five": return 25L;
            case "Twenty-six": return 26L;
            case "Twenty-seven": return 27L;
            case "Twenty-eight": return 28L;
            case "Twenty-nine": return 29L;
            case "Thirty": return 30L;
            case "Thirty-one": return 31L;
            case "Thirty-two": return 32L;
            case "Thirty-three": return 33L;
            case "Thirty-four": return 34L;
            case "Thirty-five": return 35L;
            case "Thirty-six": return 36L;
            case "Thirty-seven": return 37L;
            case "Thirty-eight": return 38L;
            case "Thirty-nine": return 39L;
            case "Forty": return 40L;
            case "Forty-one": return 41L;
            case "Forty-two": return 42L;
            case "Forty-three": return 43L;
            case "Forty-four": return 44L;
            case "Forty-five": return 45L;
            case "Forty-six": return 46L;
            case "Forty-seven": return 47L;
            case "Forty-eight": return 48L;
            case "Forty-nine": return 49L;
            case "Fifty": return 50L;
            case "Fifty-one": return 51L;
            case "Fifty-two": return 52L;
            case "Fifty-three": return 53L;
            case "Fifty-four": return 54L;
            case "Fifty-five": return 55L;
            case "Fifty-six": return 56L;
            case "Fifty-seven": return 57L;
            case "Fifty-eight": return 58L;
            case "Fifty-nine": return 59L;
            case "Sixty": return 60L;
            case "Sixty-one": return 61L;
            case "Sixty-two": return 62L;
            case "Sixty-three": return 63L;
            case "Sixty-four": return 64L;
            case "Sixty-five": return 65L;
            case "Sixty-six": return 66L;
            case "Sixty-seven": return 67L;
            case "Sixty-eight": return 68L;
            case "Sixty-nine": return 69L;
            case "Seventy": return 70L;
            case "Seventy-one": return 71L;
            case "Seventy-two": return 72L;
            case "Seventy-three": return 73L;
            case "Seventy-four": return 74L;
            case "Seventy-five": return 75L;
            case "Seventy-six": return 76L;
            case "Seventy-seven": return 77L;
            case "Seventy-eight": return 78L;
            case "Seventy-nine": return 79L;
            case "Eighty": return 80L;
            case "Eighty-one": return 81L;
            case "Eighty-two": return 82L;
            case "Eighty-three": return 83L;
            case "Eighty-four": return 84L;
            case "Eighty-five": return 85L;
            case "Eighty-six": return 86L;
            case "Eighty-seven": return 87L;
            case "Eighty-eight": return 88L;
            case "Eighty-nine": return 89L;
            case "Ninety": return 90L;
            case "Ninety-one": return 91L;
            case "Ninety-two": return 92L;
            case "Ninety-three": return 93L;
            case "Ninety-four": return 94L;
            case "Ninety-five": return 95L;
            case "Ninety-six": return 96L;
            case "Ninety-seven": return 97L;
            case "Ninety-eight": return 98L;
            case "Ninety-nine": return 99L;
            default:
                throw new IllegalArgumentException("Unknown number word: " + word);
        }
    }

    /**
     * A boolean function that return if the string is a number or not.
     *
     * @param string: string to evaluate.
     * @return true if is not a number and false if it is.
     */
    private boolean isNotANumber(String string) {
        for (String number : noNumbers) {
            if (string.equalsIgnoreCase(number)) return true;
        }
        return false;
    }

    /**
     * That funcion converts a string into a number.
     *
     * @param string: a string with the number to convert.
     * @return the number converted.
     * @throws NumberFormatException
     * @throws IndexOutOfBoundsException
     * @throws IllegalArgumentException
     */
    public long calculateNumber(String string) throws NumberFormatException, IndexOutOfBoundsException, IllegalArgumentException {
        long number = 0;
        long tempNumber = 0;
        long multiplier = 1;

        String[] spelledNumber = string.split(" ");
        LinkedList<String> multipliers  = new LinkedList<>();
        int multiplierIndex = 0;

        for (int i = spelledNumber.length - 1; i >= 0; i--) {
            if (isNotANumber(spelledNumber[i])) {
                multipliers.add(multiplierIndex, spelledNumber[i]);
                multiplierIndex++;
                multiplier *= scaleNumber(spelledNumber[i], 1);
            }
            else {
                if (multiplierIndex > 1) {
                    if (multipliers.get(multiplierIndex - 1).equals("Hundred")) {
                        multiplier = 100 * scaleNumber(multipliers.get(multiplierIndex - 2), 1);
                    }
                }
                tempNumber = wordToNumber(spelledNumber[i]) * multiplier;
                number += tempNumber;
                multiplier = 1;
            }
        }

        return number;
    }
}
