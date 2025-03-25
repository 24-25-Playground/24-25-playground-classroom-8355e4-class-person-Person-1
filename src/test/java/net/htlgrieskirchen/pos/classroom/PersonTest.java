package net.htlgrieskirchen.pos.classroom;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        Person person = new Person("Mouse", "Mickey");
        String expected = "Mickey Mouse";
        assertEquals(expected, person.toString());
    }
}