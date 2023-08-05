var content=document.querySelector('#name');
console.log(content);
function replaceName(){
    content.innerText= "Haily Den";
    console.log(content);
}
var requestSpan = document.querySelector("#requests");
var connectionSpan = document.querySelector("#connections");
function accept(id){
    var element=document.querySelector(id);
    element.remove();
    requestSpan.innerText-- ;
    connectionSpan.innerText++ ;
}
function ignore(id){
    var element=document.querySelector(id);
    element.remove();
    requestSpan.innerText-- ;

}


function remove2(){
    document.querySelector('#item2').remove();
}


