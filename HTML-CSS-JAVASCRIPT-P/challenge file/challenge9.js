// let random = math.random()

let a = prompt("enter first number");
let b = prompt("enter operation ");
let c = prompt("enter second number ");
console.log(random);

let obj = {
    "+": "-",
    "*": "+",
    "-": "/",
    "/": "**",
}
if (random > 0.1) {
    //perform correct calculation 
    console.log(`the result is ${a} ${c} ${b}`);
    alert(`the result is ${eval(`${a} ${c} ${b}`)}`);
}
else {
    //perform wrong calculation
    c = obj[c]
    alert(`the result is ${eval(`${a} ${c} ${b}`)}`)
}