.PHONY: test build doc

test:
	mvn test -f ./pom.xml

build:
	mvn compile -f ./pom.xml

pack:
	mvn package -f ./pom.xml

doc: 
	javadoc -public -doctitle "Java client for Salesfly API" -d ./doc ./src/main/java/com/salesfly/*.java ./src/main/java/com/salesfly/exceptions/*.java ./src/main/java/com/salesfly/models/*.java

deploy:
	mvn -DskipTests=true deploy