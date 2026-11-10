fun median(numbers: List<Float>): Float {
    require(numbers.isNotEmpty()) { "Cannot calculate the median of an empty list." }
    
    val sorted = numbers.sorted()
    val middle = sorted.size / 2
    
    return if (sorted.size % 2 == 0) {
        (sorted[middle - 1] + sorted[middle]) / 2.0f
    } else {
        sorted[middle]
    }
}