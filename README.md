# FizzBuzz
Decoupled FizzBuzz

## Main class

    public void doIt(int finalIndex) {
        FizzBuzzRules rules = new FizzBuzzRules();
        RuleCommand command = new RuleCommand(rules);
        IntStream.range(1, finalIndex)
                .boxed()
                .map(command::run)
                .forEach(out::println);
    }

## Command

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

### Prerequisites

None

## Authors

Luciano Cardoso https://github.com/cardocha

## License

This project is licensed under the Apache 2 License - see the https://apache.org/licenses/LICENSE-2.0 file for details
