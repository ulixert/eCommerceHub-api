package com.ulixert.ecommercehub.model.embedable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class BusinessDetails {

    private String businessName;
    private String businessEmail;
    private String businessPhoneNumber;
    private String businessAddress;
    private String logo;
    private String banner;
}
