package com.example.dongle.nycsubway

import com.example.dongle.nycsubway.constant.PreferenceName
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {

    var app = mock(PreferenceName::class.java)


    @Test
    @Throws(Exception::class)
    fun addition_isCorrect() {
        assertEquals(4, (2 + 2).toLong())
    }

    @Test
    @Throws(Exception::class)
    fun test_mock_verification() {
       app.toString()

        verify(app).toString()
    }


}