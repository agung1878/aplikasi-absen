package id.go.absen.aplikasiabsen.dao;

import id.go.absen.aplikasiabsen.entity.Siswa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author agung
 */
public interface SiswaDao extends PagingAndSortingRepository<Siswa, String>{
    
    public Page<Siswa> findBynamaSiswaContainingIgnoreCase(String namaSiswa, Pageable page);
    
    Siswa findBynamaSiswa(String namaSiswa);
    
}
