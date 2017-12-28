package com.example.dongle.nycsubway

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.powermock.modules.junit4.PowerMockRunner
import org.powermock.reflect.Whitebox


/**
 * Created by Dongle on 2017-12-27.
 */
@RunWith(PowerMockRunner::class)
class powermocktestclass {

    class privateFildClass{
        private val secretField:String = "secret value"
    }

    @Test
    fun accessPrivateFieldByName() {
        val pf = privateFildClass()
        Whitebox.setInternalState(pf, "secretField", "secret value")
        val s = Whitebox.getInternalState<String>(pf, "secretField")
        Assert.assertEquals("secret value", s)
    }
}


