//create cookie

document.cookie = "username=Ajay Kannan ; max-age="+ 30*24*60*60;

function setCookie(name, ageInDays) {
    document.cookie = "username="+name+"max-age="+ageInDays*24*60*60;
}

//read cookie

function displayCookie() {
    var cookies = document.cookie;
    document.write(cookies);

    cookieArray = cookies.split(";");

    for(var i=0 ; i<cookieArray.length ; i++) {
        document.write("Key is"+ cookieArray[i].split("=")[0] + "value is" + cookieArray[i].split("=")[1]);
    }
}



