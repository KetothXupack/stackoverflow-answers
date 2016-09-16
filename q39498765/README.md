# instrumentational-agent-example

An example instrumentational agent for finding object sizes for http://stackoverflow.com/q/39498765/3239417

To run this example run

    mvn clean package
    java -javaagent:agent/target/agent-1.0-SNAPSHOT.jar -jar project/target/project-1.0-SNAPSHOT.jar
