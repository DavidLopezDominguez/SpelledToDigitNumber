package Business;

import Business.Modules.Parser;

public class ParserManager {
    public long calculateNumber(String numberString) throws NumberFormatException, IndexOutOfBoundsException, IllegalArgumentException {
        return new Parser().calculateNumber(numberString);
    }
}
