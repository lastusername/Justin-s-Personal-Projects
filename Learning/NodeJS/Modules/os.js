const os = require('os');

var totalMemory = os.totalmem();
var freeMemory = os.freemem();

//templatr string
//ES6 / ES2015 : ECMAScript 6 

console.log(`Free Memory:  ${freeMemory}`);
console.log(`Total Memory:  ${totalMemory}`);