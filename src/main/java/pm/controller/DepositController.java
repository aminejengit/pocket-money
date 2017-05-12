/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm.controller;

import java.util.List;
import static jdk.nashorn.internal.runtime.Debug.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pm.model.DepositType;
import pm.service.DepositTypeService;

@RestController
public class DepositController {

    @Autowired
    private DepositTypeService depositTypeService;

    @RequestMapping("/private/deposit-types")
    public List<DepositType> getDeposits() {
        return depositTypeService.getDeposits();
    }

    @RequestMapping("/private/deposit-types/{id}")
    public DepositType getDeposits(@PathVariable("id") long id) {
        return depositTypeService.getDepositType(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/private/deposit-types")
    public void addDepositType(@RequestBody DepositType depositType) {
        depositTypeService.addDepoistType(depositType);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/private/deposit-types")
    public void updateDepositType(@RequestBody DepositType depositType) {
        depositTypeService.updateDepoistType(depositType);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/private/deposit-types/{id}")
    public void updateDepositType(@PathVariable("id") long id) {
        depositTypeService.deleteDepositType(id);
    }

}
