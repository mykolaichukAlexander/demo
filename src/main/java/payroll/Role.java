package payroll;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Role {

    private @Id @GeneratedValue Long id;

    private String name;

    @OneToOne
    private Employee employee_id;

    public Role (String name){
        this.name = name;
    }
}
