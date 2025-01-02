package com.green.greengramver6.feed.like.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
/*
    immutable하게 객체를 만들고 싶다. 그러면 setter를 빼야함. -> 객체 생성 이후에 값 변경 불가능하게 하기 위해
    private한 멤버필드에 값 넣는 방법 2가지 (생성자, setter)
    setter를 빼기로 했기 때문에 남은 선택지는 생성자만 남았다.
    생성자를 이용해서 객체 생성을 해야 하는데 멤버필드 값을 세팅하는
    경우의 수가 많을 수 있다.
 */
@Getter
@EqualsAndHashCode
public class FeedLikeVo {
    private long feedId;
    private long userId;
    private String createdAt;

    //오버라이딩은 부모가 가지고 있는 메소드 선언부 똑같이 적어야 함.

    //오버로딩
}
