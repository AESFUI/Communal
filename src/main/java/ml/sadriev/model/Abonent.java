package ml.sadriev.model;

import javax.persistence.*;

@Entity
@Table(name = "abonent")
@SequenceGenerator(sequenceName = "abonent_seq", name = "abonentSequence")
public class Abonent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "abonentSequence")
    private Long id;

    @OneToOne(mappedBy = "abonent", optional = false)
    private Account account;

    @Column(unique = true, nullable = false)
    private String address;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    public Abonent() {
    }

    public Abonent(String address, String name, String surname) {
        this.address = address;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
