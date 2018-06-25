package id.go.absen.aplikasiabsen.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author agung
 */
@Entity
@Table(name = "c_security_permission")
public class Permission extends BaseEntity {
    
    @NotEmpty(message = "Label tidak boleh kosong")
    @Column(name = "permission_label", nullable = false, unique = false)
    private @Getter @Setter String label;
    
    @NotEmpty(message = "Value tidak boleh kosong")
    @Column(name = "permission_value", nullable = false, unique = true)
    private @Getter @Setter String value;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_grup_permission")
    private @Getter @Setter GrupPermission grupPermission;
}
