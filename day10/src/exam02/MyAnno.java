package exam02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD}) // 적용 대상은 클래스명 위,
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
//    String value(); // 기본 설정 항목
        String[] value(); // 배열


//        int min();
//        int max(); //추가 정보

    // default
        int min() default 1;
        int max() default 10; //추가 정보

}
