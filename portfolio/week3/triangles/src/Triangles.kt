// COMP2850 Portfolio: Week 3
// Exception Handling for invalid triangles
import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean {
    val (a,b,c)= triangle
    return a < b + c && b < a + c && c < a+b
}

fun triangleArea(triangle: Triangle): Double { 
    val (a, b, c) = triangle
    if(!isValidTriangle(triangle)) {
        throw IllegalArgumentException("Invalid triangle side lengths")
    }
    val s=(a+b+c)/2.0
    return sqrt(s* (s-a)* (s-b)* (s-c)) 
}