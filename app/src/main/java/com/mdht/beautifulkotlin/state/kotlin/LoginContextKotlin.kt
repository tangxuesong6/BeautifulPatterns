package com.mdht.beautifulkotlin.state.kotlin

class LoginContextKotlin {
    private var userStateKotlin: UserStateKotlin = UserStateKotlin.LogoutStateKotlin
    fun setState(userStateKotlin: UserStateKotlin) {
        this.userStateKotlin = userStateKotlin
    }

    fun comment() {
        userStateKotlin.comment()
    }
    fun forward(){
        userStateKotlin.forward()
    }
}