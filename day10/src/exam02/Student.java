package exam02;

//@MyAnno(value = "클래스!")
/*@MyAnno({"여기는 클래스!", "여기는 Student 클래스!"})
public class Student {*/

//    @MyAnno(value = "여기는 메서드!")
/*    @MyAnno({"여기는 메서드!"})
    public void study() {

    }
}*/

//배열
@MyAnno(value = {"여기는 클래스!", "여기는 Student 클래스!"}, min=10,max = 100)
//기본값
//@MyAnno(value = "클래스!")
public class Student {

    //배열
//    @MyAnno(value = {"여기는 메서드!"}, min = 1, max = 10)
    //default
    @MyAnno(value = "여기는 메서드!")
        public void study() {

    }
}