let rand = Math.random()
let first , second , thired;
if(rand<0.33){
    first = "crazy"

}
else if (rand<0.66 && rand>=0.33){
    first = "Amazing"
}
else{

        first ="fire"
    }
    if(rand<0.33){
    second = "engine"

}
else if (rand<0.66 && rand>=0.33){
    second = "foods"
}
else{

        second ="garments"
    }
if(rand<0.66){
    thired = "bros"

}
else if (rand<0.66 && rand>=0.33){
    thired = "limited"
}
else{

        thired ="hub"
    }

console.log(`${first} ${second} ${thired}` )