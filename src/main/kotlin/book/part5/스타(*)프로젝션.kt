package book.part5

// 스타 프로젝션 : 현재 "제네릭 타입을 모른다"를 의미, 추후에는 정확한 타입 이용
    // <*> 사용

// <Any?> 와 <*>의 차이점
    // 스타 프로젝션은 <Any?>와 차이가 있음
    // <Any?>는 정확한 타입 명시, <*>는 타입을 모른다는 것

// <Any?>
    // 정확한 타입을 명시한 것, MutableList<Any?>로 서언한 곳에 같은 타입의 데이터를 대입한 것

// <*>
    // 타입을 모름, 나중에 지정되는 타입을 따르겠다는 의미
    // <out Any?>와 같음

