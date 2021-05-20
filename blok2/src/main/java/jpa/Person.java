package jpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@NamedQueries({
        @NamedQuery(name = "findAll", query = "SELECT p FROM Person p"),
        @NamedQuery(name = "find", query = "SELECT p FROM Person p WHERE p.id=:id")

})
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;


}
