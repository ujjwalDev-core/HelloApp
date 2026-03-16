# hello-app

HelloApp is a Java Maven application that evolves step-by-step from a simple Hello World program to a modular greeting manager with command-line input, collections, persistence, and banner output.

## Project Structure

hello-app
├── pom.xml
├── README.md
├── .gitignore
└── src
    ├── main
    │   └── java
    │       └── HelloApp.java
    └── test
        └── java

## Build the Project

Run the following command:

mvn clean install

## Run the Application

java -cp target/hello-app-1.0-SNAPSHOT.jar HelloApp