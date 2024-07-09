package Assignment_2_class



fun main() {

    val shapes: List<Shape> = listOf(

        Rectangle(4.0, 5.0),

        Circle(3.0)

    )



    for (shape in shapes) {

        println("Area: ${shape.area()}")

        when (shape) {

            is Rectangle -> println("Perimeter: ${shape.perimeter()}")

            is Circle -> println("Perimeter: ${shape.perimeter()}")

        }

    }

}

abstract class Shape {

    abstract fun area(): Double

}

class Rectangle(private val width: Double, private val height: Double) : Shape() {

    override fun area(): Double {

        return width * height

    }



    fun perimeter(): Double {

        return 2 * (width + height)

    }

}

class Circle(private val radius: Double) : Shape() {

    override fun area(): Double {

        return Math.PI * radius * radius

    }

    fun perimeter(): Double {

        return 2 * Math.PI * radius

    }

}
