package com.hendisantika.controller;

import com.hendisantika.model.Tutorial;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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
    private static final List<Tutorial> allTutorials = List.of(
            new Tutorial(1, "Spring Boot Tutorial", "Hendi Santika"),
            new Tutorial(2, "Java Fundamental Tutorial", "Hendi Santika"),
            new Tutorial(3, "Spring Security Tutorial", "Hendi Santika"),
            new Tutorial(4, "Thymeleaf Tutorial", "Hendi Santika"),
            new Tutorial(5, "REST API Tutorial", "Hendi Santika")
    );

    @Operation(summary = "Get all Tutorials", description = "Returns a list of tutorials", operationId = "tutorials")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "ok, successful operation",
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = Tutorial.class)))),
            @ApiResponse(responseCode = "401", description = "Unauthorized"),
            @ApiResponse(responseCode = "403", description = "Forbidden"),
            @ApiResponse(responseCode = "404", description = "Not found")})
    @GetMapping(value = "/tutorials", produces = "application/json")
    public ResponseEntity<List<Tutorial>> tutorials() {
        List<Tutorial> tutorials = allTutorials;
        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }


}
