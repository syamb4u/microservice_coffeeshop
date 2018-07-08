package com.lijingyao.microservice.coffee.item.persistence.entity;

import com.lijingyao.microservice.coffee.base.durid.entity.UtcTimeIntIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * name=拿铁 ，simpleName = L ； name =焦糖玛奇朵 ，simpleName = CM
 * Created by lijingyao on 2018/7/8 22:25.
 */
@Entity
@Table(name = "category")
public class Category extends UtcTimeIntIdEntity {


    @NotNull
    private String name;

    @NotNull
    @Column(name = "simple_name", length = 64)
    private String simpleName;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }
}
