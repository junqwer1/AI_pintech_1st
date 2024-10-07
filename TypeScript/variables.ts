const a = "아메리카노";
const a1 = "라떼";

// 타입 어노테이션
const a2:string = "123";
const a3:boolean = !!"";
const a4:number[] = [1,2,3,4,5];
const a5:string[] = ["fdsaf","fsdf","fsda"];
const a6:{
    name: string;
    price: number;
}[] = [
    {name:"dfsa", price: 3123}, 
    {name:"dfsa", price: 3123}, 
    {name:"dfsa", price: 3123}
];


// age, isMan, nation [];
const obar :{
    age:number;
    isMan: boolean;
    nation: string;
}[] = [
    {age: 20, isMan: true, nation: "korea"},
    {age: 20, isMan: false, nation: "japan"},
    {age: 20, isMan: true, nation: "korea"},
    {age: 20, isMan: false, nation: "japan"},
]