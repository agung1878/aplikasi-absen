package id.go.absen.aplikasiabsen.dao;

import id.go.absen.aplikasiabsen.entity.Kelas;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author agung
 */
public interface KelasDao extends PagingAndSortingRepository<Kelas, String>{
    public Page<Kelas> findBynamaKelasContainingIgnoreCase(String namaKelas, Pageable page);
}
