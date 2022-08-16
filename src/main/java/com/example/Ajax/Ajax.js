function restcall(){
    let httpRequest=new XMLHttpRequest();
    httpRequest.open("Get","http://localhost:8080/api/call");
    httpRequest.send();
    httpRequest.onload=function(){
        alert(httpRequest.responseText);
        
    }
    console.log("from the .js file");
}
