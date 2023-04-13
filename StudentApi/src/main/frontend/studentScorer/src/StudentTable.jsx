import { useEffect, useState } from "react";





function StudentTable() {
    useEffect(() => {
        fetch('http://localhost:8080/api/v2/students')
        .then((response) => {
            return response.json()
        })
        .then((data) => {
            console.log(data)
        })

    },[])
    return(
        <h2>Student Table</h2>
    )
}
export default StudentTable;