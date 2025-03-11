package dat.security.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="roles")
public class Role {
    @Id
    String name;
    @ManyToMany(mappedBy = "roles")
    Set<User> users = new HashSet<>();

    public Role(String name){
        this.name = name;
    }
    public Role(){}
}
