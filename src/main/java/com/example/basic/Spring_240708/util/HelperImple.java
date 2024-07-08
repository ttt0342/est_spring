package com.example.basic.Spring_240708.util;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
// 우선순위로 클래스를 지정한다.(의존성)
// 의존성의 순서를 모를 때 우선순위를 지정한다. @Qualifier 는 의존성을 지정한다.
@Component
public class HelperImple extends Helper{
}
