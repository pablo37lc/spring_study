package com.mysite.spring_study.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {

    @Size(min = 3, max = 25)
    @NotEmpty(message = "ID를 입력하세요.")
    private String username;

    @NotEmpty(message = "비밀번호를 입력하세요.")
    private String password;

    @NotEmpty(message = "비밀번호 확인을 입력하세요.")
    private String passwordCheck;

    @NotEmpty(message = "이메일을 입력하세요.")
    @Email
    private String email;
}
