package OOP.getSet_4_1

class Dog {
    var name = ""
        get() {
            return field.toLowerCase().capitalize()
        }

    var age = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }


    var weight = 0f
        set(value) {
            if (value >= 0) {
                field = value
            }
        }


}