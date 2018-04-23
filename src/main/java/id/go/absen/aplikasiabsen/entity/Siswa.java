package id.go.absen.aplikasiabsen.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author agung
 */
@Entity
@Table
public class Siswa extends BaseEntity{
    
    @ManyToOne
    @NotNull
    @JoinColumn(name = "id_kelas")
    public Kelas kelas;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "id_jurusan")
    public Jurusan jurusan;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 10)
    @Column(unique = true)
    public String nis;

    @NotNull
    @NotEmpty
    public String namaSiswa;

    @NotNull
    @NotEmpty
    public String alamat;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    @Future
    @Temporal(TemporalType.DATE)
    public Date tanggalLahir;

    @NotNull
    @NotEmpty
    public String tempatLahir;

    @NotNull
    @NotEmpty
    public String jenisKelamin;

    @NotNull
    @NotEmpty
    public String agama;

    @NotNull
    @NotEmpty
    public String nomorTelepon;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Kelas getKelas() {
        return kelas;
    }

    public void setKelas(Kelas kelas) {
        this.kelas = kelas;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getNamaSiswa() {
        return namaSiswa;
    }

    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    
}
