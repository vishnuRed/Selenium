FROM  vishnupkrm/oracle_java:oracle
MAINTAINER VISHNU "vishnu.virtual@gmail.com"
RUN mkdir /usr/seleniumProject
WORKDIR /usr/seleniumProject
RUN wget https://github.com/vishnuRed/Selenium/archive/master.zip
RUN unzip Selenium-master.zip

#CMD /bin/bash
RUN cd Selenium-master/selenium example/src/com/pkma/qa/selinium
RUN wget http://selenium-release.storage.googleapis.com/2.42/selenium-server-standalone-2.42.2.jar
RUN wget http://central.maven.org/maven2/junit/junit/4.9/junit-4.9.jar
RUN wget http://selenium-release.storage.googleapis.com/2.42/selenium-java-2.42.2.zip
RUN wget http://central.maven.org/maven2/org/seleniumhq/selenium/selenium-firefox-driver/2.42.2/selenium-firefox-driver-2.42.2.jar
RUN unzip selenium-java-2.42.2.zip
RUN javac SeleniumExample.java
#ADD https://raw.githubusercontent.com/vishnuRed/OracleJava/master/Helloworld.java  ./usr/javaApplication/
#
#RUN javac Helloworld.java
#RUN echo classbeing compiled 
#RUN java Helloworld
