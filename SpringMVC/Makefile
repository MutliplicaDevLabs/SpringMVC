build-maven:	
	mvn package

clean:
	sudo rm -rf target/

build: 
	# Build war
	docker-compose run builder
	# Build docker image
	docker-compose build app

run-maven: clean
	mvn spring-boot:run

run-develop: 
	docker-compose up dev