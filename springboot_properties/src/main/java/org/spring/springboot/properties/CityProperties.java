package org.spring.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2018/04/09
 */
@Component
@ConfigurationProperties(prefix = "city")
public class CityProperties {

    private Long id;

    private String cityName;

    private String desc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "CityProperties{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
