# JavaStudies

Personal study log of a Java course: solved exercises and small example
programs, organized by topic as I progressed through the fundamentals of the
language.

## Structure

The project follows the standard Maven layout. All code lives under the
`com.valmir.cursojava` base package, split into two kinds of sub-packages:

- **`aulaNN`** — short example programs demonstrating one language feature
  each, in the order they were taught:

  | Package  | Topic                         |
  |----------|--------------------------------|
  | aula10   | Variables and naming conventions |
  | aula11   | Primitive types (boolean, char, float/double, int) |
  | aula12   | Reading input from the keyboard |
  | aula13   | Arithmetic, relational, logical and short-circuit operators |
  | aula14   | `if` / `else`                 |
  | aula15   | Multiple `if-else` and `switch`|
  | aula16   | `while` loops                 |
  | aula17   | `for` loops                   |
  | aula18   | `break`, `continue` and labeled loops |
  | aula19   | Arrays                        |

- **`exercicios*`** — solved exercise lists, numbered as they were assigned
  (`exercicios`, `exercicios14E15`, `exercicios16E17`, `exercicios18E19`).

## Requirements

- JDK 17+
- Maven 3.8+ (or just `javac`, see below)

## Building

```bash
mvn compile
```

## Running a single exercise

Every class has its own `main` method, so any of them can be run directly.
For example:

```bash
mvn compile exec:java -Dexec.mainClass="com.valmir.cursojava.exercicios16E17.Exercise36"
```

Without Maven, compiling and running with the JDK directly also works:

```bash
javac -d out $(find src/main/java -name "*.java")
java -cp out com.valmir.cursojava.exercicios16E17.Exercise36
```

## Code style

Source files are formatted with [google-java-format](https://github.com/google/google-java-format)
and use `try-with-resources` for `Scanner`/other closeable resources.
