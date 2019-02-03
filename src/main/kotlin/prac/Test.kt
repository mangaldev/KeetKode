fun main(vararg args: String) {
    var r1: Rectangle = Rectangle(3, 4)
    println(r1.isSquare)
    r1 = Rectangle(4, 4)
    println(r1.isSquare)
}

class Rectangle(val height: Int, val width: Int) {
    var isSquare: Boolean
        get() = height == width
        set(value) {isSquare = value}
}