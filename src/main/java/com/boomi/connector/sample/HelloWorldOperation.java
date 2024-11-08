// Copyright (c) 2021 Boomi, Inc.
package com.boomi.connector.sample;

import com.boomi.connector.api.ObjectData;
import com.boomi.connector.api.Operation;
import com.boomi.connector.api.OperationContext;
import com.boomi.connector.api.OperationResponse;
import com.boomi.connector.api.PayloadUtil;
import com.boomi.connector.api.ResponseUtil;
import com.boomi.connector.api.UpdateRequest;
import com.boomi.connector.util.BaseUpdateOperation;

/**
 * Hello World! {@link Operation} implementation which extends
 * {@link BaseUpdateOperation} for convenience.
 */
public class HelloWorldOperation extends BaseUpdateOperation {

    /**
     * Creates a new instance with the provided context
     */
    protected HelloWorldOperation(OperationContext context) {
        super(context);
    }

    /**
     * Adds a combined success with the name specified in the operation as a
     * payload. NOTE: String payloads should
     * generally be avoided in production connectors.
     */
    @Override
    protected void executeUpdate(UpdateRequest request, OperationResponse response) {
        String name = getContext().getOperationProperties().getProperty("name");
        ResponseUtil.addCombinedSuccess(response, request, "200", PayloadUtil.toPayload(name));
        for (ObjectData input : request) {
            input.getLogger().info("the input is: " + input.toString());
        }
    }

}
