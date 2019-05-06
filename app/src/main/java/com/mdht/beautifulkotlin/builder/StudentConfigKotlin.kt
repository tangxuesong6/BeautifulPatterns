package com.mdht.beautifulkotlin.builder

class StudentConfigKotlin private constructor(
    val id: Int,
    val name: String,
    val grade: Int,
    val age: Int,
    val address: String,
    val favoriteColor: String
) {
    private constructor(builder: Builder) : this(
        builder.id,
        builder.name,
        builder.grade,
        builder.age,
        builder.address,
        builder.favoriteColor
    )

    companion object {
        fun create(init: Builder.() -> Unit): StudentConfigKotlin {
            return Builder(init).create()
        }
    }

    class Builder private constructor() {
        constructor(init: Builder.() -> Unit) : this() {
            init()
        }

        var id: Int = 0
        var name: String = ""
        var grade: Int = 0
        var age: Int = 0
        var address: String = ""
        var favoriteColor: String = ""
        fun setId(init: Builder.() -> Int) {
            apply { id = init() }
        }

        fun setName(init: Builder.() -> String) {
            apply { name = init() }
        }

        fun setGrade(init: Builder.() -> Int) {
            apply { grade = init() }
        }

        fun setAge(init: Builder.() -> Int) {
            apply { age = init() }
        }

        fun setAddress(init: Builder.() -> String) {
            apply { address = init() }
        }

        fun setFavoriteColor(init: Builder.() -> String) {
            apply { favoriteColor = init() }
        }

        fun create(): StudentConfigKotlin {
            return StudentConfigKotlin(this)
        }
    }
}