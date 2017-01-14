package ml.sadriev.model;

import javax.persistence.*;

@Entity
@Table(name = "water")
@SequenceGenerator(sequenceName = "water_seq", name = "waterSequence")
public class Water {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "waterSequence")
    private long Id;

    @OneToOne(mappedBy = "water", optional = false)
    private Account account;

    @Column(unique = true, nullable = false)
    private int count;

    @Column(unique = true, nullable = false)
    private double pricePerOnce;

    public Water() {
    }

    public Water(Account account, double pricePerOnce, int count) {
        this.account = account;
        this.pricePerOnce = pricePerOnce;
        this.count = count;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPricePerOnce() {
        return pricePerOnce;
    }

    public void setPricePerOnce(double pricePerOnce) {
        this.pricePerOnce = pricePerOnce;
    }
}
