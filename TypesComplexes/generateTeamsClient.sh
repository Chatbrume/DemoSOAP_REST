#!/usr/bin/env sh

#Prerequis: avoir lancer la class teamsClient/TeamsClient

cd ./src/main/java;
wsimport -p com.objis.demowenservice.typescomplexes.teamsClient -keep http://localhost:8888/teams?wsdl;

cd ./com/objis/demowenservice/typescomplexes/teamsClient;
del *.class