# randomNumberGenerator
Random Number Generator using multiple resources for CS 4263

## Application created using Java App Engine

https://project-251314.appspot.com

`Dependencies are listed on the pom.xml file`

After following the documentation guide to install App Engine Java 8 Standard Environment,
I decided to manage the App Engine project using Apache Maven. I used Maven to test my app locally and
deploy it to App Engine.

https://cloud.google.com/appengine/docs/standard/java/tools/using-maven

Following the above guide to integrate Apache Maven, I created the directories according to #13 of 'Creating a new App Engine' guide.

To build the project through Maven archetype, I first ran the command
```
mvn clean package
```
then deployed it locally using
```
mvn appengine:run
```
then deployd the application using
```
mvn appengine:deploy
```
