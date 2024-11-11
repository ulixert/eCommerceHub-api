package com.ulixert.ecommercehub.model.embedable;

import com.ulixert.ecommercehub.model.enums.PaymentStatus;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDetails {

    private PaymentStatus paymentStatus;


}
