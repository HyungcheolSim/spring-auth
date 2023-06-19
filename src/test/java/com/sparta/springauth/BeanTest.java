package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    //해결방법 1
    @Autowired
    Food pizza;//같은 타입의 bean 객체가 2개이기 때문에 자동으로 안됨
    @Autowired
    Food chicken; //autowired는 food의 type으로 찾지만 동일한 빈이 여러개일 경우 bean의 이름으로 찾는다.

    @Autowired
    @Qualifier("pizza")
    Food food;


    @Test
    @DisplayName("Primary와 Qualifier 우선순위 확인->qualifier")
    //즉 범용적으로 사용되는 bean 객체에는 primary, 지역적으로 사용되는 bean 객체에는 qualifier를 통해 지정할 수 있다.
    void test1(){
        pizza.eat();
        chicken.eat();
        food.eat();
    }

}
