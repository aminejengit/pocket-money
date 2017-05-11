/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pm.model.DepositType;

/**
 *
 * @author Amine Jendoubi
 */
@Repository
public interface DepositTypeRepository extends CrudRepository<DepositType,Long>{
    
}
