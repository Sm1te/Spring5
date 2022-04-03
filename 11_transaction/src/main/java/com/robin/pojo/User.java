package com.robin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 引入无参构造，get和set方法以及toString方法
@AllArgsConstructor // 引入有参构造
@NoArgsConstructor // 再次引入无参构造，防止引入有参构造时覆盖无参构造
public class User {

    private int id;
    private String name;
    private String pwd;

}