// 1. 아메리카노 주문 버튼 태그 만들고 누르면 주문완료로 바뀌는 버튼 만들기

// 2. 배경색이 하늘색 버튼 태그 만들고 누르면 핑크색으로 바뀌는 버튼 만들기

// const btn1 = document.createElement("button");
// btn1.classList.add("btn1");
// btn1.innerText = "아메리카노";
// btn1.style.backgroundColor = "skyblue";

// btn1.addEventListener("click", () => {
//     btn1.style.backgroundColor = "pink";
//     btn1.innerText = "주문완료!";
// })

// document.body.appendChild(btn1);

// 버튼 다른색 5개 만들고 버튼내용은 색깔 이름 넣어야함
// 버튼을 누르면
// 아래에 박스의 색깔이 바뀌어야함

const main = document.createElement("main");
const box = document.createElement("div");
box.classList.add("box");

["red", "blue", "black", "green", "yellow"]
  .forEach((v) => {
    const button = document.createElement("button");
    button.classList.add("box");
    button.innerText = v;
    button.style.backgroundColor = v;
    button.addEventListener("click", () => {
      box.style.backgroundColor = v;
    });
    document.body.appendChild(button);
  });

  [
    { name: "네모", radius: "0px" }, { name: "둥글게", radius: "9999px" }
  ].forEach((x) => {
    const button = document.createElement("button");
    button.classList.add("box");
    button.innerText = x.name;
    button.addEventListener("click", () => {
      box.style.borderRadius = x.radius;
    });
    document.body.appendChild(button);
  });

document.body.appendChild(box);


// 버튼 두개 추가 [네모], [둥글게]
