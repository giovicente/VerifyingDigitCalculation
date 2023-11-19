public class VerifyingDigitCalculator {

    public static int calculateVerifyingDigit(String account) {
        int auxValue, total = 0;
        final int MODULE = 10;

        for (int i = 0; i < account.length(); i++) {
            auxValue = Character.getNumericValue(account.charAt(i));

            if (i % 2 == 0) {
                auxValue *= 2;
                if (auxValue >= 10) {
                    String convertedAuxValue = String.valueOf(auxValue);
                    auxValue = Character.getNumericValue(convertedAuxValue.charAt(0))
                            + Character.getNumericValue(convertedAuxValue.charAt(1));
                }
            }

            total += auxValue;
        }

        int remainder = total % MODULE;
        return remainder != 0 ? MODULE - remainder : 0;
    }
}
