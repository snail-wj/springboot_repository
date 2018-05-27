package com.wj.spongbob;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author WJ
 * @date 2018/05/27
 */
@Data
@ConfigurationProperties
public class Blog {

    private String title;
    private String content;

}
