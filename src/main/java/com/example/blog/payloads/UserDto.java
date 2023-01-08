package com.example.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private int id;
    @NotEmpty
    @Size(min=1, message = "Username must be min of 4 characters")
    private String name;
    @NotEmpty
    @Size(min=1, max = 10, message = "Password must be min of 1 chars and max of 10 characters")
    private String password;
    @Email(message = "Your email address is not valid")
//    @Pattern(regexp = )
    private String email;
    @NotEmpty
    private String about;

}
