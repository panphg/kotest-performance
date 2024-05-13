# Kotest 5.9 Performance Degradation

Version 5.9.0 has introduced a performance degradation compared to version 5.8.1 when using a generator for a data structure with nested lists.

This repository contains a Kotlin project with a simple test (PerformanceTest) reproducing the issue.

When run with Kotest 5.8.1, the test runs in a few seconds.
When run with 5.9.0, the test runs for a long time (minutes, if not hours).

To run the test with Kotest 5.8.1, execute:
```bash
./gradlew test -Dversion=5.8.1
```

To run the test with Kotest 5.9.0, execute:
```bash
./gradlew test -Dversion=5.9.0
```
