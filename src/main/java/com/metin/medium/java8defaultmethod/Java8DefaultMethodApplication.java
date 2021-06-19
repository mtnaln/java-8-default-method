package com.metin.medium.java8defaultmethod;

import com.metin.medium.java8defaultmethod.model.Line;
import com.metin.medium.java8defaultmethod.model.Shape;
import com.metin.medium.java8defaultmethod.model.Square;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java8DefaultMethodApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Java8DefaultMethodApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Shape line = new Line();
        line.rotate();

        Shape square = new Square();
        square.rotate();
    }
}
