package ml.sadriev.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "account")
@SequenceGenerator(sequenceName = "account_seq", name = "accountSequence")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accountSequence")
    private Long id;

    @OneToOne(mappedBy = "account", optional = false)
    @JoinColumn(name="abonent_id", unique = true, nullable = false)
    private Abonent abonent;

    @Column(name = "creationDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Account() {
    }

    public Account(Abonent abonent) {
        this.abonent = abonent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Abonent getAbonent() {
        return abonent;
    }

    public void setAbonent(Abonent abonent) {
        this.abonent = abonent;
    }
}
