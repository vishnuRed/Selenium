FROM  vishnupkrm/oracle_java:oracle
MAINTAINER VISHNU "vishnu.virtual@gmail.com"
# Install vnc, xvfb in order to create a 'fake' display and firefox
RUN apt-get install -y x11vnc xvfb firefox
RUN mkdir /.vnc
# Setup a password
RUN     x11vnc -storepasswd 1234 ~/.vnc/passwd
RUN mkdir /usr/seleniumProject
WORKDIR /usr/seleniumProject
RUN wget https://github.com/vishnuRed/Selenium/archive/master.zip
RUN unzip master.zip
#CMD /bin/bash
RUN cd Selenium-master/selenium\ example/src/com/pkma/qa/selinium
RUN wget http://selenium-release.storage.googleapis.com/2.42/selenium-server-standalone-2.42.2.jar
RUN wget http://central.maven.org/maven2/junit/junit/4.9/junit-4.9.jar
RUN wget http://selenium-release.storage.googleapis.com/2.42/selenium-java-2.42.2.zip
RUN wget http://central.maven.org/maven2/org/seleniumhq/selenium/selenium-firefox-driver/2.42.2/selenium-firefox-driver-2.42.2.jar
RUN cp selenium-server-standalone-2.42.2.jar /usr/lib/jvm/java-7-oracle/jre/lib/ext/
RUN cp junit-4.9.jar /usr/lib/jvm/java-7-oracle/jre/lib/ext/
RUN cp selenium-firefox-driver-2.42.2.jar /usr/lib/jvm/java-7-oracle/jre/lib/ext/
RUN unzip selenium-java-2.42.2.zip
RUN  cp ./selenium-2.42.2/selenium-java-2.42.2.jar /usr/lib/jvm/java-7-oracle/jre/lib/ext/
WORKDIR /usr/seleniumProject/Selenium-master/selenium example/src/com/pkma/qa/selinium
RUN javac SeleniumExample.java
#RUN x11vnc -bg -forever -usepw -create

#ADD https://raw.githubusercontent.com/vishnuRed/OracleJava/master/Helloworld.java  ./usr/javaApplication/
#
#RUN javac Helloworld.java
#RUN echo classbeing compiled 
#RUN java Helloworld
