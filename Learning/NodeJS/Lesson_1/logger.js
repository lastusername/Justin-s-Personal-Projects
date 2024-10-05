const EventEmitter = require('events');
const emitter = new EventEmitter();

var url ="http://mylogger.com/log" ;

function log1(message) {
    //send an HTTP request
    console.log(message);

    //raise an event
    emitter.emit("messageLogged", {id: 1, url: 'http://'});
}
function log2() {
    console.log("Message from node");
}

module.exports.log = {
    log1,
    log2
}