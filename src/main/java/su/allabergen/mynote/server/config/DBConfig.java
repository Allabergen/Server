package su.allabergen.mynote.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

/**
 * Created by Rabat on 11.02.2016.
 */
@Configuration
@EnableJpaRepositories("su.allabergen.mynote.server.repository")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan("su.allabergen.mynote.server")
public class DBConfig {

    @Resource
    private Environment env;
}
