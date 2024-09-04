
const EventEmitter = require('events');
const emitter = new EventEmitter();

//Register a listener
emitter.on("messageLogged", (eventArg) => { //e, eventArg, arg are other naming options
    console.log('Listener called', eventArg);
});

const log = require("../Lesson_1/logger.js");
log("message");





emitter.on("logging", (arg)=> {
    console.log('logging...', arg);
});
// Emit means making a noise or producting - singaling that an event occured
// we need a listener, it is a functeion that is called when the function is raised (emit)

emitter.emit("logging", {data: 'Message'})

// Rasie: logging (data: message)