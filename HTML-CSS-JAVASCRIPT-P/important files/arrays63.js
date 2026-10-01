// let arr = [1,2,3,4,5];

// console.log(arr.length)


// let name =["sachin" , "ajay ", "mogalaji" , "omkar" ]
// console.log(name);

// name.pop();
// console.log(name);

// name.push = "akash";
// console.log(name)

// name.shift();
// console.log(name);
//  name.unshift("rhaul");
//  console.log(name);

//  let arra = [21,22,23,33]
//  console.log(arra.toString())
//  console.log(arr.join(" and "))

//  let array = [1,2,3,4,5,6];
//  console.log(array);
//  delete array [4];
//  console.log(array)

//  console.log(array.concat(arra))

//  let numbers = [1,2,3,4,5,6,7,8]
//  console.log(numbers)
// console.log(numbers.slice(1,3,101))
// console.log(numbers)


let arr=[1,2,3,4,5,11] ; 
// let newArr=[]
// for(let index=0; index<arr.length; index++)
// {
//     const element = arr [index];
//     newArr.push(element**2)
// }
// console.log(newArr);

let newArr = arr.map((e)=>{
    return e**2
})
console.log(newArr);
const greterThanSeven =(e)=>{
    if(e>7){
        return true
    }
    return false
}
console.log (newArr.filter(greterThanSeven))

