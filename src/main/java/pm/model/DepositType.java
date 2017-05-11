/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pm.model;

import java.io.Serializable;
import javax.persistence.Entity;
import org.springframework.data.annotation.Id;

/**
 * 
 * @author Amine Jendoubi 
 */
@Entity
public class DepositType implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
