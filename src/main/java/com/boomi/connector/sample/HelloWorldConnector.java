// Copyright (c) 2021 Boomi, Inc.
package com.boomi.connector.sample;

import com.boomi.connector.api.AtomContext;
import com.boomi.connector.api.BrowseContext;
import com.boomi.connector.api.Browser;
import com.boomi.connector.api.Connector;
import com.boomi.connector.api.Operation;
import com.boomi.connector.api.OperationContext;
import com.boomi.connector.util.BaseConnector;

import java.util.logging.Logger;

import org.checkerframework.checker.units.qual.A;

import com.boomi.util.LogUtil;

/**
 * Hello World! {@link Connector} implementation which extends
 * {@link BaseConnector} for convenience.
 */
public class HelloWorldConnector extends BaseConnector {
    private static final Logger LOG = LogUtil.getLogger(HelloWorldConnector.class);

    private static final String HELLO_OPERATION_ID = "hello";

    /**
     * This connector does not support browsing
     */
    @Override
    public Browser createBrowser(BrowseContext arg0) {
        // A Browser instance is required when a user performs an import (Import Wizard)
        // for a connector operation.
        LOG.info(String.format("createBrowser called with argument: %s", arg0));
        throw new UnsupportedOperationException();

    }

    /**
     * Creates a new {@link HelloWorldOperation}
     */
    @Override
    protected Operation createExecuteOperation(OperationContext context) {
        // An Operation instance is required when a process executes a Connector shape.
        LOG.info(String.format("createExecuteOperation called with context: %s", context));
        if (HELLO_OPERATION_ID.equals(context.getCustomOperationType())) {
            return new HelloWorldOperation(context);
        }
        throw new UnsupportedOperationException();
    }

}
