Sample SpringBoot/Data Application to show use of JPA & JPA Repositories whith GridGain/Apache Ignite

### To Run

1. Update the following in application.properties file;

	```
	spring.datasource.url=jdbc:ignite:thin://localhost:10800
	```

2. And then run the class

	```
	org.gridgain.demo.springdata.jpa.JpaApp
	```