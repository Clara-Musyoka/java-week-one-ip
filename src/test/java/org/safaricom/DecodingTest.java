package org.safaricom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodingTest {
    @Test
    @DisplayName("Decoding class should be okay")
    void decode(){
        assertEquals("cab", Decoding.decode("dbc", 1));
    }

}