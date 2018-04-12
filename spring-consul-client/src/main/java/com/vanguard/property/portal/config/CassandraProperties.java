package com.vanguard.property.portal.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("cassandra")
@Data
public class CassandraProperties {

    private String host;

    private String user;

    private String password;

}
