package br.com.thiago.arquitetura_hexagonal_exemplo.adapters;

import br.com.thiago.arquitetura_hexagonal_exemplo.domain.ports.ParkCarUseCasePort;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parkcars")
public class ParkCarController {

    private final ParkCarUseCasePort parkCarUseCasePort;

    public ParkCarController(ParkCarUseCasePort parkCarUseCasePort) {
        this.parkCarUseCasePort = parkCarUseCasePort;
    }

    @PostMapping("/checkin")
    public void checkin(@RequestParam String plate){
        parkCarUseCasePort.checkin(plate);
    }

    @PostMapping("/checkout")
    public void checkout(@RequestParam String plate){
        parkCarUseCasePort.checkout(plate);
    }
}
