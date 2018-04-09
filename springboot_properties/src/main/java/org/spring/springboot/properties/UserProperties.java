package org.spring.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2018/04/09
 */
@Component
@ConfigurationProperties(prefix = "user")
public class UserProperties {

    private Long id;

    private String userName;

    private String desc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "UserProperties{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
