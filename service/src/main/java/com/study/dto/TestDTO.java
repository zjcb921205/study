package com.study.dto;

import java.io.Serializable;

/**
 * Created by chenbo on 2019/4/26
 */
public class TestDTO implements Serializable {

    private static final long serialVersionUID = 4508920572704082292L;
    private String name;
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
