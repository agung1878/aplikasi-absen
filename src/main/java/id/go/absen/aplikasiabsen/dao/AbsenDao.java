package id.go.absen.aplikasiabsen.dao;

import id.go.absen.aplikasiabsen.entity.Absen;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author agung
 */
public interface AbsenDao extends PagingAndSortingRepository<Absen, String>{
    
}
