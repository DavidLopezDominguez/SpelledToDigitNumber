package Business;

import Business.Modules.Parser;

/**
 * That class manages the Parser class.
 */
public class ParserManager {
    /**
     * That function calls the Parser class to calculate the number.
     *
     * @param numberString: a string with the number to convert.
     * @return the number converted.
     * @throws NumberFormatException
     * @throws IndexOutOfBoundsException
     * @throws IllegalArgumentException
     */
    public long calculateNumber(String numberString) throws NumberFormatException, IndexOutOfBoundsException, IllegalArgumentException {
        return new Parser().calculateNumber(numberString);
    }
}
