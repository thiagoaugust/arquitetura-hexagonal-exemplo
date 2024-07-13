package br.com.thiago.arquitetura_hexagonal_exemplo.config;

import br.com.thiago.arquitetura_hexagonal_exemplo.adapters.ParkCarController;
import br.com.thiago.arquitetura_hexagonal_exemplo.domain.ports.ParkCarUseCasePort;
import br.com.thiago.arquitetura_hexagonal_exemplo.domain.usecases.ParkCarUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParkCarBeanConfig {

    @Bean
    public ParkCarUseCasePort parkCarUseCase() {
        return new ParkCarUseCase();
    }

    @Bean
    public ParkCarController parkCarController(ParkCarUseCasePort parkCarPort) {
        return new ParkCarController(parkCarPort);
    }
}
