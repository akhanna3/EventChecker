# Event Checker
This application is a event checker. The program implements a event checker interface which has 3 functions 
include (minYear, maxYear) - marks the given range [minYear, maxYear) as years in which the event did happen
exclude (minYear, maxYear) - marks the given range [minYear, maxYear) as years in which the event did not happen
check (year) - check if the event happened in the given year
 
EventChecker is a [Maven](http://maven.apache.org/) Java project.  It contains a Maven file called pom.xml that sits in the root directory of the project.  The pom.xml file describes how the project is structured, built, tested, and packaged.

## Prerequisites
- SSH terminal software

### Required software
- Java SE7 (latest) + J2EE7SDK installed and configured or higher
- Maven 3.2.1 installed and configured
- Modern Java IDE recommended (Eclipse Kepler, NetBeans or Intellij) with Maven and Git

## Extract Code

- Open a terminal on Mac or Linux
- Type in the following commands
  - mv eventchecker.bla eventchecker.tar.gz
  - tar xvf eventchecker.tar.gz 
  - cd EventChecker
  - ls -la
- You should see pom.xml and src directory


## Compiling and Running EventChecker
Maven allows for many commands that are quite useful when running Calculator. [Sonatype's Maven guide][mvn] has an excellent review of lifecycle phases and goals.

### Compiling
- cd EventChecker (where you have extracted the tar)
- mvn clean compile

### Installing local on your machine
- cd EventChecker (where you have extracted the tar)
- mvn clean install 


##Testing

### Running unit tests
Unit tests are coded in JUnit and can be run from within Eclipse or using Maven.

- mvn test 



[mvn]: http://books.sonatype.com/mvnref-book/reference/lifecycle-sect-structure.html


