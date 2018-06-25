package id.go.absen.aplikasiabsen.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import id.go.absen.aplikasiabsen.constans.AppType;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author agung
 */
@Entity @Table(name = "c_security_grup_permission")
public class GrupPermission extends BaseEntity{
    
    @NotEmpty(message = "Nama tidak boleh kosong")
    @Column(name = "name", nullable = false, unique = true)
    private @Getter @Setter String name;
    
    @NotNull(message = "App tidak boleh kosong")
    @Enumerated(EnumType.STRING)
    private @Getter @Setter AppType app;
    
    @NotEmpty(message = "Permission tidak boleh kosong")
    @JsonBackReference
    @OneToMany(mappedBy = "grupPermission", cascade = CascadeType.ALL, orphanRemoval = true)
    private @Getter @Setter List<Permission> listPermission = new ArrayList<>();
}
