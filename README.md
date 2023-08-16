HOW TO RUN WITH DOCKER CONTAINER

Have Docker installed on your machine.
Have the project opened in your environment then go to the terminal.
type: docker build -t qap2_docker_container .
After running that, type docker-compose up
Once you enter that command the container should be up and running, from there the REST API is working from the docker contain. You can then go to Postman and test all the functional functionalities of the program
The API should now be accessible at http://localhost:8080
