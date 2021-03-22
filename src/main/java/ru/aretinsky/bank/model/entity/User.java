package ru.aretinsky.bank.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.aretinsky.bank.domain.Country;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 15, nullable = false)
    private String login;

    @Column(length = 20, nullable = false)
    private String firstname;

    @Column(length = 30, nullable = false)
    private String secondname;

    @Column(length = 40, nullable = false)
    private String email;

    //with country code
    @Column(length = 15)
    private long phone;

    @Enumerated(EnumType.STRING)
    private Country country;

    @Column(length = 3)
    private int age;

    @Column(nullable = false)
    private Date birthDate;

    @CreationTimestamp
    private Timestamp registeredAt;

    // 1 - women, 0 - man
    private Boolean sex;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
