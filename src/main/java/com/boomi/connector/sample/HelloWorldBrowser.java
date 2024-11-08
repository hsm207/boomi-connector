package com.boomi.connector.sample;

import java.util.Collection;
import java.util.logging.Logger;

import com.boomi.connector.api.ConnectionTester;
import com.boomi.connector.api.ConnectorException;
import com.boomi.connector.api.ObjectDefinitionRole;
import com.boomi.connector.api.ObjectDefinitions;
import com.boomi.connector.api.ObjectTypes;
import com.boomi.connector.util.BaseBrowser;

import com.boomi.util.LogUtil;

public class HelloWorldBrowser extends BaseBrowser implements ConnectionTester{
    private static final Logger LOG = LogUtil.getLogger(HelloWorldBrowser.class);

    public HelloWorldBrowser(HelloWorldConnection conn) {
        super(conn);
        LOG.info("creating Browser");
        
    }

    @Override
    public ObjectTypes getObjectTypes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getObjectTypes'");
    }

    @Override
    public ObjectDefinitions getObjectDefinitions(String objectTypeId, Collection<ObjectDefinitionRole> roles) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getObjectDefinitions'");
    }

     @Override
     public void testConnection() {
         try {
             LOG.info("Creating a connection to the Weaviate instance");
             LOG.info("Connection successful");
         }
         catch (Exception e) {
             throw new ConnectorException("Could not establish a connection", e);
         }
     }

     public static String sayHello() {
        return "Hello, World!";
    }
}
