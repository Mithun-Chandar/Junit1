package pl.vistula;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @org.junit.jupiter.api.Test
    void add() {
        assertAll(() -> assertEquals(4,Operations.add(2,2)),
                () -> assertEquals(7,Operations.add(2,5)),
                () -> assertEquals(11,Operations.add(6,4)));
    }

    @org.junit.jupiter.api.Test
    void sub() {
        assertAll(() -> assertEquals(10,Operations.sub(22,12)),
                () -> assertEquals(32,Operations.sub(74,42)),
                () -> assertEquals(11,Operations.sub(6,4)));

    }

    @org.junit.jupiter.api.Test
    void mul() {
        assertAll(() -> assertEquals(25,Operations.mul(5,5)),
                () -> assertEquals(1,Operations.mul(1,1)),
                () -> assertEquals(123,Operations.mul(6,4)));

    }

    @org.junit.jupiter.api.Test
    void div() {
        assertAll(() -> assertEquals(1,Operations.add(2,2)),
                () -> assertEquals(7,Operations.add(2,5)),
                () -> assertEquals(2.5,Operations.add(5,2)));

    }
}