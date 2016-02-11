package su.allabergen.mynote.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Rabat on 11.02.2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan("su.allabergen.mynote.server")
public class WebConfig extends WebMvcConfigurerAdapter {

}
