package com.mdht.beautifulkotlin.state.kotlin

import android.util.Log

sealed class UserStateKotlin {
    abstract fun forward()
    abstract fun comment()

    object LoginedStateKotlin : UserStateKotlin() {
        override fun forward() {
            Log.d("LoginedStateKotlin", "LoginedStateKotlin 点击了转发，可以转发")
        }

        override fun comment() {
            Log.d("LoginedStateKotlin", "LoginedStateKotlin 点击了评论，可以评论")
        }

    }

    object LogoutStateKotlin : UserStateKotlin() {
        override fun forward() {
            Log.d("LogoutStateKotlin", "LogoutStateKotlin 点击了转发，不可以转发，请登录")
        }

        override fun comment() {
            Log.d("LogoutStateKotlin", "LogoutStateKotlin 点击了评论，不可以转发，请登录")
        }
    }
}