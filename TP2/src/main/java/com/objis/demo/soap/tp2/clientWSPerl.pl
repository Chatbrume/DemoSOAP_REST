#!/usr/bin/perl -w

use SOAP::Lite;

my $url = 'http://127.0.0.1:8080/hello?wsdl';
my $service = SOAP::Lite->service($url);

print "\nResultat: ", $service->sayHello('Objis');