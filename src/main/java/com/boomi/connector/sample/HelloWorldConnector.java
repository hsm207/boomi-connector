// Copyright (c) 2021 Boomi, Inc.
package com.boomi.connector.sample;

import com.boomi.connector.api.BrowseContext;
import com.boomi.connector.api.Browser;
import com.boomi.connector.api.Connector;
import com.boomi.connector.api.Operation;
import com.boomi.connector.api.OperationContext;
import com.boomi.connector.util.BaseConnector;

/**
 * Hello World! {@link Connector} implementation which extends {@link BaseConnector} for convenience.
 */
public class HelloWorldConnector extends BaseConnector {

    private static final String HELLO_OPERATION_ID = "hello";
    
    /**
     * This connector does not support browsing 
     */
    @Override
    public Browser createBrowser(BrowseContext arg0) {
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a new {@link HelloWorldOperation} 
     */
    @Override
    protected Operation createExecuteOperation(OperationContext context) {
        if (HELLO_OPERATION_ID.equals(context.getCustomOperationType())) {
            return new HelloWorldOperation(context);
        }
        throw new UnsupportedOperationException();
    }    

}
