import {auth} from "../config/firebase"
import {createUserWithEmailAndPassword} from "firebase/auth";

function Auth() {
    const [email, setEmail] = useSate("");
    const [password, setPassword] = useSate("");

function signIn() {

};
    return (
        <div>
            <input placeholder="Email.." 
                    onchange={(e) => setEmail(e.target.value)}
                        />
            <input placeholder="password.."
            onchange={(e) => setPassword(e.target.value)}
            />
           
       
        <button onClick={signIn}>Sign In</button>
        </div>

    )
}

export default Auth;