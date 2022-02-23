#!/usr/bin/ruby

require 'soap/wsdlDriver'

wsdl_url = "http://localhost:8080/hello?wsdl"
service = SOAP::WSDLDriverFactory.new(wsdl_url).create_rpc_driver

service.wiredump_file_base = 'soapmsgs'

result1 = service.sayHello('Objis')

puts "Resultat : #{result1}"