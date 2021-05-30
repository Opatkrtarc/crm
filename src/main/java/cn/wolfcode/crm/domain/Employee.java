package cn.wolfcode.crm.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private Long id;

    private String username;

    private String password;

    private int age;
}