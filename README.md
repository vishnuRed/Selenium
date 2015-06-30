Selenium
========

this is to test selenium on docker  
to run this project 
docker pull vishnupkrm/selenium:firefox
or 
docker build -t="vishnupkrm/selenium:firefox" github.com/vishnuRed/Selenium

when the image has been in your system then do following 

<b>docker run -t -i -p 5900:5900 vishnupkrm/selenium:firefox  x11vnc -forever -usepw -create</b>

then connect through vnc
through localhost  port 5900
and password is 1234

then run the command in vnc "<b>java SeleniumExample</b>"

working great 

