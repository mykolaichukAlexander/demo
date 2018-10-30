package payroll;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Employee {

    private @Id @GeneratedValue Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private Role role_id;

    public Employee(String name){
        this.name = name;
        //this.role = role;
    }
    public Employee(){}
}
