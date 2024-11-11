package com.ulixert.ecommercehub.model.enums;

public enum AccountStatus {
    PENDING,            // PENDING is the default status
    ACTIVE,             // ACTIVE is the status after the account is verified
    SUSPENDED,          // SUSPENDED is the status after the account is suspended
    DEACTIVATED,        // DEACTIVATED is the status after the account is deactivated
    BANNED,             // BANNED is the status after the account is banned
    CLOSED              // CLOSED is the status after the account is closed
}
