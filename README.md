# Jakarta in Liberty

This is a small test project to test the start up performance of a Jakarta EE app in a container.

## Build

To build the app and the container run:

```
$ mvn package
$ docker build -t jakarta-in-liberty .
```

## Run the app

```
$ docker run --name jakarta-in-liberty -p 9080:9080 jakarta-in-liberty
```

After that open the application in the browser via: http://localhost:9080/api/hello
