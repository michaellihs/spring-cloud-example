Spring Cloud Sample Application (Server)
========================================

This directory contains a sample application based on Spring Cloud.



Usage of the Configuration Server
---------------------------------

In order to use the configuration server in your Spring application, you have to do the following steps:

* Add the following dependency to your `pom.xml`:

````xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-config</artifactId>
</dependency>
````

* Add a `bootstrap.properties` into your `src/main/java/resources` directory:

````
spring.application.name=message-producer
spring.cloud.config.uri=http://localhost:8888
````

* Use the server in your class with the `@Configuration` annotation and the `@Value(...)` annotation:

````java
@Configuration
@RefreshScope
class SampleController {

    @Value("${message}")
    String name = "World";

    /* ... */

}
````