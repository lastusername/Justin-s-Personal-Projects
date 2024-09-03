
const EventEmitter = require('events');
const emitter = new EventEmitter();

//Register a listener
emitter.on("messageLogged", function(){
    console.log('Listener called');
});

//raise an event
emitter.emit("messageLogged");

// Emit means making a noise or producting - singaling that an event occured
// we need a listener, it is a function that is called when the function is raised (emit)