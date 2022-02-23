#!/usr/bin/env sh

cd ./src/main/java;
wsimport -p com.objis.demo.tp13.client -keep http://localhost:8888/hello?wsdl;

cd ./com/objis/demo/tp13/client;
del *.class