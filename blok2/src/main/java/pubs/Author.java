package pubs;

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
        @NamedQuery(name = "findAll", query = "SELECT a FROM Author a"),
        @NamedQuery(name = "find", query = "SELECT a FROM Author a WHERE a.id=:id")

})
@Table(name = "Authors")
public class Author {

    @Id
    @GeneratedValue
    @Column(name = "AU_ID")
    private Long id;

    @Column(name = "AU_LNAME")
    private String lastname;


}
