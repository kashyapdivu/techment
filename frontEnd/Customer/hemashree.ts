let var1 : number;
let str : String;
var1 =2.0;

let arr1 = [1,2];
let a1 : String[];
a1 = ["2","Hello",'3'];

console.log(a1[0]);
for(let i =0;i<a1.length;i++){
    console.log(a1[i]);
}


for(let list in a1){
    console.log(list);
}

let tuple :["apple",'hello',1,2,3,4,3.44,true];
// console.log(tuple[0]);
console.log("************************");
// for(let i=0 ; i<tuple.length ;i++){
//     console.log(tuple[i]);
// }