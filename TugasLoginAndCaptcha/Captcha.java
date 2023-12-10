import java.util.Random;

public class Captcha {

    private static final int batasKiri = 97; // letter 'a'
    private static final int batasKanan = 122; // letter 'z'
    private static final int panjangString = 8;

    public String generateRandomCaptcha() {
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(panjangString);
        for (int i = 0; i < panjangString; i++) {
            int randomLimitedInt = batasKiri + (int) (random.nextFloat() * (batasKanan - batasKiri + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }
}
