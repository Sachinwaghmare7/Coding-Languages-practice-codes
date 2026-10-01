console.log("welcome in alone world");
console.log("hey i am a conditional statement");

let age = 0;
// let grace = 2;

// age += grace

// console.log(age + grace);
// console.log(age * grace);
// console.log(age / grace);
// console.log(age ** grace);



if (age > 18) {
    console.log("you can drive");
}
else if (age == 0) {
    console.log("are you kidding");
}
else {
    console.log("you cannot drive");
}


let a = 5;
let b = 7;

let c = a > b ? (a - b) : (b - a);
console.log(c)

/*translate to :
if (a > b) {
   let c = (a - b);
   console.log(c)
}
else {
   let c = (b - a);
   console.log(c)
}*/
