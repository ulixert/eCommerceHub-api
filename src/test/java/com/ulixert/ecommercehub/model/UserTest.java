package com.ulixert.ecommercehub.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class UserTest {

    @Test
    void testEqualsAndHashCode() {
        User user1 = new User();
        user1.setId(1L);
        user1.setEmail("test@example.com");

        User user2 = new User();
        user2.setId(1L);
        user2.setEmail("test@example.com");

        User user3 = new User();
        user3.setId(2L);
        user3.setEmail("other@example.com");

        // Test equality
        assertEquals(user1, user2, "Users with same ID should be equal");
        assertNotEquals(user1, user3, "Users with different IDs should not be equal");

        // Test hash codes
        assertEquals(user1.hashCode(), user2.hashCode(), "Hash codes should be equal for equal users");
        assertNotEquals(user1.hashCode(), user3.hashCode(), "Hash codes should differ for different users");
    }
}