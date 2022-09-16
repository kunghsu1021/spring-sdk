package cn.com.kun.springsdk.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@ConditionalOnProperty(prefix = "springsdk.autoconfig", value = {"enabled"}, havingValue = "true", matchIfMissing = true)
@ComponentScans(value =
        {@ComponentScan(value = "cn.com.kun.springsdk")})
@EntityScan(basePackages = {"cn.com.kun.springsdk"})
@Configuration
public class SpringSdkAutoConfiguration implements EnvironmentAware {

    private final static Logger LOGGER = LoggerFactory.getLogger(SpringSdkAutoConfiguration.class);

    public SpringSdkAutoConfiguration() {
        LOGGER.info("SpringTestAutoConfiguration自动配置初始化");
    }

    @Override
    public void setEnvironment(Environment environment) {

    }

}
