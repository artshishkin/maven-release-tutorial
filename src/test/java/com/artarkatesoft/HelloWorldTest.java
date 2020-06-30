package com.artarkatesoft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void getMessage() {
        System.out.println(new HelloWorld().getMessage());
    }
}
