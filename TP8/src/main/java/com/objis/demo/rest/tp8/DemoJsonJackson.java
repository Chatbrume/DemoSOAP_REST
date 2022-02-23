package com.objis.demo.rest.tp8;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DemoJsonJackson
{
    public static void main(String[] args) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        Employ employ1 = new Employ("BA","Amadou");

        File resultFile = new File("TP8/employ.json");
        mapper.writeValue(resultFile, employ1);
    }
}
