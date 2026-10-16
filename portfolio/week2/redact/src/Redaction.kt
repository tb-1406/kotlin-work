// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

 fun redact(document: String, textToRedact: String, char: Char = 'X'): String {
    val replacement = char.toString().repeat(textToRedact.length)
    return document.replace(textToRedact, replacement)
 }