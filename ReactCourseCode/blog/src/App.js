import logo from './logo.svg';
import './App.css';
import React,{useState} from 'react'
import Profile from './Profile'
import User2 from './User2'
import Members from './Members'

function App() {
//Pass function as Props
  function getData1()
  {
    alert("Hello from app")
  }



  //Form method
  const [name, setName] = useState("");
  const [tnc, setTnc] = useState(false);
  const[interest,setInterest]=useState("")

  function getFormData(e) {

    console.warn(name,tnc,interest)
    e.preventDefault()
  }

//Hide and Show Element
  const[status,setStatus]=React.useState(true)
  
  
  
  // Get input box value
const [data,setData]=useState(null)
const [print,setPrint]=useState(false)

  function getData(val)
  {
    console.warn(val.target.value)
    setData(val.target.value)
   setPrint(false)
  }


  return (
    <div className="App">
      {
        print ?
          <h1>{data}</h1>
          : null
      }
      <input type="text" onChange={getData} />
    
      <button onClick={() => setPrint(true)}>Get Value</button>
    
      <div className="App">
        {
         status? <h1>Hello World !</h1>:null
        }
        {/*
        <button onClick={()=>setStatus(false)}>Hide</button>
        <button onClick={()=>setStatus(true)}>Show</button>*/}
              <button onClick={()=>setStatus(!status)}>Toggle</button> 
  
      </div>


      {/*Creating form */}
      
      <div className="App">
        <h1>Handle Form in React</h1>
        <form onSubmit={getFormData}>
          <input type="text" placeholder="Enter name" onChange={(e)=>setName(e.target.value)}/><br /><br />
          <select onChange={(e)=>setInterest(e.target.value)}>
            <option>Select Options</option>
            <option>React</option>
            <option>JavaScript</option>
          </select><br/><br/>
          <input type="checkbox" onChange={(e)=>setTnc(e.target.checked)}/> <span>Accept Terms and condtions</span><br /><br />
       <button type="submit">Submit</button>   
     </form>
      </div>

      
      {/*Conditional rendering */}
      {/*Conditional rendering */}
      <div className="App">
        <Profile />
      </div>
      {/*Pass function as Props */}
      <div className="App">
        <User2 data={getData1} />
        <div style={{ float: "right" }}>
          <Members data={getData1} />
          </div>
</div>
    </div>
  );
}
export default App;



/*
import React from 'react'
import logo from './logo.svg';
import './App.css';
import Student1 from './Student1'
class App extends React.Component{
  
  constructor() {
    super();
    this.state = {
      name:"Gudiya"
    }
  }
  render() {
    
    return (
      <div className="App">
        <h1>Props !</h1>
        <Student1 name={this.state.name} email="gudi@gmail.com"></Student1>
        <button onClick={()=>this.setState({name:"Gudi"})}>Update Name</button>
      </div>
    );
  }
}
export default App;


/*
import React, { useState } from 'react'
import logo from './logo.svg';
import './App.css';
 import Student from './Student'
function App() {
const [name,setName]=useState("Gudi")

  return (
    <div className="App">
      <h1>Pros in React :)</h1>
      <Student name={name} email="gudi@1gmail.com" other={{address:'Hyderabad', mobile:"000"}}/>
      <Student name={"peter"} email="peter@gmail.com" other={{address:'Hyderabad', mobile:"111"}}/>
      <Student name={"Somu"} email="sm@gmail.com" other={{address:'Hyderabad', mobile:"222"}}/>
<button onClick={()=>{setName("Gudiya")}}>Update Name</button>
      
    </div>
  );
}
export default App;

/*
import React, { Component } from 'react'
// State in Class Component
class App extends Component{
//using constructor
  constructor() {
    super();
    this.state = {
   //   data: "Gudiya"
    data:1
    }
  }

  apple()
  {
  //  this.setState({ data: "Gudi" })
  this.setState({data:this.state.data+1})
  }

  render() {return (
     <div className="App1">
      <h1>{this.state.data}</h1>
    <button onClick={()=>this.apple()}>Update Data</button> 
    </div>
 
   )
 }}
export default App;

/*

import { Component, useState } from 'react'
import logo from './logo.svg';
import './App.css';
import User from './User'

import User1 from './User1'
import JsxUser from './JsxUser'

function App() {
  
  //using state in functional component
const [data,setData]=useState("Gudiya")

  // for update data
  function updateData() {
    //setData("Good Morning Gudiya !")
  setData(data+1)
  }
  
  // let data="Gudiya kumari"
  function Apple1() {
    data = "Gudi";
    alert(data);
  }

  function Apple() {
  return (<div>Apple component</div>)
  }
  

  
  //function updateData() {
    //data = "Gudi";
    //alert(data);
 // }


 console.warn("_________________");

  

  
  
  return (
    <div className="App">
      <h1>Hello world!</h1>
      <User />
      <User1 />
      <Apple />
      {Apple()}
      <h1>JSX !</h1>
      <JsxUser />
      <h1>{ data}</h1>
      
      <button onClick={() => Apple1()/*alert("Hello")*//*Apple1*/ //}>Click me</button>      
     // <h1>{data}</h1>

   //   <button onClick={updateData}>Update Data</button>

   // </div>
  //);
//}

//export default App;
//*/