//define state
import {useState} from 'react'
function Profile() {
    const [loggedIn,setLoggedIn]=useState(1)

   // const [loggedIn,setLoggedIn]=useState(false)
   /*
    if (loggedIn)
   {
    return (
        <div>
            <h1>Welcome Gudiya</h1>
        </div>
    )
    }
   else {
    return (
        <div>
            <h1>Welcome Guest</h1>
        </div>
    )
    }
   */
    //1,2,3
    return (
        <div>
            {/*if else condition */}
{loggedIn?<h1>Welcome Gudiya</h1>:<h1>Welcome Guest</h1>}
        
            {/*if else if  */}
     {loggedIn==1?<h1>Welcome User 1</h1>:loggedIn==2?<h1>Welcome User2</h1>:<h1>Welcome User</h1>}       
        </div>
    )
}
export default Profile;