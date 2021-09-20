var arr = [11, 22, 33, 44];
for (let i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}

console.log(".......................");

var arr2 = ["kirti", "kajal", "ram"];
for (let i = 0; i < arr2.length; i++) {
    console.log(arr2[i]);
}

console.log(".......................");

let person = [{
        fname: "katya",
        lname: "sahu",
        dept: "developer",
        age : 30
    },
    {
        fname: "rani",
        lname: "sahu",
        dept: "hr",
        age : 33
    }
]



let person2 = {
    fname: "vv",
    lname: "awasthi",
    dept: "hr",
    age: 22
}
person.push(person2);

person.push({
    fname: "rahul",
    lname: "singh",
    dept: "hr"
});

console.log("........push.........");
for (key of person) {
    console.log(key);
}

person.pop();

console.log("........pop.........");

for (key of person) {
    console.log(key);
}

let arr3 = [4, 5, 6, 2, 9];
//console.log("......sort.....");
//console.log(arr3.sort());

arr4 = arr3.filter(function(value) {
    return value > 5;
})
console.log("......filter.....");
console.log(arr4);

let arr5 = person.filter((key) => {
    return key.dept == "hr";
})
console.log(arr5);

let AnotherPerson = person.sort((x,y)=>{
    return x.fname.localeCompare(y.fname);
});

console.log("............sort by fname..........");

for(const key of AnotherPerson){
    console.log(key);
}

// for(const key of AnotherPerson){
//     console.log(key);
// }


console.log("............sort by age..........");

let fil =  person.filter((key)=>{
    return key.age > 25 && key.age <40;
})


for(const key of fil){
    console.log(key);
}















