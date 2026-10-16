// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle) Boolean {
    val (a,b,c)= Triangle
    return a < b + c && b < a + c && < a+b
}

fun triangleArea(triangle: Triangle): Double { 
    val (a, b, c) = triangle
    if(!isValidTriangle(triangle)) return 0.0
    val s = (a+b+c) /2.0
    return sqrts(s* (s-a) * (s-b) * (s-c)) 
}