package br.com.thiago.arquitetura_hexagonal_exemplo.domain.usecases;

import br.com.thiago.arquitetura_hexagonal_exemplo.domain.models.Car;
import br.com.thiago.arquitetura_hexagonal_exemplo.domain.ports.ParkCarUseCasePort;

public class ParkCarUseCase implements ParkCarUseCasePort {

    @Override
    public void checkin(String plate){
        Car car = new Car(plate);
        //registra carro
        System.out.println("Registrando carro.");
        System.out.println("Horário de entrada: " + car.getCheckin());
    }

    @Override
    public void checkout(String plate){
        //busca carro pela placa
        //calcula valor a ser pago
        // registra pagamento e registra checkout
    }
}
