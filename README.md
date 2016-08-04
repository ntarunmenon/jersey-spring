# Spring 4- Jersey 2 - Jetty 9 

Working sample consisting of

  - Jersey Rest Services Integrated with Spring and Jackson
  - Deployable to jetty through maven plugin
  - Integration tests using fail-safe plugin and jetty server.
  - c3p0 connection pooled datasource accessed via jetty container using JNDI.
  - Spring Hibernate Integration and Spring Data Repository

To Run the application ``` mvn clean install jetty-run```

Service is available at ``` localhost:8080/jersey-spring/name ```

To run integration tests ``` mvn verify ```

Based on  the excellent [article](http://www.codingpedia.org/ama/tutorial-rest-api-design-and-implementation-in-java-with-jersey-and-spring/)
