APP = jfmt
VERSION = 2.3.0

# Dev
clean:
	rm -rf target/

build:
	@echo Building project...
	-@mvn clean install
	@echo The build was successful!

run:
	@echo Running target/$(APP)-$(VERSION).jar...
	@java -jar target/$(APP)-$(VERSION).jar

# Test
test:
ifeq ($(class),)
	@echo Running all tests...
	@mvn test
else
	@echo Running tests in $(class).java...\n
	@mvn -Dtest=$(class) test
endif