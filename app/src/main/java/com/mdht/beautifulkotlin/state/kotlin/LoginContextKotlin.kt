package com.mdht.beautifulkotlin.state.kotlin

class LoginContextKotlin {
    private lateinit var userStateKotlin: UserStateKotlin
    private fun setState(userStateKotlin: UserStateKotlin) {
        this.userStateKotlin = userStateKotlin
    }

    fun comment() {
        userStateKotlin.comment()
    }

    fun forward() {
        userStateKotlin.forward()
    }

    fun login() {
        userStateKotlin = UserStateKotlin.LoginedStateKotlin
    }

    fun logout() {
        userStateKotlin = UserStateKotlin.LogoutStateKotlin
    }

    val isLogin: Boolean
        get() = when (userStateKotlin) {
            is UserStateKotlin.LoginedStateKotlin -> true
            is UserStateKotlin.LogoutStateKotlin -> false
        }

}