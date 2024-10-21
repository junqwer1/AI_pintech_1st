package exam01;

public enum Transportation {
//    정적 상수 객체
    SUBWAY("지하철"){
    @Override
    public int getTotal(int person) {
        return 1400 * person;
    }
},
    BUS("버스"){
        @Override
        public int getTotal(int person) {
            return 1500 * person;
        }
    },
    TAXI("택시"){
        @Override
        public int getTotal(int person) {
            return 4500 * person;
        }
    };

    private final String title; //가급적 바뀌지 않게 final을 붙여준다(관례적), instance변수 정의 가능

    Transportation(String title) { // private
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract int getTotal(int person); //추상메서드
}
