package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class HelloServletTest {

    @Test
    void servletCanBeCreated() {
        HelloServlet servlet = new HelloServlet();
        assertNotNull(servlet);
    }
}
