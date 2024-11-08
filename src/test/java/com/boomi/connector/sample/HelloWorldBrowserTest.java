package com.boomi.connector.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.boomi.connector.api.BrowseContext;
import com.boomi.connector.api.ConnectorException;

public class HelloWorldBrowserTest {

    // @Test
    // public void testTestConnection() {
    //     BrowseContext context = new BrowseContext();
    //     HelloWorldConnection conn = new HelloWorldConnection(context);
    //     HelloWorldBrowser browser = new HelloWorldBrowser(conn);
    //     assertDoesNotThrow(() -> {
    //         browser.testConnection();
    //     });
    // }

    @Test
    public void testSayHello() {
        String result = HelloWorldBrowser.sayHello();
        assertEquals("Hello, World!", result);
    }
}