# Run project
> mvn spring-boot:run

> mvnw spring-boot:run

# Package project
> mvn package

# Deploy war package to tomcat
> 1. Change package type
```$xslt
<packaging>war</packaging>
```

> 2.SpringBoot embed tomcat, need exclude tomcat from spring-boot-starter-web. But we still need tomcat for local test.
```$xslt
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <exclusions>
        <!-- Exclude embedded tomcat for run project in tomcat -->
        <exclusion>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```
> 3.Add new subclass of SpringBootServletInitializer and overwrite it's configure method.
```$xslt
package com.mn.servlet;

public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MeinvApplication.class);
    }
}
```