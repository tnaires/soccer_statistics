# Soccer Statistics
This is a small service to be used as an example for a Continuous Delivery workshop.

It has only a root endpoint that returns statistics for a soccer championship. It uses an in-memory database to store information like team names, matches, wins, losses, draws, and so on and so forth.

# Technology stack
* Java 1.7
* Gradle
* Spring Boot
* H2 database
* Eclipse IDE
* Swagger

# Run the application
1. Clone the repository into your machine
2. Browse into it
3. Run `./gradlew bootRun`
4. Access localhot:8080 (data is automatically loaded)

# Run tests
1. Run `./gradlew test` from root directory

# Change data
You can edit src/main/resources/data.sql file to change the data as you want.
