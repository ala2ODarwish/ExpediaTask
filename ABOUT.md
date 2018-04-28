- The language I used is Java, to code the server connecting to the API, and javascript, HTML & CSS to code the front end.
In addition to being a robust and secure language, I picked it because it's under my competencies. 
- What I wanted to accomplish is a server that translates data coming from the API into objects and then into data to be
displayed on a web page. I was thinking about hiding the connection to the data source behind an interface, that is in case
of changing the source type, my code wouldn't get affected that much. but then i just made the connection manager a concrete class
that connects to the DS directly. 
In the classes under the module "api-parser" I didnt use setters intentionally so that the setting of the data inside those beans
can be done only through the DS. I thought about encapsulating them by using an inner class as a builder but again it was of 
no use since the data shouldn't be manipulated with, so i decided that removing setters is enough (if you think otherwise, 
i would like an advice).I wanted to have the UI more proffessionally looking and add more test cases to the server side, but I couldn't due to lack of time.
- I wrote the whole code locally and then uploaded it all at once to Github that's why it has only one commit.
- In general, I enjoyed doing this task, I learnd a lot during the process. I got more experienced using spring
boot in addition to learning new things like thymeleaf.
