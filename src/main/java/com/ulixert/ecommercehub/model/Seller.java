package com.ulixert.ecommercehub.model;

import com.ulixert.ecommercehub.model.embedable.BankDetails;
import com.ulixert.ecommercehub.model.embedable.BusinessDetails;
import com.ulixert.ecommercehub.model.enums.AccountStatus;
import com.ulixert.ecommercehub.model.enums.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seller {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private Long id;

    private String name;

    private String phoneNumber;

    @Column(unique = true, nullable = false)
    private String email;
    private String password;

    @Embedded
    private BusinessDetails businessDetails = new BusinessDetails();

    @Embedded
    private BankDetails bankDetails = new BankDetails();

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    private UserRole role = UserRole.SELLER;

    private boolean isEmailVerified = false;

    private AccountStatus accountStatus = AccountStatus.PENDING;
}
