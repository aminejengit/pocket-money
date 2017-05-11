/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm.service;

import java.util.List;
import java.util.NoSuchElementException;
import pm.model.DepositType;

/**
 *
 * @author Amine Jendoubi
 */

public interface DepositTypeService {
      public List<DepositType> getDeposits();
      public DepositType getDepositType(long id) throws NoSuchElementException;
      public void addDepoistType(DepositType deposittype);
      public void updateDepoistType(DepositType depositType);
      public void deleteDepositType(long id);
}
