function Student(props) {
    return (
        <div style={{backgroundColor:"skyblue", margin: 10}}>

            <h1>Student Component</h1>
            <h2>Name:{props.name}</h2>
        <h3>Email:{props.email}</h3>
            <h4>Address{props.other.address}</h4>
        </div>
    )
}
export default Student;