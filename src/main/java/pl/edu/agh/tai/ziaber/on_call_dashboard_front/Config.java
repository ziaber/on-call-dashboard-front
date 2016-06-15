package pl.edu.agh.tai.ziaber.on_call_dashboard_front;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by SG0222573 on 5/31/2016.
 */
@Configuration
public class Config {

    @Bean
    public WebMvcConfigurerAdapter forwardToIndex() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                // forward requests to /admin and /user to their index.html
                registry.addViewController("/user").setViewName(
                        "forward:/index.html");
                registry.addViewController("/admin").setViewName(
                        "forward:/admin.html");
            }
        };
    }

}
