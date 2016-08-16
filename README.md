# aspectj-spring-boot-example
An example spring-aop &amp; spring-boot multi-module project example for SO question http://stackoverflow.com/questions/38943134/aspect-does-not-work-with-spring-boot-application-with-external-jar

To run this example run

    mvn clean package
    
And then run 'uber' jar

    java -jar project/target/project-1.0-SNAPSHOT.jar

After context loading finished progam should display `Call from aspect. Execution took XXXms`.
