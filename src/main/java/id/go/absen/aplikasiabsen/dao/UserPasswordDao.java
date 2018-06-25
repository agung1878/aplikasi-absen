/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.absen.aplikasiabsen.dao;

import id.go.absen.aplikasiabsen.entity.UserPassword;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author agung
 */
public interface UserPasswordDao extends PagingAndSortingRepository<UserPassword, String>{
    
}
