public class Rule {

    private final int mod;

    private final String word;

    public Rule(int mod, String word) {
        this.mod = mod;
        this.word = word;
    }

    public String apply(int num) {
        return num % mod == 0 ? word : "";
    }

}
