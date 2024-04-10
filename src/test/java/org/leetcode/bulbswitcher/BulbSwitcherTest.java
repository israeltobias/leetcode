package org.leetcode.bulbswitcher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BulbSwitcherTest {
    @Test
    void bulbSwitcher () {
        BulbSwitcher bulbSwitcher = new BulbSwitcher();
        int on = bulbSwitcher.bulbSwitch(3);
        int on1 = bulbSwitcher.bulbSwitch(1);
        int on2 = bulbSwitcher.bulbSwitch(0);
        assertEquals(1,on);
        assertEquals(1,on1);
        assertEquals(0,on2);
    }

}