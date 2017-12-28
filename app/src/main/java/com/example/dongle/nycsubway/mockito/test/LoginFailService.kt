package com.example.dongle.nycsubway.mockito.test

/**
 * Created by Dongle on 2017-12-26.
 */

@TestOpenAnnotation
class LoginFailService : LoginService{

    override fun login(id: String, pw: String): Boolean {
        return false
    }

}