REST API 
-----------------------------------------------------------------------------------------------------------------------
This program is the backend database / rest api for the react app in my repo https://github.com/Ksnow13/sprint2_react_app.git

How To Work the Program:

- Frist Have MySQL Workbench running a local instance and create a database called search_engine_db OR name it anything you want as long as your change the name in the application.properties and docker-compose.yml files.
- Once your created your database, run the file called RestServiceApplication.
- When you run the program all the tables and relationship will be created in your MySQL database automatically.
  * IMPORTANT - This program is set up with basic authentication.
  * Username: admin
  * Password: admin
- Next lunch Postman and do a GET on http://localhost:8080/ to see the links, make shure to click on Authorization and have basic auth select, then enter the username and password.
- Once your Local host instance is working with the database you can start adding data.
- You can add data manually in postman or mySQL workbench one at a time, or use one of the two files in database/queryStatments to insert 1000 pieces of mock data into the database.
- In mySQL copy and paste all the insert statments to add data, or in postman copy and paste and the json data with the link  http://localhost:8080/vehicle with a post header.
- Once the data is add to the database you can do http://localhost:8080/vehicle to get all the data.
- http://localhost:8080/vehicle/profile to see all links that you can call.
- http://localhost:8080/vehicle/profile/search to see all the different ways to query/search for data.

How use with react app:
- Simply have this program running with data insterted and the react app will make calls to the api.

-----------------------------------------------------------------------------------------------------------------------
HOW TO RUN WITH DOCKER CONTAINER

- Have Docker installed on your machine.
- Have the project opened in your environment then go to the terminal.
- type: docker build -t qap2_docker_container .
- After running that, type docker-compose up
- Once you enter that command the container should be up and running, from there the REST API is working from the docker contain. You can then go to Postman and test all the functional functionalities of the program
- The API should now be accessible at http://localhost:8080
