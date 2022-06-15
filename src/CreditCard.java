
/*
 * @author David Walker
 */

public abstract class CreditCard {
    ValidationStrategy vs;

    public boolean validate(String str) {
        return vs.isValid(str);
    }
}
