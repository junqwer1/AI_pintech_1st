const content = document.getElementById("content");
const lists = document.getElementsByClassName("list");
const click = document.getElementById("click");

click.addEventListener("click",function handleClick(){
    click.classList.add("hidden");
})


function mouseon(){
    for(i = 0; i < lists.length; i++){
        lists[i].classList.remove("hidden");
    }
}