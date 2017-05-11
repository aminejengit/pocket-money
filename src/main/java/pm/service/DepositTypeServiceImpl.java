/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pm.model.DepositType;
import pm.repository.DepositTypeRepository;

/**
 *
 * @author Amine Jendoubi
 */
@Service
public class DepositTypeServiceImpl implements DepositTypeService {

    @Autowired
    private DepositTypeRepository depositTypeRepository;

    @Override
    public List<DepositType> getDeposits() {
        List<DepositType> list = new ArrayList();
        depositTypeRepository.findAll()
                .forEach(list::add);
        return list;
    }

    @Override
    public DepositType getDepositType(long id) throws NoSuchElementException {
        return depositTypeRepository.findOne(id);
    }

    @Override
    public void addDepoistType(DepositType deposittype) {
        depositTypeRepository.save(deposittype);
    }

    @Override
    public void updateDepoistType(DepositType depositType) {
        depositTypeRepository.save(depositType);
    }

    @Override
    public void deleteDepositType(long id) throws NoSuchElementException {
        depositTypeRepository.delete(id);
    }

}
