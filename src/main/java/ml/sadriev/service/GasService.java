package ml.sadriev.service;

/**
 * Created by Andrey Sadriev aka AESFUI on 14.01.2017.
 */
public interface GasService {
    Long getAccount(Long id);
    void setCount(int count);
    int getCount(Long id);
    void setPricePerOnce(double pricePerOnce);
    double getPriceperOnce(Long id);
}
