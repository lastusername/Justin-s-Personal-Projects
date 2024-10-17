let alpha = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
let newAlpha = []

let Valid = true
while(Valid) {
    try {
        x = prompt("hello User, what do you want your offset to be? (choose a offset 1-26")
        if (x > -1 && x < 27) { 
            Valid = false
        }
        else {
            console.log("You made an error, try again")
        }
    }catch{
console.log("you made an error")
    }
}
let StartPnt = x
let StartPntCopy = x
let z = 25 - StartPnt

for (let e; StartPnt <= 25; StartPnt++) {
 newAlpha += alpha[StartPnt]
}
console.log("hi")
for (let i = 0; i <= StartPntCopy-1; i++) {
 newAlpha += alpha[i]
}

console.log(newAlpha)
text = prompt("Please insert the text you want to encrypt")

let splitText = text.split("")
let lenOfTxt = text.length

for (let position = 0; position <= lenOfTxt; position++) { //looping for every letter in the input
    for (let k = 0; k < lenOfTxt || splitText[position] === newAlpha[k]; k++){ //comparing the value of the position new alphabet, with the value of the position in the input
        if (splitText[position] === newAlpha[k]) { 
        console.log(newAlpha[k]) //print
        k = lenOfTxt + 1 //breaks the for loop
        }
        else {
            e = 0
        }
    }
}