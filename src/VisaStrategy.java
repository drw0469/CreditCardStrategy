

public class VisaStrategy implements ValidationStrategy {

    public boolean isValid(String str) {

        boolean isValid;
        isValid = str.startsWith("4");

        if(isValid) {
            isValid = str.length() == 16;
        }

        return isValid;
    }
}
