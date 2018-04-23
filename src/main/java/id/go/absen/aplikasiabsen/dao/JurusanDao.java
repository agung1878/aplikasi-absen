package id.go.absen.aplikasiabsen.dao;

import id.go.absen.aplikasiabsen.entity.Jurusan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author agung
 */
public interface JurusanDao extends PagingAndSortingRepository<Jurusan, String>{
    Page<Jurusan> findBynamaJurusanContainingIgnoreCase(String namaJurusan, Pageable page);
}
