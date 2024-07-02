# 🦸🏻‍♀️ kotlin(코틀린)

<br>
<br>

# 🎯 공부하기 앞서서, FP의 중요성

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


### 📋 목차
> ### 📌 01. 코틀린 기초 프로그래밍 : FP 특성(불변, 순수함수)을 살리려고 노력, 자바보다 유연함
> ### 📌 02. 코틀린과 객체지향 프로그래밍 : 
> ### 📌 03. 코틀린과 함수형 프로그래밍 : 
> ### 📌 04. 코틀린의 다양한 기법 : 

<br>

## 📌 01. 코틀린 기초 프로그래밍 : FP 특성(불변, 순수함수)을 살리려고 노력, 자바보다 유연함 

### 1. 코틀린 기본 작성법 : 파일과 클래스 둘 다 가능, 자바보다 유연함 

> ### 👉 클래스 파일, 일반 파일(둘 다 확장자가 .kt)
- 둘의 차이는 없음
- 클래스 파일은 자바와 동일
- 파일은 클래스 변수, 함수 구성
- 코틀린 소스 -> 자바 소스 -> JVM 실행 

<br>

> ### 👉 이름 변경해서 임포트 가능
- import java.sql.Date as sqlDate
- SQL에서 사용하는 AS 처럼 별명 부여해서 그걸로 사용 가능 

<br>

### 2. 변수와 함수 : 불변과 순수함수를 처리하기 위해 노력 

> ### 👉 변수 선언 var(read & write), val(read-only)
- FP이기 때문에 불변이 중요함, 그래서 기본적으로 불변
  - 예를 들어서, 메서드의 매개변수는 변수 선언 x 이는 불변으로 선언하기 때문
- 타입과 값을 분리해서 선언함
  - 코틀린에서는 타입 추론 가능함, 즉 타입을 선언부에 명시하지 않아도 값을 통해 해당 변수의 타입을 유추함 
- val는 상수가 아님, 프로퍼티 .. 이 있음, 즉 프로퍼티를 어떻게 설정하느냐에 따라 보여질 데이터 형식이 달라질 수 있음 
  - 프로퍼티란? 특정 값에 getter/setter와 같은 특수 메서드들이 제공되는 형태, 즉 '데이터 + 함수'
  - const 를 통해 상수로 사용가능

<br>

> ### 👉 변수는 자동으로 초기화되지 않음, 코드에서 직접 초기화해야함 
- 코틀린에서는 자동으로 초기화하지 않음
- 최상위 레벨/클래스의 멤버 변수 -> 선언과 동시에 초기화 
  - 타입 추론이 가능하려면, 선언과 초기화를 동시에 함. 이때 선언부를 생략하는 형식 
- 함수 지역변수 -> 선언 / 초기화 


<br>

> ### 👉 코틀린에서는 기본적으로 null 불가 -> null-safe
- NPE 을 방지하기 위함 
- null이 될 수 있는 변수는 nullable 선언 -> '?'

<br>

> ### 👉 상수란 ? 값을 변경할 수 없고 항상 초기값만 반환하게 보장하는 변수
- 코틀린에서 프로퍼티로 서로 다른 값을 반환하는 것을 강제해야함
- const 예약어
  - var는 const 사용 불가
  - 최상위 레벨에서만 사용 가능 

<br>

> ### 👉 fun으로 선언
- 함수의 매개변수는 무조건 val 적용
  - FP의 중요한 개념인 '순수함수'
- 매개변수에는 기본 인수 이용할 수 있음 fun some(amount : Int = 10)

<br>

> ### 👉 기본인수와 명명된 인수 지원 
- 기본 인수로 기본값 설정 가능
  - fun myFun(name : String = "Yeonuel", age : Int = 27)
- n개 매개변수 -> 순서 혼란 -> 명명된 인수 해결 
  - myFun(name = "Yeonuel", age = 27)
  
<br>

> ### 👉 중위 표현식, 중간에 함수를 위치 시킴
- [중위 표현식]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/dd4e6d03-6402-45c8-b3b9-895e999e9d94" width="500" height="500"/>
- 코틀린은 모든 것이 객체
- 연산자를 피연산자의 중간에 위치시킴, infix 예약어
  - obj infixFun 10
- infix 사용 가능한 경우
  - (1) 클래스의 멤버 함수로 선언/클래스의 확장 함수 
  - (2) 매개변수가 하나인 함수 

<br>

> ### 👉 가변인수(vararg)를 통해 오버로딩 작업 줄임
- [가변 개수 매개변수]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/b96d9b68-9ed2-40e2-bcf0-1cf1251fb810" width="500" height="500"/>
- 여러개 오버로딩 작업 -> 함수를 가변 인수를 포함하는 함수로 선언하면 쉽게 작성 가능

<br>

> ### 👉 재귀함수(tailrec), 재귀함수를 효율적으로 사용하기 위해 tailrec 활용 
- [tailrec 주의 상황]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/b8946495-b5ea-42ff-8bdc-18b11e3fb678" width="500" height="500"/>
- tailrec -> 자바 while 문
  - 성능 개선
  - StackOverFlow 방지 
- tailrec 재귀함수에서 자신을 호출하는 구문은 함수의 맨 마지막 작업으로 작성 
  - 위의 예시에서 첫 번째 함수는 tailrec으로 선언한 것에 의미가 없어짐 

<br>

> ### 👉 자바의 final과 코틀린의 final 차이
- 자바 : final은 불변을 정의할 때 주로 사용 -> 상수, 오버로딩 x, 상속 x
- 물론, 둘 다 final이 클래스의 상속과 관련이 있음 하지만, 코틀린에서는 상수변수를 만들 때 final을 사용하지 않음 
- 코틀린에서는 val를 통해서 불변을 선언

<br>
<br>

### 3. 데이터 타입

<br>

> ### 👉 코틀린은 모든 것이 객체 
- 기초 타입 자체가 없음, 모든 것이 객체임 
- 코틀린에서는 Int, Double, Float, Long, Short, Byte, Char, Boolean, String, Any, Unit, Nothing
  - 숫자 타입 클래스들은 모두 Number의 서브 클래스 
  - Number의 규칙
    - (1) Decimals, Hexadecimals, Binaries 값 대입 가능
    - (2) Long은 접미사 L 사용
    - (3) 실수 기본형은 Double
    - (4) 실수형 10.0e2로 표현 가능 
    - (5) Float은 접미사 f, F 사용
  
<br>

> ### 👉 자바와 다른 부분 
- Char 타입은 Number로 표현 x
  - if (ch == 1) -> 컴파일 에러 
- 큰따옴표 세 개로 묶는 문자열(raw string)
  - [raw string]
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/239a73a7-7507-4490-a2b6-461220e6b45b" width="500" height="500"/>

<br>

> ### 👉 Any, Unit, Nothing
- Any : 코틀린 클래스의 최상위 클래스, 자바의 Object와 유사 
  - [Any와 Any?의 관계]
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/f42ce885-3dd7-4010-a2b5-1fe36ad6949d" width="500" height="500"/>

- Unit : 반환 구문이 없음을 의미, 타입임, void와 유사
- Nothing : 의미 있는 데이터가 없음을 명시적으로 선언 

<br>

> ### 👉타입 확인과 캐스팅(is)
- is : 타입 확인 연산자
  - 특정 타입으로 확인되면, 컴파일러가 자동으로 캐스팅하는 스마트 캐스트 
- 코틀린에서는 기초 데이터 타입에 대한 자동 형 변환 지원 x

<br>

> ### 👉컬렉션 타입 -> 배열/ List, Set, Map

- [컬렉션 타입 별 불변/가변 함수]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/f5d5745a-c540-4575-83cc-bf26be3384ae" width="500" height="500"/>

- 배열 : Array로 표현
  - [Array 선언]
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/e4b11efc-1b49-423d-b9e4-e97eff6c9f5e" width="500" height="500"/>
  - 특정 타입을 명시하지 않으면, 배열 변수에는 다양한 타입의 데이터를 추가 할 수 있음
  - 지네릭을 이용하여 특정 데이터만 추가할 수 있게 제한 가능

<br>

- 코틀린에선 Collection에 List, Set, Map 모두 표현
  - List : 순서 o, 중복 o
  - Set : 순서 x, 중복 x
  - Map : 키와 값, 순서 x, 키 중복 x

- Collection을 크게 2가지로 분류
  - (1) 가변(mutable) : R & W
  - (2) 불변(immutable) : R, 기본값 

<br>

- [List 관련 인터페이스/클래스]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/2fc82391-e6db-4771-b0ff-68e460a09101" width="500" height="500"/>
- List, Map, Set, Array 타입의 데이터 모두 이터레이터 타입의 객체로 변형하여 이용할 수 있음
  - 해당 컬렉션 모두 iterator() 있음


> ### 👉 흐름 제어 구문과 연산자
- if 문이 표현식임 -> 값을 만드는 문장, if 문에 의해 특정 값이 발생한다 
  - 표현식 : 값을 만드는 문장 
  - 구문 : 명령을 지시하는 문장 
  - if 문을 표현식으로 쓸 경우, if 문에 {} 명시하여 여러줄 작성하면, 데이터는 맨 마지막에 작성해야함 

<br>

- when은 switch 문과 유사함, 또한 when은 표현식임 
  - [when의 여러 형태]
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/ccabcdc1-5c7f-4a90-9cbc-8d1f6558b770" width="500" height="500"/>
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/6c1fd885-4ca7-4169-b6f8-2f008bff4942" width="500" height="500"/>
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/b67c84c2-a822-4256-bdd8-44f66f5bfc5a" width="500" height="500"/>
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/bdd87473-438c-41f0-8f8d-71abe3bf5ded" width="500" height="500"/>
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/6da5f506-bd80-4635-9b19-b4de57d54568" width="500" height="500"/>
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/721c1192-d45b-48c7-a7b3-6af4498307be" width="500" height="500"/>
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/8e036c6f-75ec-4aa3-b3b8-cb2f32aeab43" width="500" height="500"/>
<br>

- for 반복문 
  - [for 문의 여러 형태]
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/5549ab65-04b9-4ffb-80b0-4f8e1bcb85e7" width="500" height="500"/>
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/366828cb-31d3-446b-8cab-f601ba0bfb82" width="500" height="500"/>
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/b120a2a8-b1d4-4d6a-a204-e8ccfedf87d7" width="500" height="500"/>
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/ed4681bf-828f-41a0-818e-7f657725d30f" width="500" height="500"/>
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/40aa1b01-ffc0-4d75-97db-75053a80c4a7" width="500" height="500"/>

  
- while 문은 다른언어와 같음

<br>

- 전개 연산자(*)
  - *A : A 배열의 데이터를 나열 
- 범위 연산자(..)
  - A..B : A부터 B까지의 수를 묶어 범위 표현 


<br>

- 일치 연산자
  - ==, != -> 단순 값 비교
  - ===, !== -> 갹체 비교 

<br>

- 연산자 재정의 방법
  - 연산자에 대응하는 함수를 재정의하는 것
  - 이는 클래스의 멤버로 정의할 수 있고, 확장 함수로 추가하여 사용할 수도 있음 
  - operator 예약어 활용 

- [연산자 재정의]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/27d9b6fc-4caf-4658-bb92-255dbf989b60" width="500" height="500"/>

  
## 📌 02. 코틀린과 객체지향 프로그래밍 : 

## 📌 03. 코틀린과 함수형 프로그래밍 : 

## 📌 04. 코틀린의 다양한 기법 활용 : 

