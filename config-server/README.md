Spring Cloud Config Server
==========================



### The Config Repo

* Create a Git repository and add `.properties` files for each application you want to configure
* Push the repository to Github
* Get the https URL (browser URL not git URL) and use it for configuring the the config-server `application.properties` file like so:

````
spring.cloud.config.server.git.uri=https://github.com/michaellihs/config-repo/
````

### Using File System Backend

See [http://cloud.spring.io/spring-cloud-static/spring-cloud.html#_spring_cloud_config_server](http://cloud.spring.io/spring-cloud-static/spring-cloud.html#_spring_cloud_config_server) --> File System Backend.

For the configuration of the File System Backend, set `spring.profiles.active=native` in the `application.properties`. Then define the location(s) of your config files with `spring.cloud.config.server.native.searchLocations=file:/Users/mimi/Workspace/spring-cloud/config-repo`.

### The Config Server

* Kickstart config server project on [https://start.spring.io](https://start.spring.io)
* Open the project and change the following lines in `ConfigServerApplication.java`:

````java
@EnableConfigServer       // <-- this line needs to be added!
@SpringBootApplication
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
````

* in the `bootstrap.properties` add

````
spring.application.name=config-server
````

### The Config Client

* Add the following dependency to the `pom.xml`

````xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-config</artifactId>
</dependency>
````

* Add a `bootstrap.properties` with your application name and the URL to the config server, like

````
spring.application.name=message-producer
spring.cloud.config.uri=http://localhost:8888
````

* If you want to use the config from the configuration server, use the following annotation

````
@RefreshScope
````

* Values from the configuration (identified by a `.properties` file with the name of the application given in `bootstrap.properties`) can be read with

````java
@Value("${message}")
String name = "World";
````


Open Issues
-----------

* how to read config from files instead of git repository
  * how to enable a local git repository instead of Github
