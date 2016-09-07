# jmh-powered-project-example

This is an example of maven project created as an answer to http://stackoverflow.com/q/38880911/3239417

The main idea to implement next layout

    +- src/
       +- main/java   - sources
    +- src/test/
       +- java        - test sources
       +- perf        - benchmarks

To run this example run

    mvn clean package

And then run 'uber' jar with benchmarks

    java -jar target/jmh-powered-project-example-1.0-SNAPSHOT-perf-tests.jar

