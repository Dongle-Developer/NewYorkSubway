package com.example.dongle.nycsubway.mockito.test

/**
 * Created by Dongle on 2017-12-26.
 */
interface LoginService  {
    fun login(id : String, pw : String) : Boolean
}