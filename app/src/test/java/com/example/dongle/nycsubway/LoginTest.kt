package com.example.dongle.nycsubway

import com.example.dongle.nycsubway.mockito.test.LoginFailService
import com.example.dongle.nycsubway.mockito.test.LoginSuccessService
import org.junit.Test
import org.mockito.Matchers
import org.mockito.Mockito.*

/**
 * Created by Dongle on 2017-12-26.
 */
class LoginTest {

    /*Given*/
    var loginSuccessService = mock(LoginSuccessService::class.java)
    var loginFailService = mock(LoginFailService::class.java)

    @Test
    fun test_login_success(){

        val logintest =

        //when
        `when`(loginFailService.login(Matchers.anyString(),Matchers.anyString())).thenReturn(false)

        loginFailService.login("111","111")

        //then
        verify(loginFailService)



    }
}