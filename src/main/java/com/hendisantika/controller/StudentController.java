package com.hendisantika.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springdoc-demo1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/04/22
 * Time: 14.39
 */
@Tag(description = "Student resources that provides access to available student data",
        name = "Student Resource")
@RestController("/")
public class StudentController {
}
