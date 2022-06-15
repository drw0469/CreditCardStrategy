
/*
 * @author David Walker
 */

public class MasterCardStrategy implements ValidationStrategy {

    public boolean isValid(String str) {
        boolean isValid = true;
        isValid = str.startsWith("5");

        if(isValid) {
            isValid = str.length() == 16;
        }
        return isValid;
    }
}
