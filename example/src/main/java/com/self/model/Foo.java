package com.self.model;

import org.springframework.beans.factory.annotation.Value;

public class Foo {
    @Value("Hello, world!")
    public String value;
}