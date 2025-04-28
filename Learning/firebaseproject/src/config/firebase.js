import { initializeApp } from "firebase/app";
import {getAuth} from 'firerbase/auth';
const firebaseConfig = {
  apiKey: "AIzaSyB-mctoUqbCLBzjMz3iCB1TIyG4-kxe_2c",
  authDomain: "fir-testing-8ff04.firebaseapp.com",
  projectId: "fir-testing-8ff04",
  storageBucket: "fir-testing-8ff04.firebasestorage.app",
  messagingSenderId: "804467676252",
  appId: "1:804467676252:web:6d6345679c41811ec10299",
  measurementId: "G-V26BY8QED0"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
export const auth = getAuth(app)

