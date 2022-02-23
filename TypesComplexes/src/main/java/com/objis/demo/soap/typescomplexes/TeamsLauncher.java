package com.objis.demo.soap.typescomplexes;

import com.objis.demo.soap.typescomplexes.teamsService.TeamsServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TeamsLauncher
{
    private static final Logger LOGGER = LogManager.getLogger(TeamsLauncher.class);

    public static void main(String[ ] args)
    {
        String url = "http://localhost:" + 8888 + "/teams";

        TeamsServer publish = new TeamsServer(url);
        publish.start();
        LOGGER.info("Web Service disponible ? " + publish.isRunning());
    }
}