package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CommentDto {
    private long id;

    @NotEmpty(message = "name should not be null")
    private String name;

    @NotEmpty(message = "email should not be null")
    @Email
    private String email;

    @NotEmpty(message = "comment body should not be null")
    private String body;

}
