function validate_form() {

    var name = document.getElementById("uname").value;
    var email = document.getElementById("mail").value;

    var name_val = /^[a-zA-Z]*$/;
    var mail_val = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

    document.write("<h1> Registration Details </h1>");

    if(name_val.test(name)) {
        document.write("<h1>"+name+"</h1>");
    }
        
    else  {
        window.alert("Username format incorrect");
    }
        
    

    if(mail_val.test(email)) {
        document.write("<h1>"+email+"</h1>");
    }
        
    
    else {
        window.alert("Mail format incorrect");
    }
        
    
    
}