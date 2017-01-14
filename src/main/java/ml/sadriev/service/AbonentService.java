package ml.sadriev.service;

import ml.sadriev.model.Abonent;
import java.util.List;

public interface AbonentService {
    Abonent addAbonent(Abonent abonent);
    void deleteAbonent(Long id);
    Abonent editAbonent(Abonent abonent);
    Abonent getByAddress(String address);
    Abonent getByName(String name);
    List<Abonent> getAll();
}
