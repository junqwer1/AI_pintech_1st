const menubtn = document.getElementById("menu-btn");
const sidebar = document.getElementById("side-bar");
const overlay = document.getElementById("overlay");
const infos = document.getElementsByClassName("info");

menubtn.addEventListener("click",handleClick);

function handleClick(){
    sidebar.classList.remove("hidden");
    overlay.classList.remove("hidden");
}

overlay.addEventListener("click", function (e){
    console.log(e.target);

    sidebar.classList.add("hidden");
    overlay.classList.add("hidden");
})

function mouseon(index){
    for(i = 0; i < infos.length; i++){
        if(i==index){
            infos[i].classList.remove("hidden");
        }
    }
}

function mouseoff(index){
    for(i = 0; i < infos.length; i++){
        if(i==index){
            infos[i].classList.add("hidden");
        }
    }
}