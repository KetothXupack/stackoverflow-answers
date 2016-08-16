# aspectj-spring-boot-example
An example spring-aop &amp; spring-boot multi-module project example for SO question http://stackoverflow.com/q/38943134/3239417

To run this example run

    mvn clean package
    
And then run 'uber' jar

    java -jar project/target/project-1.0-SNAPSHOT.jar

After context loading finished progam should display `Call from aspect. Execution took XXXms`.
