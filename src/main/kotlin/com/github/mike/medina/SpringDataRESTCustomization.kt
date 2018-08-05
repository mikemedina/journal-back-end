package com.github.mike.medina

import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter
import org.springframework.stereotype.Component


@Component
class SpringDataRestCustomization : RepositoryRestConfigurerAdapter() {

    // https://docs.spring.io/spring-data/rest/docs/current/reference/html/#customizing-sdr.configuring-cors
    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration?) {
        config!!.corsRegistry
                .addMapping("/posts/**")
                .allowedOrigins("http://localhost:8000")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("Access-Control-Allow-Origin")
                .exposedHeaders("Access-Control-Allow-Origin")
                .maxAge(3600)
    }
}
