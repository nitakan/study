fun main(args: Array<String>) =
        listOf(args.getOrNull(0))
                .map{it?.toIntOrNull()?:50}
                .flatMap { IntRange(0, it) }
                .map { when {
                    it % 15 == 0 -> "FizzBuzz"
                    it % 3 == 0 -> "Fizz"
                    it % 5 == 0 -> "Buzz"
                    else -> it.toString() } }
                .forEach(System.out::println)

