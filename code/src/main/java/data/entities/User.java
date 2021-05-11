package data.entities;

import javax.persistence.*;

import static config.GlobalConstants.DB_CHAR_LENGTH;
import static config.GlobalConstants.DB_DNI_LENGTH;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = DB_CHAR_LENGTH)
    private String name;

    @Column(name = "dni", updatable = false, length = DB_DNI_LENGTH, unique = true)
    private String dni;

    public User(){
        //DEFAULT CONSTRUCTOR
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
