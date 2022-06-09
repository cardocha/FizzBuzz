import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FizzBuzzRules implements RulesSet {

    @Override
    public Set<Rule> getRules() {
        return new HashSet<>(Arrays.asList(new Rule(3, "FIZZ"), new Rule(5, "BUZZ")));
    }
}
