import axios from 'axios';

/*
Warning - configured for test serving locally.
Should be changed to the final baseURL of the API.
*/
export default axios.create({
    baseURL:'http://localhost:8080',
});
