package com.leqing.culture.culturalprojects.livestream.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "FEA_CUST_INFO")
public class UserVo implements Serializable {

    @Id
    @Column
    private String id;

    //@Column(name = "user_name")
    @Column(name = "name")
    private String userName;

    @Column(name = "age")
    private Character age;

    @Column(name = "status")
    private BigDecimal status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Character getAge() {
        return age;
    }

    public void setAge(Character age) {
        this.age = age;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }
}
