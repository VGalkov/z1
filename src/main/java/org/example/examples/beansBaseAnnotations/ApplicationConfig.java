package org.example.examples.beansBaseAnnotations;

import org.example.examples.beansBaseAnnotations.builderLine.HeavyCraftAnnotations;
import org.example.examples.beansBaseAnnotations.builderLine.LightCraftAnnotations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class ApplicationConfig {


    @Bean
    public CraftFactoryAnnotations craftFactoryAnnotations() {
        return new CraftFactoryAnnotations();
    }

    @Bean
    public HeavyCraftAnnotations getHatchBackProductLine() {
        return new HeavyCraftAnnotations();
    }

    @Bean
    public LightCraftAnnotations getLightCraftAnnotations() {
        return new LightCraftAnnotations();
    }

}
