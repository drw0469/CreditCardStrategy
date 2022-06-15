
/*
 * @author David Walker
 */

public class Visa extends CreditCard {

    public Visa() {
        vs = new VisaStrategy();
    }

    public boolean validate(String str) {
        return vs.isValid(str);
    }
}
