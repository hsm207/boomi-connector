package com.boomi.connector.sample;

import java.util.logging.Logger;

import com.boomi.connector.api.BrowseContext;
import com.boomi.connector.util.BaseConnection;

import com.boomi.util.LogUtil;


public class HelloWorldConnection extends BaseConnection{
    private static final Logger LOG = LogUtil.getLogger(HelloWorldConnection.class);

    public HelloWorldConnection(BrowseContext context) {
        super(context);
        LOG.info("creating Connection");
    }
    
}
