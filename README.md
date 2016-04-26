Spring Cloud Demo Application
=============================

This repository contains a demo application for [Spring Cloud](http://projects.spring.io/spring-cloud/). It's based on the [sample project repository](https://github.com/joshlong/bootiful-microservices) by [Josh Long](http://joshlong.com/).

Each of the sub projects was created with the [Spring Kickstarter](https://start.spring.io).


Project Layout
--------------

Each service is put in a separate folder:

    .
    ├── README.md
    ├── config-repo-samples                        Copy to `config-sample`
    ├── config-repo                                Repository for the configuration server
    │   ├── application.properties                 Base configuration (applied to all other configurations)
    │   ├── config-server.properties               Configuration for the config server
    │   └── ...
    ├── config-server                              Contains the configuration server
    │   ├── pom.xml
    │   ├── src
    │   └── ...
    ├── eureka-service                             Contains the Eureka service discovery service
    │   ├── pom.xml
    │   └── src
    ├── message-consumer                           Contains a sample application (a message consumer)
    │   └── ...
    ├── message-consumer                           Contains a sample application (a message consumer)
    │   └── ...
    └── pom.xml                                    EXPERIMENTAL multi-pom for each of the sub-projects



Sub Projects
------------

### Config Repo

Currently not versioned - contains configuration files for the Spring Cloud Configuration Server.

###




Further Resources
=================

* [Spring Configuration Server Tutorial](http://cloud.spring.io/spring-cloud-config/)
* [Spring Configuration Server Documentation](http://cloud.spring.io/spring-cloud-static/spring-cloud.html#_spring_cloud_config)
* [Netflix OSS](https://netflix.github.io/)
* [Eureka Documentation](https://github.com/Netflix/eureka)
* [Hystrix Documentation](https://github.com/Netflix/hystrix)
* [Zipkin](https://github.com/openzipkin/zipkin)
* [Josh Long's Bootiful Microservices Repository](https://github.com/joshlong/bootiful-microservices)
* [Josh Long's Blog](http://joshlong.com/)