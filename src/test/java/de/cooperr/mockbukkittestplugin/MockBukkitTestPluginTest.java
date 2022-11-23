package de.cooperr.mockbukkittestplugin;

import be.seeseemelk.mockbukkit.MockBukkit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MockBukkitTestPluginTest {
    
    @BeforeAll
    public static void setUp() {
        MockBukkit.mock();
    }
    
    @Test
    public void test() {
    }
    
    @AfterAll
    public static void tearDown() {
        MockBukkit.unmock();
    }
}
