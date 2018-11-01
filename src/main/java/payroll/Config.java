package payroll;


import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "payroll")
@EntityScan(basePackages = "payroll")
@EnableJpaRepositories(basePackages = "payroll")
public class Config {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
