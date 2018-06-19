# movie-service
Step 1: Download or clone the code from https://github.com/ravikasar/movie-service.git
Step 2: Run mvn package in movie-service folder
Step 3: Run java -jar target/movie-service-0.0.1-SNAPSHOT.jar

After the application boots up, 4 movies are added in the in memory database.
Movie(id=1, name=Star Wars, parentalControlLevel=PG)
Movie(id=2, name=Fantastic Four, parentalControlLevel=PG)
Movie(id=3, name=Gangs Of Newyork, parentalControlLevel=15)
Movie(id=4, name=ToyStory, parentalControlLevel=U)

Step 4: To check if the client is allowed to watch a moview go to Browser and paste
http://localhost:8080/movieservice/PG/1 -- THis should return true
http://localhost:8080/movieservice/PG/3 -- His should return false

When you change the parental level to 18 then all four movies should return true.
http://localhost:8080/movieservice/18/3 -- His should return true

