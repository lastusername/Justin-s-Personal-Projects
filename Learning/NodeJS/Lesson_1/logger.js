var url ="http://mylogger.com/log" ;

function log1(message) {

    console.log(message);
}
function log2() {
    console.log("Message from node");

}

module.exports.log = {
    log1,
    log2
}