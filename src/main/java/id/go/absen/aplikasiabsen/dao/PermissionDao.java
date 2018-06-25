package id.go.absen.aplikasiabsen.dao;

import id.go.absen.aplikasiabsen.entity.Permission;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author agung
 */
public interface PermissionDao extends PagingAndSortingRepository<Permission, String>{
    
}
