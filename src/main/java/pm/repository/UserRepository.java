/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pm.model.User;

/**
 * 
 * @author Amine Jendoubi 
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findOneByUsername(String username);
}
