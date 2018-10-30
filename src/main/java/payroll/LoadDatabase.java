package payroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository,RoleRepository roleRepository) {
        return args -> {
            Employee bilboBaggins = new Employee("Bilbo Baggins");
            Role sadsad = new Role("sadsad");
            bilboBaggins.setRole_id(sadsad);
            log.info("Preloading " + repository.save(bilboBaggins));
        };
    }
}
