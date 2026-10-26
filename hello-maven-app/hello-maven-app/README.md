# Hello Maven App

A simple Java Servlet web application for practicing Maven build, unit testing,
WAR packaging, and Jenkins automation with Tomcat 10.1+.

## Requirements
- JDK 17
- Maven 3.8+
- Tomcat 10.1+ (uses Jakarta Servlet API 6.0)

## Build locally
Open a terminal in this folder and run:

```bash
mvn clean test package
```

The WAR file will be generated at:

`target/hello-maven-app.war`

## Deploy manually
Copy `target/hello-maven-app.war` into your Tomcat `webapps` directory,
then start/restart Tomcat if needed.

Open:
- `http://localhost:8080/hello-maven-app/`
- `http://localhost:8080/hello-maven-app/hello`

## Jenkins note
The included Jenkinsfile uses Windows `bat` commands and assumes Jenkins tools
are configured with the names `JDK17` and `Maven3`. For a Linux agent, replace
`bat` with `sh` and use `sh 'mvn ...'`.

The included unit test is a basic servlet-instantiation test, not a full HTTP
integration test.
