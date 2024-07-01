package book.part5

// null 안전성 : NPE를 벗어나는 것이 목표
    // nullable : null 허용
    // non-nullable : null 불허

// 프로퍼티 타입 뒤에 ? 추가하면 null 대입가능
// '?.' : if-else 문이 내부에 들어감, 만약 null인 경우 null 반환


// '?:' : 만약 null인 경우 지정된 값을 반환

// '!!' : null이면 예외 발생(NPE)

// 'as?' : as는 형변환, ClassCastException이 발생할 때 null을 반환
