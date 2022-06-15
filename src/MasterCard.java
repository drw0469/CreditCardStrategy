
/*
 * @author David Walker
 */

public class MasterCard extends CreditCard {

    public MasterCard() {
        vs = new MasterCardStrategy();
    }

    public boolean validate(String str) {
        return vs.isValid(str);
    }

}
