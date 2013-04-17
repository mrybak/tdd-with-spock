package pl.mrybak.utils;

/**
 * Created with IntelliJ IDEA.
 * User: mrybak
 * Date: 17.04.13
 * Time: 18:51
 * To change this template use File | Settings | File Templates.
 */
public class PositionalRepresentation {
    private int number;

    public PositionalRepresentation(int number) {
        this.number = number;
    }

    public String getRepresentation(int radix) {
        // negative radix or radix > 36 (we have 10 digits and 26 letters only...) is not supported
        if (radix < 0 || radix > 36) {
            throw new IllegalArgumentException();
        }
        return "";
    }
}
