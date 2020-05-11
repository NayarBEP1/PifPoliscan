package com.poliscan.infrastructure.configuration;

import com.poliscan.domain.port.repository.RepositoryQuestion;
import com.poliscan.domain.service.question.ServiceCreateQuestion;
import com.poliscan.domain.service.question.ServiceDeleteQuestion;
import com.poliscan.domain.service.question.ServiceListQuestion;
import com.poliscan.domain.service.question.ServiceUpdateQuestion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServiceQuestion {

    @Bean
    public ServiceCreateQuestion serviceCreateQuestion(RepositoryQuestion repositoryQuestion) {
        return new ServiceCreateQuestion(repositoryQuestion);
    }

    @Bean
    public ServiceUpdateQuestion serviceUpdateQuestion(RepositoryQuestion repositoryQuestion) {
        return new ServiceUpdateQuestion(repositoryQuestion);
    }

    @Bean
    public ServiceListQuestion serviceListQuestion(RepositoryQuestion repositoryQuestion) {
        return new ServiceListQuestion(repositoryQuestion);
    }

    @Bean
    public ServiceDeleteQuestion serviceDeleteQuestion(RepositoryQuestion repositoryQuestion) {
        return new ServiceDeleteQuestion(repositoryQuestion);
    }
}
