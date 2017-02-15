package myPackage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationConfiguration {

    @Bean
    ProgrammaticController programmaticController(@Qualifier("programmaticService") ProgrammaticService service) {
        return new ProgrammaticController(service);
    }

    @Bean
    ProgrammaticService programmaticService() {
        return new ProgrammaticService() {
            @Override
            public void printText(String text) {
                System.out.println("programmaticService; Texto que saiu da classe myPackage.ApplicationConfiguration: " + text);
            }
        };
    }

    @Bean
    ProgrammaticController programmaticAlternativeController(@Qualifier("programmaticAlternativeService") ProgrammaticService service) {
        return new ProgrammaticController(service);
    }

    @Bean
    ProgrammaticService programmaticAlternativeService() {
        return new ProgrammaticService() {
            @Override
            public void printText(String text) {
                System.out.println("programmaticAlternativeService; Texto que saiu da classe myPackage.ApplicationConfiguration: " + text);
            }
        };
    }
}
