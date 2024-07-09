package Assignment_2_class

interface Draw {
    fun draw()
}

class Square(private val side: Double) : Draw {
    override fun draw() {
        println("Square with side length: $side")
        println("Area: ${area()}")
        println("Perimeter: ${perimeter()}")
    }

    fun area(): Double {
        return side * side
    }

    fun perimeter(): Double {
        return 4 * side
    }
}

class Triangle(private val base: Double, private val height: Double, private val side1: Double, private val side2: Double, private val side3: Double) : Draw {
    override fun draw() {
        println("Triangle with base: $base, height: $height, and sides: $side1, $side2, $side3")
        println("Area: ${area()}")
        println("Perimeter: ${perimeter()}")
    }

    fun area(): Double {
        return 0.5 * base * height
    }

    fun perimeter(): Double {
        return side1 + side2 + side3
    }
}

fun main() {
    val shapes: List<Draw> = listOf(Square(4.0), Triangle(3.0, 4.0, 3.0, 4.0, 5.0))
    for (shape in shapes) {
        shape.draw()
        println()
    }
}
