/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import pm.model.DepositType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DepositController {

    @RequestMapping("/createDepositType/{name}")
    public List<DepositType> createDepostType(@PathVariable("name") String name) {
        List list = new ArrayList();
        DepositType depositType = new DepositType();
        depositType.setId(new Random().nextLong());
        depositType.setName(name);
        list.add(depositType);
        list.add(depositType);
        list.add(depositType);
        return list;
    }

}
