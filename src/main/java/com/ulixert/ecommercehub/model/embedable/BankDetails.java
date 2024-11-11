package com.ulixert.ecommercehub.model.embedable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class BankDetails {

    private String accountNumber;
    private String accountHolderName;
    private String bankName;
    private String bankCode;
}
