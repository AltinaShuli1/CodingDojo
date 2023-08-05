function logOut(element){
    if(element.innerText=="LogIn"){
        element.innerText="LogOut";
    }
    else{
        element.innerText="LogIn";
    }
}       
function removeButton(element){
    element.remove();
}