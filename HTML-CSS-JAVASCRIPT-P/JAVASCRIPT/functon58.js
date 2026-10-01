function nice(name) {
    console.log("hey " + name + " your world is nice")
    console.log("hey " + name + " your world is good")
    console.log("hey " + name + " your name is nice")
    console.log("hey " + name + " you are a bad guy ")

}
nice("alone")

function sum(a, b) {
    console.log(a + b)


}
sum(40, 54)

function sum(s, h, c = 7) {
    return s + h + c
}
result1 = sum(9, 23)
result2 = sum(9, 3)
result3 = sum(9, 24)

console.log("the sum of the these numbers is :", result1)
console.log("the sum of the these numbers is :", result2)
console.log("the sum of the these numbers is :", result3)