package com.siwen.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @projectName: ssm
 * @package: com.siwen.pojo
 * @className: Student
 * @author: 749291
 * @description: TODO
 * @date: 9/8/2023 10:22 PM
 * @version: 1.0
 */


@Getter
@Setter
@ToString
@NoArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String classes;
}