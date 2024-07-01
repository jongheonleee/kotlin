package book.part5

// 확장 구문은 크게 2군데에 작성가능
    // 1. 파일의 최상위 레벨 작성
        // 같은 파일에서 사용하는 것은 문제 없음, 외부 파일에서 이용할 때는 별도로 import 받아서 사용해야함
        // 즉, 확장한 함수나 프로퍼티를 별도로 임포트해서 사용
    // 2. 특정 클래스 내에 작성
        // 특정 클래스 내부에 작성함
            // 확장 대상 : 익스텐션 리시버
            // 확장 구문이 작성된 클래스 : 디스패치 리시버

        // 디스패치 리시버 내에 선언된 익스텐션 리시버의 확장 함수는 디스패치 리시버와 익스텐션 리시버 내의 함수에 모두 접근 가능
