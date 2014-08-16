Selenium
========

this is to test selenium on docker  
to run this project 
docker pull vishnupkrm/selenium:firefox
or 
docker build -t="vishnupkrm/selenium:firefox" github.com/vishnuRed/Selenium

when the image has been in your system then do following 
docker run -t  5900 vishnupkrm/selenium:firefox  x11vnc -forever -usepw -create
then connect through vnc
then run the command in vnc java SeleniumExample
