#!/usr/bin/env sh

cd ./src/main/java;
wsimport -p com.objis.demo.tp13.client.wsimport -keep http://localhost:8888/demosoaprest?wsdl  -encoding utf8;

cd ./com/objis/demo/tp13/client/wsimport;
rm *.class;