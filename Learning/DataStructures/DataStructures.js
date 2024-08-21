function getSum() { 
    let sumOfThree
}
function getName(){
    let FrsNm = readLine("First, give me your first and last name.");
    let lasNm = readLine("great!, now give me your last name!");
    const fulNm = [FrsNm, lasNm];
    return fulNm;
}

console.log("Hello User! We'll be practicing creating data structures.");
let fulNam = getName();
console.log(fulNam);
console.log("We just created the first and most basic sort of data structures: the Array!");
