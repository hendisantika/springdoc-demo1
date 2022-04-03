package com.hendisantika.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : springdoc-demo1
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/04/22
 * Time: 14.12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "Tutorial", description = "Tutorial")
public class Tutorial {

    private long id;

    private String name;

    @Schema(name = "author", description = "name of author", required = true, example = "John Doe")
    private String author;
}
