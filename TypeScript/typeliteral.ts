type angryDepth = 1 | 2 | 3 | 4 | 5;
const d1: angryDepth = 5;

type jobType = "전사" | "마법사" | "궁수" | "도적";

const d2: {id: string, level: number, job: jobType} = {
    id: "지존법사령이",
    level: 155,
    job: "도적"
};


type hamburger = "불고기버거" | "새우버거" | "치즈버거" | "빅맥" | "상하이버거";
type Side = "감자튀김" | "치즈스틱" | "콘솔로우" | "해쉬브라운";
type Drinks = "제로콜라" | "콜라" | "환타" | "물" | "스프라이트" | "제로 스프라이트";

type SetMenu = {
    main: hamburger,
    side: Side,
    drinks: Drinks
};

const myMacdonald: SetMenu = {
    main:"불고기버거",
    side:"감자튀김",
    drinks:"콜라"
};

type Bread = "허니오트" | "하티" | "위트" | "파마산 오레가노" | "화이트";
type Main = "안창" | "페퍼로니" | "살라미" | "햄" | "스테이크" | "스파이시 쉬림프";
type Vegita = "양상추" | "토마토" | "오이" | "피망" | "양파" | "피클";
type Cheese = "아메리칸 치즈" | "슈레드 치즈" | "모짜렐라 치즈";
type Sauce = "랜치" | "스위트 어니언" | "마요네즈" | "스위트 칠리";



// type subway = 빵,메인,치즈,야채,소스1,소스2
type subway = {
    bread: Bread,
    main: Main,
    cheese: Cheese,
    vegita: Vegita[],
    sauce: Sauce[]
}

const mysub: subway = {
    bread:"위트",
    main:"살라미",
    cheese:"모짜렐라 치즈",
    vegita:["양상추","양파"],
    sauce:["랜치","스위트 어니언"]
};