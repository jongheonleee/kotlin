package book.part2.데이터타입

fun getStringLength(obj : Any) : Int? {
    // 에러 val strData : String = obj

    // is 연산자로 타입 확인
    if (obj is String) {
        // 명시적으로 타입을 변형하지 않아도 자동으로 형변환됨(스마트 캐스트)
        return obj.length
    }

    return null
}

fun getStringLength2(obj : Any) : Int? {
    if (obj !is String) return null
    return obj.length
}