console.log("welcome in alone world")

let a = 1;
for (let i = 0; i <= 99; i++) {
    console.log(a + i);
}

let obj = {
    name: "alone",
    role: "coder",
    company: "ai image generator"
}
for (const key in obj) {
    const element = obj[key]
    console.log(key, element)

}
for (const c of "ALONE") {
    console.log(c)
}

let s = 7;

while (s <= 7) {
    console.log(s);
    s++;
}

let l = 7;
do {
    console.log(l);
    l++;
} while (l < 5)
