package ml.sadriev.service.impl;

import ml.sadriev.model.Abonent;
import ml.sadriev.repository.AbonentRepository;
import ml.sadriev.service.AbonentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AbonentServiceImpl implements AbonentService{
    @Autowired
    private AbonentRepository abonentRepository;

    @Override
    public Abonent addAbonent(Abonent abonent) {
        Abonent savedAbonent = abonentRepository.saveAndFlush(abonent);
        return savedAbonent;
    }

    @Override
    public void deleteAbonent(Long id) {
        abonentRepository.delete(id);
    }

    /*@Override
    public Abonent editAbonent(Abonent abonent) {
        return null;
    }

    @Override
    public Abonent getByAddress(String address) {
        return null;
    }*/

    @Override
    public Abonent getByName(String name) {
        return abonentRepository.findByName(name);
    }

    @Override
    public List<Abonent> getAll() {
        return abonentRepository.findAll();
    }
}
