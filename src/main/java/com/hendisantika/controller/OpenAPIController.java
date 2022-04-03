package com.hendisantika.controller;

import com.hendisantika.model.Tutorial;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springdoc-demo1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/04/22
 * Time: 14.12
 */
@RestController
public class OpenAPIController {
    @GetMapping(value = "/tutorials", produces = "application/json")
    public ResponseEntity<List<Tutorial>> tutorials() {
        List<Tutorial> tutorials = TestData.allTutorials();
        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }
}
