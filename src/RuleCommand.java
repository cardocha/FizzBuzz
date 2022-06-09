import java.util.Set;
import java.util.stream.Collectors;

public class RuleCommand {

    private final Set<Rule> rules;

    private String output;

    public RuleCommand(RulesSet rulesSet) {
        this.rules = rulesSet.getRules();
    }

    public String run(int num) {
        output = rules.stream()
                .map(rule -> rule.apply(num))
                .collect(Collectors.joining(""));
        after(num);
        return output;
    }

    public void after(int num) {
        output = output.isEmpty() ? String.valueOf(num) : output;
    }

}
