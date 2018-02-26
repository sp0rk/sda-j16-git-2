package me.jurec;

import static junit.framework.TestCase.assertEquals;

public class MainTest {

    @org.junit.Test
    public void printTheAnswer() {
        assertEquals(Main.calculateTheAnswer(), 42);
    }
}