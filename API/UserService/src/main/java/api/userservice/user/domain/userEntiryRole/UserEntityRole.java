package api.userservice.user.domain.userEntiryRole;


import api.userservice.user.domain.baseEntity.BaseEntity;
import api.userservice.user.domain.userEntity.UserEntity;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class UserEntityRole extends BaseEntity {

    private String role;
    private UserEntity user;

    public UserEntityRole() {
    }

    public UserEntityRole(String role) {
        this.role = role;
    }

    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @ManyToOne()
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
