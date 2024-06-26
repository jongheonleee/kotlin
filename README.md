# 🦸🏻‍♀️ kotlin(코틀린)

<br>
<br>

# 🎯 FP의 중요성

<br>

OOP가 각광받은 이유는 변경 사항이 많이 발생했고 이를 효율적으로 대처하기 위함
그 이후는 멀티 코어와 멀티 쓰레드 환경에서 서비스가 돌아가고 데이터가 증가하여 빅데이터 시대가 도래함. 따라서, 이 데이터를 처리하기 위해 FP가 각광 받음

함수형 프로그래밍이 중요한 이유, 바로 빅데이터다
멀티 쓰레딩 환경에서 함수형 프로그래밍이 각광 받음 
OOP의 경우 iv를 저장해서 공유함, 하지만 FP는 이를 지양함
FP에서 중요한 것은 두 가지
- 불변 : 변경되지 않는 것 
- 순수함수 : 외부에 영향 x

=> 그 이유는, 빅데이터 처리 과정에서 되돌리기 쉬워야함. 예를들어서, 빅데이터를 처리하는 과정에서 오류가 발생하면 해당 작업을 멈추고 작업 전 상태로 다시 되돌아가야함. 그래서 순수함수가 중요한 것임(비순수함수의 경우 되돌리기가 어려움)

<br>
<br>

# 📚 기본 개념 

<br>

## 📌 02. 코틀린 기초 프로그래밍


### 1. 코틀린의 파일 구조
> ### 👉 클래스 파일, 일반 파일(둘 다 확장자가 .kt)
- 둘의 차이는 없음
- 클래스 파일은 자바와 동일
- 파일은 클래스 변수, 함수 구성
- 코틀린 소스 -> 자바 소스 -> JVM 실행 

<br>

### 2. 이름 변경해서 임포트 가능
> ### 👉 import java.sql.Date as sqlDate
- SQL에서 사용하는 AS 처럼 별명 부여해서 그걸로 사용 가능 


<br>
<br>

## 📌 03. 코틀린과 객체지향 프로그래밍 

<br>

### 1. 변수 
> ### 👉 변수 선언 var(read & write), val(read-only)
- FP이기 때문에 불변이 중요함, 그래서 기본적으로 불변
  - 예를 들어서, 메서드의 매개변수는 변수 선언 x 이는 불변으로 선언하기 때문
- 타입과 값을 분리해서 선언함 
- val는 상수가 아님, 프로퍼티 .. 이 있음
  - const 를 통해 상수로 사용가능 

> ### 👉 기본적으로 null 값 사용 못함 
- ? 를 통해 nullable로 선언해줘야함 

<br>

### 2. 함수 
> ### 👉 fun으로 선언
- 함수의 매개변수는 무조건 val 적용
- 매개변수에는 기본 인수 이용할 수 있음 fun some(amount : Int = 10)

> ### 👉 중위 표현식(infix)
- 코틀린은 모든 것이 객체, 이 말은 . 찍어서 메서드를 호출하는 것과 같이 여러 기능을 사용할 수 있다를 의미함
- infix를 통해 함수를 중위 표현으로 나타낼 수 있음, 예를들어 obj infixFun 10(infix fun infixFun() {...})

> ### 👉 가변 인수(varag) 사용 가능 
- 가변인수(매개변수가 n개)를 포함하는 함수로 선언할 수 있음
- fun <T> varagsFun(a1 : Int, varag arr : T) { ... }

> ### 👉 재귀함수, 직접 구현하거나 tailrec 활용 
- tailrec 재귀함수, 코틀린 -> 자바 변형할 때 while(true)로 변형
  - StackOverFlowError 방지 

<br>

### 3. 기초 데이터 타입

> ### 👉Int, Double, Float, Long, Short, Byte, Char, Boolean, String, Any, Unit, Nothing
- 코틀린에서는 모든 것이 객체, 즉 변수를 사용하는 것 자체가 객체 사용하는 것 
- 기초 타입 없음 
- Any : 최상위 클래스, 자바의 Object, 모든 타입의 최고 조상 
- Unit : 함수의 반환 구문이 x, 자바에서 void 
- Nothing : 의미있는 데이터가 없음을 명시

<br>

### 4. 컬렉션 타입 

> ### 👉 Array/ List, Set, Map의 특징

<img src="https://github.com/jongheonleee/kotlin/assets/87258372/f5d5745a-c540-4575-83cc-bf26be3384ae" width="500" height="500"/>

- Array : 다양한 데이터 타입 추가 가능, 지네릭이나 각 타입별 배열로 한정할 수 있음
- Collection은 가변과 불변 클래스로 구분됨
- List : 순서 o, 중복 o
  - listOf(), mutableListOf()
- Set : 순서 x, 중복 x
  - setOf(), mutableSetOf()
- Map : 순서 x, 중복 x(값은 가능)
  - mapOf(), mutableMapOf()
- Array/ List, Set, Map 모두 Iterator 사용 가능 

<br>

### 5. if, when 표현식 

- 코틀린에선 if 문이 표현식, if문은 값으로 평가할 수 있음
  - 표현식 : 값을 만드는 문장, 구문 : 토큰들로 이루어짐, 명령을 지시하는 문장  
  - val res = if (a > 10) "good" else "bad"
  - if 문에 {} 여러 줄로 구성 -> 맨 마지막 줄이 값(데이터)

<br>

- when은 자바에서 switch 문과 유사
  - 분기 형태를 여러 가지로 구성 가능 
    - (1) 값으로 분기 
    - (2) 범위로 분기 
    - (3) 타입으로 분기
    - (4) 표현식으로 분기 


<br>

### 6. 반복문  

- 반복문, 여러 형태 지원
  - for (i in 1..10) {} / for(a in list) {}, for ((idx, val) in list.withIndex()) {}
  - for (i in 1 until 10 step 2) 
  - '@라벨이름', 바깥쪽 for 문 벗어남 


<br>

### 7. 연산자 및 연산자 재정의 

- 전개 연산자
  - *A : A 배열의 데이터 나열 
- 일치 연산자
  - 값 비교 : ==, !=
  - 객체 비교(참조값) : ===, !==
- 범위 연산자
  - A .. B : A에서 부터 B까지 
- 연산자 재정의 
  - 연산자에 대응하는 함수를 재정의, 클래스의 멤버로 정의할 수 있음, 확장 함수로 추가해서 사용 가능
  - operator 키워드 사용, 함수 앞에 추가 

<img src="https://github.com/jongheonleee/kotlin/assets/87258372/b41b19cf-1798-46c6-84ea-fb36d43b5ec4" width="500" height="500"/>
<img src="https://github.com/jongheonleee/kotlin/assets/87258372/89db5b32-7cec-43ac-bb22-98ce55ec33ce" width="500" height="500"/>


<br>

### 8. 클래스 
- 클래스 선언
- 주 생성자, 보조 생성자, this() 생성자 연결 

<br>

### 9. 프로퍼티 
- 프로퍼티, 사용자 정의 프로퍼티
- 주 생성자와 프로퍼티 
- 초기화 블록, null 허용 선언, 늦은 초기화. 초기화 미루기 
- 프로퍼티 값 변경 감지 

<br>

### 10. 상속 
- open, 오버라이드(override), 프러퍼티 오버라이드
- 생성자 간의 관계(2)


## 📌 04. 코틀린과 함수형 프로그래밍 

## 📌 05. 코틀린의 다양한 기법 활용

