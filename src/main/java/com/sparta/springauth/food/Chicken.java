package com.sparta.springauth.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//동일한 빈 객체가 여러개일 경우 primary를 붙인 걸 우선적으로 생각한다.
public class Chicken implements Food{
    @Override
    public void eat(){
        System.out.println("치킨을 먹습니다.");
    }
}
