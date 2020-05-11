package com.poliscan.infrastructure.configuration;

import com.poliscan.domain.port.repository.RepositoryUser;
import com.poliscan.domain.service.user.ServiceCreateUser;
import com.poliscan.domain.service.user.ServiceDeleteUser;
import com.poliscan.domain.service.user.ServiceListUser;
import com.poliscan.domain.service.user.ServiceUpdateUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServiceUser {

    @Bean
    public ServiceCreateUser serviceCreateUser(RepositoryUser repositoryUser) {
        return new ServiceCreateUser(repositoryUser);
    }

    @Bean
    public ServiceUpdateUser serviceUpdateUser(RepositoryUser repositoryUser) {
        return new ServiceUpdateUser(repositoryUser);
    }

    @Bean
    public ServiceListUser serviceListUser(RepositoryUser repositoryUser) {
        return new ServiceListUser(repositoryUser);
    }

    @Bean
    public ServiceDeleteUser serviceDeleteUser(RepositoryUser repositoryUser) {
        return new ServiceDeleteUser(repositoryUser);
    }
}
