package com.mdht.beautifulkotlin.builder

/**
 * 没有用到kotlin所提供的特性，just生搬java代码改为kotlin实现，可以了解，并没有StudentConfitKotlin好
 */
class StudentConfigJustSeeSee private constructor() {
    var id: Int = 0
        private set
    var name: String? = null
        private set
    var grade: Int = 0
        private set
    var age: Int = 0
        private set
    var address: String? = null
        private set
    var favoriteColor: String? = null
        private set

    class Builder {
        private var id: Int = 0
        private var name: String? = null
        private var grade: Int = 0
        private var age: Int = 0
        private var address: String? = null
        private var favoriteColor: String? = null

        fun setId(id: Int): Builder {
            this.id = id
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setGrade(grade: Int): Builder {
            this.grade = grade
            return this
        }

        fun setAge(age: Int): Builder {
            this.age = age
            return this
        }

        fun setAddress(address: String): Builder {
            this.address = address
            return this
        }

        fun setFavoriteColor(favoriteColor: String): Builder {
            this.favoriteColor = favoriteColor
            return this
        }

        private fun apply(studentConfigJava: StudentConfigJustSeeSee) {
            studentConfigJava.address = this.address
            studentConfigJava.age = this.age
            studentConfigJava.favoriteColor = this.favoriteColor
            studentConfigJava.grade = this.grade
            studentConfigJava.id = this.id
            studentConfigJava.name = this.name
        }

        fun create(): StudentConfigJustSeeSee {
            val config = StudentConfigJustSeeSee()
            apply(config)
            return config
        }
    }

}