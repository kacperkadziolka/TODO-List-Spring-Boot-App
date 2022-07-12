package com.kkadziolka.TODOList.TODO;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class TODOConfig {

    @Bean
    CommandLineRunner commandLineRunner(TODORepository repository) {
        return args -> {
            TODO shopping = new TODO(
                    "Shopping", "Do shopping",
                    LocalDate.of(2022, Month.JULY, 11),
                    LocalDate.of(2022, Month.JULY, 15));

            TODO homework = new TODO(
                    "Homework", "Do homework",
                    LocalDate.of(2022, Month.JULY, 9),
                    LocalDate.of(2022, Month.JULY, 19));

            repository.saveAll(List.of(shopping, homework));
        };
    }
}
