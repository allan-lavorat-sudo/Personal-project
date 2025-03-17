import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomParameters;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PasswordGenerator {
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIALS = "!@#$%^&*()-_+=<>?";

    private static final List<String> COMPLEX_WORDS = Arrays.asList(
        "zephyr", "quantum", "paradox", "synthesis", 
        "enigmatic", "ethereal", "labyrinth", "kaleidoscope",
        "serendipity", "mellifluous", "ephemeral", "nebulous",
        "cacophony", "renaissance", "phenomenon", "synchronicity",
        "quintessence", "metamorphosis", "euphoria", "aberration"
    );

    private static final SecureRandom RANDOM = new SecureRandom();

    public static void main(String[] args) {
        String password = generatePassword(60);
        System.out.println("Generated Password: " + password);
    }

    public static String getUPPER() {
        return UPPER;
    }

    public static String getLOWER() {
        return LOWER;
    }

    public static String getDIGITS() {
        return DIGITS;
    }

    public static String getSPECIALS() {
        return SPECIALS;
    }

    public static List<String> getCOMPLEX_WORDS() {
        return COMPLEX_WORDS;
    }

    public static SecureRandom getRANDOM() {
        return RANDOM;
    }

    public static void setUPPER(String upper) {
        // UPPER is final and cannot be reassigned
        throw new UnsupportedOperationException("UPPER is a constant and cannot be changed");
    }

    public static void setLOWER(String lower) {
        // LOWER is final and cannot be reassigned
        throw new UnsupportedOperationException("LOWER is a constant and cannot be changed");
    }

    public static void setDIGITS(String digits) {
        // DIGITS is final and cannot be reassigned
        throw new UnsupportedOperationException("DIGITS is a constant and cannot be changed");
    }

    public static void setSPECIALS(String specials) {
        // SPECIALS is final and cannot be reassigned
        throw new UnsupportedOperationException("SPECIALS is a constant and cannot be changed");
    }

    public static void setCOMPLEX_WORDS(List<String> complexWords) {
        // COMPLEX_WORDS is final and cannot be reassigned
        throw new UnsupportedOperationException("COMPLEX_WORDS is a constant and cannot be changed");
    }

    public static void setRANDOM(SecureRandom random) {
        // RANDOM is final and cannot be reassigned
        throw new UnsupportedOperationException("RANDOM is a constant and cannot be changed");
    }

    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder(length);
        String charCategories = UPPER + LOWER + DIGITS + SPECIALS;

        for (int i = 0; i < length - 20; i++) {
            int index = RANDOM.nextInt(charCategories.length());
            password.append(charCategories.charAt(index));
        }

        // Add complex words randomly at the end
        int wordCount = RANDOM.nextInt(3) + 1; // Add 1 to 3 words
        for (int i = 0; i < wordCount; i++) {
            String complexWord = COMPLEX_WORDS.get(RANDOM.nextInt(COMPLEX_WORDS.size()));
            password.append(complexWord);
        }

        return password.toString();
        }

        public PasswordGenerator() {
        initializeSecureRandom();
        }

        @Override
        public int hashCode() {
            return RANDOM.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            return RANDOM.equals(PasswordGenerator.RANDOM);
        }

        public boolean isDeprecated() {
            return RANDOM.isDeprecated();
        }

        public int nextInt() {
            return RANDOM.nextInt();
        }

        public int nextInt(int bound) {
            return RANDOM.nextInt(bound);
        }

        public long nextLong() {
            return RANDOM.nextLong();
        }

        public boolean nextBoolean() {
            return RANDOM.nextBoolean();
        }

        public float nextFloat() {
            return RANDOM.nextFloat();
        }

        public float nextFloat(float bound) {
            return RANDOM.nextFloat(bound);
        }

        public float nextFloat(float origin, float bound) {
            return RANDOM.nextFloat(origin, bound);
        }

        public double nextDouble() {
            return RANDOM.nextDouble();
        }

        public double nextDouble(double bound) {
            return RANDOM.nextDouble(bound);
        }

        public double nextDouble(double origin, double bound) {
            return RANDOM.nextDouble(origin, bound);
        }

        public double nextGaussian() {
            return RANDOM.nextGaussian();
        }

        public final Provider getProvider() {
            return RANDOM.getProvider();
        }

        public String getAlgorithm() {
            return RANDOM.getAlgorithm();
        }

        public SecureRandomParameters getParameters() {
            return RANDOM.getParameters();
        }

        public void setSeed(byte[] seed) {
            RANDOM.setSeed(seed);
        }

        public int nextInt(int origin, int bound) {
            return RANDOM.nextInt(origin, bound);
        }

        public void setSeed(long seed) {
            RANDOM.setSeed(seed);
        }

        public long nextLong(long bound) {
            return RANDOM.nextLong(bound);
        }

        public void nextBytes(byte[] bytes) {
            RANDOM.nextBytes(bytes);
        }

        public void nextBytes(byte[] bytes, SecureRandomParameters params) {
            RANDOM.nextBytes(bytes, params);
        }

        public long nextLong(long origin, long bound) {
            return RANDOM.nextLong(origin, bound);
        }

        public IntStream ints(long streamSize) {
            return RANDOM.ints(streamSize);
        }

        public IntStream ints() {
            return RANDOM.ints();
        }

        public double nextGaussian(double mean, double stddev) {
            return RANDOM.nextGaussian(mean, stddev);
        }

        public IntStream ints(long streamSize, int randomNumberOrigin, int randomNumberBound) {
            return RANDOM.ints(streamSize, randomNumberOrigin, randomNumberBound);
        }

        public byte[] generateSeed(int numBytes) {
            return RANDOM.generateSeed(numBytes);
        }

        public double nextExponential() {
            return RANDOM.nextExponential();
        }

        public IntStream ints(int randomNumberOrigin, int randomNumberBound) {
            return RANDOM.ints(randomNumberOrigin, randomNumberBound);
        }

        public LongStream longs(long streamSize) {
            return RANDOM.longs(streamSize);
        }

        public LongStream longs() {
            return RANDOM.longs();
        }

        public LongStream longs(long streamSize, long randomNumberOrigin, long randomNumberBound) {
            return RANDOM.longs(streamSize, randomNumberOrigin, randomNumberBound);
        }

        public void reseed() {
            RANDOM.reseed();
        }

        public void reseed(SecureRandomParameters params) {
            RANDOM.reseed(params);
        }

        public LongStream longs(long randomNumberOrigin, long randomNumberBound) {
            return RANDOM.longs(randomNumberOrigin, randomNumberBound);
        }

        public DoubleStream doubles(long streamSize) {
            return RANDOM.doubles(streamSize);
        }

        public DoubleStream doubles() {
            return RANDOM.doubles();
        }

        public DoubleStream doubles(long streamSize, double randomNumberOrigin, double randomNumberBound) {
            return RANDOM.doubles(streamSize, randomNumberOrigin, randomNumberBound);
        }

        public DoubleStream doubles(double randomNumberOrigin, double randomNumberBound) {
            return RANDOM.doubles(randomNumberOrigin, randomNumberBound);
        }

        private void initializeSecureRandom() {
        try {
            SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e) {
            // Fallback to default if SHA1PRNG is not available
            // SecureRandom random = new SecureRandom(); // No need to create a new instance here
        }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PasswordGenerator{");
            sb.append("UPPER='").append(UPPER).append('\'');
            sb.append(", LOWER='").append(LOWER).append('\'');
            sb.append(", DIGITS='").append(DIGITS).append('\'');
            sb.append(", SPECIALS='").append(SPECIALS).append('\'');
            sb.append(", COMPLEX_WORDS=").append(COMPLEX_WORDS);
            sb.append(", RANDOM=").append(RANDOM);
            sb.append('}');
            return sb.toString();
        }
}
