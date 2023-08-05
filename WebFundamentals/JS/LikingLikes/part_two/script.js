var likes=[9,12,9];
var spans = [
    document.querySelector("#first_profile"),
    document.querySelector("#second_profile"),
    document.querySelector("#third_profile"),
]
console.log(spans);
function increase(id){
    likes[id]++;
    spans[id].innerHTML= likes[id] + "like(s)";
}
