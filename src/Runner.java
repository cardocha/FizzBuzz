import java.util.stream.IntStream;

import static java.lang.System.out;

public class Runner {

    public void doIt(int finalIndex) {
        FizzBuzzRules rules = new FizzBuzzRules();
        RuleCommand command = new RuleCommand(rules);
        IntStream.range(1, finalIndex)
                .boxed()
                .map(command::run)
                .forEach(out::println);
    }

}
