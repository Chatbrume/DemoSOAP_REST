package com.objis.demo.soap.typescomplexes.teamsService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.ws.Endpoint;

public class TeamsServer
{
    private static final Logger LOGGER = LogManager.getLogger(TeamsServer.class);

    private String url = null;
    private Endpoint endpoint = null;

    public TeamsServer(String url)
    {
        this.url = url;
    }

    public void start(String url) {
        LOGGER.debug("start(String)");
        this.url = url;
        endpoint = Endpoint.publish(this.url, new Teams());
    }

    public boolean isRunning()
    {
        return endpoint == null ? false : endpoint.isPublished();
    }

    public void start() {
        LOGGER.debug("start()");
        if( url != null )
            endpoint = Endpoint.publish(this.url, new Teams());
        else
            LOGGER.error("The url is null !");
    }

    public void stop() {
        LOGGER.debug("stop()");
        if( endpoint != null ) endpoint.stop();
        this.url = null;
        this.endpoint = null;
    }

    public String getUrl() { return this.url; }

    public static void main(String[ ] args)
    {
        String url = "http://localhost:" + 8888 + "/teams";

        TeamsServer publish = new TeamsServer(url);
        publish.start();
        LOGGER.info("Web Service disponible ? " + publish.isRunning());
    }
} 
