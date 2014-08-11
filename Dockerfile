FROM  vishnupkrm/oracle_java:oracle
MAINTAINER VISHNU "vishnu.virtual@gmail.com"
RUN mkdir /usr/seleniumProject
WORKDIR /usr/seleniumProject
RUN wget https://github.com/vishnuRed/Selenium/archive/master.zip
RUN apt-get -y install unzip
RUN unzip Selenium-master.zip
CMD /bin/bash
#RUN cd Selenium-master/selenium example 
#ADD https://raw.githubusercontent.com/vishnuRed/OracleJava/master/Helloworld.java  ./usr/javaApplication/
#
#RUN javac Helloworld.java
#RUN echo classbeing compiled 
#RUN java Helloworld
