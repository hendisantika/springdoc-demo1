package com.hendisantika.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * Project : springdoc-demo1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/04/22
 * Time: 14.09
 */
@Configuration
public class DocumentationConfig {

    @Bean
    public OpenAPI openAPI() {
        Server localServer = new Server();
        localServer.setDescription("local");
        localServer.setUrl("http://localhost:8080");

        Server testServer = new Server();
        testServer.setDescription("test");
        testServer.setUrl("https://example.org");

        OpenAPI openAPI = new OpenAPI();
        openAPI.info(new Info()
                .title("Tutorial Rest API")
                .description(
                        "Documenting Spring Boot REST API with SpringDoc and OpenAPI 3 spec")
                .version("1.0.0")
                .contact(new Contact().name("Hendi Santika").
                        url("https://linktr.ee/hendisantika").email("hendisantika@yahoo.co.id")));
        openAPI.setServers(Arrays.asList(localServer, testServer));

        return openAPI;
    }

}
