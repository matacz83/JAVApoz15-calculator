package pl.sda.spring.operation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class PercentageOperationConfiguration {

    @Bean
    SubtractionOperation subtractionOperation() {
        return new SubtractionOperation();
    }
}
