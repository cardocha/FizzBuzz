# FizzBuzz
Desacopled FizzBuzz

    public void doIt(int finalIndex) {
        FizzBuzzRules rules = new FizzBuzzRules();
        RuleCommand command = new RuleCommand(rules);
        IntStream.range(1, finalIndex)
                .boxed()
                .map(command::run)
                .forEach(out::println);
    }

### Prerequisites

None

## Authors

Luciano Cardoso https://github.com/cardocha

## License

This project is licensed under the Apache 2 License - see the https://apache.org/licenses/LICENSE-2.0 file for details
