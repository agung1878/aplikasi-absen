package id.go.absen.aplikasiabsen.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author agung
 */
@Entity
@Table(name = "c_security_user")
public class User extends BaseEntity{
    
    @Column(nullable = false,unique = true)
    private @Getter @Setter String username;
    
    @Transient
    private @Getter @Setter String password;
    
    @NotNull
    private @Getter @Setter Long nik;
    
    @OneToOne(mappedBy = "user", optional = true)
    @Cascade(CascadeType.ALL)
    private @Getter @Setter UserPassword userPassword;
    
    @ManyToMany
    @JoinTable(
        name="c_security_user_permission", 
        joinColumns=@JoinColumn(name="id_user", nullable=false),
        inverseJoinColumns=@JoinColumn(name="id_permission", nullable=false)
    )
    private Set<Permission> permissionSet = new HashSet<Permission>();

    public Set<Permission> getPermissionSet() {
        return permissionSet;
    }

    public void setPermissionSet(Set<Permission> permissionSet) {
        this.permissionSet = permissionSet;
    }
    
    public User(){ }

    public User(String username, String password, String noHp, String fullName, String email, Long nik, UserPassword userPassword) {
        this.username = username;
        this.password = password;
        this.nik = nik;
        this.userPassword = userPassword;
    }
    
    
}
