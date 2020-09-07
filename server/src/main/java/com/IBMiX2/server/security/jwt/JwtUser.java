package com.IBMiX2.server.security.jwt;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Collection;
import java.util.Date;

public class JwtUser implements UserDetails {

    private final Integer userId;
    //private final String userRole;
    private final String userLogin;
    private final String userStatus;
    private final String firstName;
    private final String lastName;
    private final String patronymic;
    private final String userPassword;
    private final String crewRole;
    private final Date standingFromDate;
    private final Date standingFromDateInRole;
    private final Integer reliabilityIndex;
    private final Integer rewardsAndPunishments;

    private final boolean isEnable;
    private final Collection<? extends GrantedAuthority> authorities;

    public JwtUser(Integer userId, String userLogin, String userStatus, String firstName, String lastName,
                   String patronymic, String userPassword, String crewRole, Date standingFromDate, Date standingFromDateInRole,
                   Integer reliabilityIndex, Integer rewardsAndPunishments, boolean isEnable, Collection<? extends GrantedAuthority> authorities) {
        this.userId = userId;
        this.userLogin = userLogin;
        this.userStatus = userStatus;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.userPassword = userPassword;
        this.crewRole = crewRole;
        this.standingFromDate = standingFromDate;
        this.standingFromDateInRole = standingFromDateInRole;
        this.reliabilityIndex = reliabilityIndex;
        this.rewardsAndPunishments = rewardsAndPunishments;
        this.isEnable = isEnable;
        this.authorities = authorities;
    }

    @JsonIgnore
    public Integer getUserId() { return userId; }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() { return true; }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { return authorities; }

    @JsonIgnore
    @Override
    public String getPassword() {
        return userPassword;
    }

    @Override
    public String getUsername() {
        return firstName;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonLocked() {
        return true;
    }


    @Override
    public boolean isEnabled() {
        return isEnable;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserPatronymic() {
        return patronymic;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public String getCrewRole() {
        return crewRole;
    }

    public Date getStandingFromDate() {
        return standingFromDate;
    }

    public Date getStandingFromDateInRole() {
        return standingFromDateInRole;
    }

    public Integer getReliabilityIndex() {
        return reliabilityIndex;
    }

    public Integer getRewardsAndPunishments() {
        return rewardsAndPunishments;
    }

    public String getuserStatus() {
        return userStatus;
    }
}
