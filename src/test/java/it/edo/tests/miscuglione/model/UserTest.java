package it.edo.tests.miscuglione.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    public void wholeTest() {
        User user = new User();
        user.setId(0l);
        user.setUserName("edo");
        assertNotNull(user.getId());
        assertNotNull(user.getUserName());
    }
}