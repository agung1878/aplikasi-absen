/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.absen.aplikasiabsen.dao;

import id.go.absen.aplikasiabsen.entity.User;
import java.util.Optional;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author agung
 */
public interface UserDao extends PagingAndSortingRepository<User, String>{
    
//    Optional<User> findByUsername(String username);
//    User findByEmail(String email);
//    User findByHp(String hp);
    
}
