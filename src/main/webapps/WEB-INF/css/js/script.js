function welcome(){

    alert("Welcome to Hostel Management System");
}

function validateLogin(){

    let username=document.getElementsByName("username")[0].value;

    let password=document.getElementsByName("password")[0].value;

    if(username=="" || password==""){

        alert("Please enter Username and Password");

        return false;
    }

    return true;
}
