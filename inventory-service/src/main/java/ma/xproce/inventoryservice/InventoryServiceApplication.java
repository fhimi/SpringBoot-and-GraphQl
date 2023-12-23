package ma.xproce.inventoryservice;

import ma.xproce.inventoryservice.dao.entities.Computer;
import ma.xproce.inventoryservice.dao.repositories.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ComputerRepository ComputerRepository) {
        return args -> {

            List<Computer> computerList =  List.of(
                    Computer.builder().proc("proc1").ram("ram1").hardDrive("hard1").price(12.5F).macAdress("mac1").build(),
                    Computer.builder().proc("proc2").ram("ram2").hardDrive("hard2").price(12.44F).macAdress("mac2").build(),
                    Computer.builder().proc("proc3").ram("ram3").hardDrive("hard3").price(155.5F).macAdress("mac3").build(),
                    Computer.builder().proc("proc4").ram("ram4").hardDrive("hard4").price(44.5F).macAdress("mac4").build()
            );
            ComputerRepository.saveAll(computerList);



        };
    }
}
