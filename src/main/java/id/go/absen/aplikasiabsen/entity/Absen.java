package id.go.absen.aplikasiabsen.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author agung
 */
@Entity
@Table
public class Absen extends BaseEntity {

    @ManyToOne
    @NotNull
    @JoinColumn(name = "id_siswa")
    public Siswa siswa;

    @NotNull
    @NotEmpty
    public String masuk;

    @NotNull
    @NotEmpty
    public String izin;

    @NotNull
    @NotEmpty
    public String alpa;

    @NotNull
    @NotEmpty
    public String sakit;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    @Future
    @Temporal(TemporalType.DATE)
    public Date tanggalAbsen;

    @NotNull
    @NotEmpty
    public String keterangan;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Siswa getSiswa() {
        return siswa;
    }

    public void setSiswa(Siswa siswa) {
        this.siswa = siswa;
    }

    public String getMasuk() {
        return masuk;
    }

    public void setMasuk(String masuk) {
        this.masuk = masuk;
    }

    public String getIzin() {
        return izin;
    }

    public void setIzin(String izin) {
        this.izin = izin;
    }

    public String getAlpa() {
        return alpa;
    }

    public void setAlpa(String alpa) {
        this.alpa = alpa;
    }

    public String getSakit() {
        return sakit;
    }

    public void setSakit(String sakit) {
        this.sakit = sakit;
    }

    public Date getTanggalAbsen() {
        return tanggalAbsen;
    }

    public void setTanggalAbsen(Date tanggalAbsen) {
        this.tanggalAbsen = tanggalAbsen;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    
    
}
