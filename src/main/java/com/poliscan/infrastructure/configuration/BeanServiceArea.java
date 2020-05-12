package com.poliscan.infrastructure.configuration;

import com.poliscan.domain.port.repository.RepositoryArea;
import com.poliscan.domain.service.area.ServiceCreateArea;
import com.poliscan.domain.service.area.ServiceDeleteArea;
import com.poliscan.domain.service.area.ServiceListArea;
import com.poliscan.domain.service.area.ServiceUpdateArea;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServiceArea {

    @Bean
    public ServiceCreateArea serviceCreateArea(RepositoryArea repositoryArea){
        return new ServiceCreateArea(repositoryArea);
    }

    @Bean
    public ServiceDeleteArea serviceDeleteArea(RepositoryArea repositoryArea) {
        return new ServiceDeleteArea(repositoryArea);
    }

    @Bean
    public ServiceListArea serviceListArea(RepositoryArea repositoryArea){
        return new ServiceListArea(repositoryArea);
    }

    @Bean
    public ServiceUpdateArea serviceUpdateArea(RepositoryArea repositoryArea) {
        return new ServiceUpdateArea(repositoryArea);
    }
}
