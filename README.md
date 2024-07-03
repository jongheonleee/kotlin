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


> ### 👉 07. 코틀린에서 생성자는 두 개 -> '주 생성자', '보조 생성자'

<br>

> ### 👉클래스의 대표 생성자인 주 생성자, 주 생성자와 실행 영역이 분리되어 있음 
- 주 생성자 : n개의 생성자 중에 대표 생성자
  - 하나의 클래스에 하나만 작성 가능 
  - 클래스 선언 부분에 작성, 선언부에 동시에 주 생성자 실행 문을 쓸 수 없음 -> 클래스 몸체에 주 생성자 실행 영역 init{}이 존재  
  - 필수는 아님, 보조 생성자가 있으면 작성 안해도됨
  - 별도의 생성자 없으면, 컴파일러가 자동으로 주 생성자 추가 

<br>

- 주 생성자의 여러 유형
  - [매개변수 없는 주 생성자]
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/5591fd13-1938-4cf1-accc-6fad67c95108" width="500" height="500"/>

  <br>

  - [매개변수 있는 주 생성자]
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/b13d5638-5143-4407-b6e3-3bf7dcf25365" width="500" height="500"/>

  
    <br>

  - [매개변수에 기본값 명시한 주 생성자]
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/fcf71cc7-0b9a-4f41-a623-d5101a0224de" width="500" height="500"/>
  

<br>

- 주 생성자는 헤더에 명시 -> 실행문을 같이 명시할 수 없읍 -> 클래스 내부의 init{} 사용
  - init{} : 주생성자의 실행 영역
  - [init 영역]
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/364761ff-f6bc-4b34-b38a-c97e6fc09155" width="500" height="500"/>
  
<br>
  
- 초기화 블럭, 프로퍼티(iv)에서는 생성자 매개변수 사용 가능. 하지만, 멤버 함수에서는 사용 불가 
  - [함수 생성자 매개변수 아용 에러]
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/36be128e-b5ed-4aff-9aca-0eef356efac5" width="500" height="500"/>

  <br>
  
  - 위의 문제를 해결할 2 가지 방법
    - (1) 클래스 프로퍼티(iv)에 대입 -> 함수에서 프로퍼티(iv) 이용
      - [클래스 프로퍼티에 대입]
      - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/1193548b-7d15-460a-ab2d-4843f46f2e62" width="500" height="500"/>

    - (2) 생성자 내에서 val, var 이용
      - [생성자 매개변수 선언 시 var, val 이용]
      - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/89b57dd3-926f-47a6-9662-6f031d468c89" width="500" height="500"/>  

<br>  

> ### 👉 클래스의 몸체에 선언되는 보조 생성자 
- 클래스 몸체에 constructor 예약어로 선언 
  - [보조 생성자]
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/10ddad17-422c-4934-8b1f-3ced2d0f1ec4" width="500" height="500"/>  
  - 컴파일러는 보조 생성자나 주 생성자를 선언하지 않은 경우에만 주 생성자 자동 추가
  - 보조 생성자를 선언하면 주 생성자 선언안해도됨 


<br>

> ### 👉 생성자 오버로딩 -> n개의 생성자를 선언
- [생성자 오버로딩]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/6fcc3ba7-eb08-48c2-9038-ff6742a59967" width="500" height="500"/>



> ### 👉 실행 순서 : 주 생성자 -> 초기화 블럭(init{}) -> 보조 생성자
- [보조 생성자와 초기화 블럭]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/807499f3-7a7d-41da-99d5-f2909b5dd31e" width="500" height="500"/>

<br>

> ### 👉 init{}, 함수에서 보조 생성자의 매개변수에 접근할 수 없음 
- [보조 생성자의 매개변수]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/4f4ddd01-5fc3-4132-9903-187b47c7f01b" width="500" height="500"/>
- 보조 생성자 내의 매개변수에는 val, var 선언을 못함 
- 결국, 보조 생성자의 매개변수를 클래스 멤버에서 이용하려면, 클래스 프로퍼티(iv)에 대입후 이용해야함 

<br>

> ### 👉 this()에 의한 생성자 연결
- 주 생성자 선언, 보조 생성자는 무조건 주 생성자를 함께 호출. 즉, 보조 생성자에 주 생성자 호출 구문이 있어야함 
  - this()로 연결해주기 
- 주 생성자와 보조 생성자 함께 선언 -> 보조 생성자와 주 생성자를 this()로 연결
  - 주 생성자를 선언했다면, 반드시 주 생성자는 실행되야함
- [주 생성자와 보조 생성자 연결 에러]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/ea08bf2d-4285-4634-8da9-dcb5d9a803ed" width="500" height="500"/>
- [보조 생성자와 주 생성자가 함께 선언된 경우]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/1593916c-4425-4c03-a954-e51e0fa01b20" width="500" height="500"/>

<br>

- [주 생성자와 보조 생성자 코드 흐름 1]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/a145c6a8-fc2d-4c9b-9ee8-f0b1164dfb88" width="500" height="500"/>

- [주 생성자와 보조 생성자 코드 흐름 2]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/44d791bc-91a2-43ec-9822-8a93572be4b0" width="500" height="500"/>

<br>

> ### 👉 '주 생성자'와 '보조 생성자'를 구분해서 사용하는 이유?
- 일단, 질문과 번외로 가독성 고려해서 굳이 '보조 생성자'를 사용할 필요가 없으면 '주 생성자'만을 사용하는게 좋음 
- '주 생성자'의 위치 -> 생성자는 중요한 구성 요소, 클래스 선언부에 위치해 놓는게 좋음 
- 생성자 오버로딩 ->'주 생성자' : 공통 매개변수(필수값), '보조 생성자' : 개별 매개변수(선택값) 

<br>

> ### 👉 코틀린의 파일은 코드를 관리하는 수단일뿐임 
- 자바의 경우, 하나의 파일에 public이 추가된 클래스는 하나만 존재
- 코틀린은 public 클래스 n개 가능, 즉 파일은 코드를 관리하는 수단일뿐 클래스와는 관련 없음 

> ### 👉 코틀린에는 new 가 없음 

<br>
<br>

> ### 👉 08. 코틀린에서 iv는 프로퍼티, getter/setter가 있는 객체 

<br>

> ### 👉 코틀린은 모든 것이 객체, iv도 객체 이를 프로퍼티라고 말함
- 프로퍼티 : 클래스의 변수(iv), 함수가 내장된 변수
  - 접근자 - getter/setter 가 내장되어 잇음
- [프로퍼티 형식]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/6b16608b-096f-400b-89a7-e816f19dffd2" width="500" height="500"/>

<br>

- [클래스에서 프로퍼티]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/d74439dd-d251-4c36-90fa-23c8b818303e" width="500" height="500"/>
- var -> getter/setter 추가됨, val -> getter만 추가됨 
- 외부에서 get(), set() 명시적으로 호출하는 것이 아니라 변수값을 조회하거나 변경하면됨 
  - 내부적으로는 get(), set() 호출 

<br>

> ### 👉 접근자(getter/setter)를 사용하는 이유
- OOP의 핵심 내용 중 하나인 캡슐화와 관련있음
  - 캡슐화 -> 정보은닉, 보호, 유지 보수성 
  - 변수를 직접 다루는 것이 아니라, getter/setter로 간접적으로 다루는 것 
- 또한, 외부에서는 변수를 직접 다루는 것처럼 사용하지만, 실질적으로는 내부에서 getter/setter를 이용
- 따라서, getter/setter 정의 하지 않아도됨


<br>

> ### 👉 사용자 정의 프로퍼티, 즉 getter/setter를 재정의 
- [사용자 정의 프로퍼티]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/0cc8487f-80ba-44ad-a3b9-3fee03af4989" width="500" height="500"/>

<br>

- [사용자 정의 프로퍼티 잘못 사용
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/824f0e59-272f-482f-8c6a-e47faeaf2bcd" width="500" height="500"/>

- getter/setter 직접 정의 가능 
- 사용자 정의 프로퍼티 규칙
  - (1) 프로퍼티 값을 'field'로 접근
  - (2) var -> get(), set() 재정의 가능, val -> set() 재정의 불가능 
  - (3) val -> get() 정의하면 초깃값 명시안해도됨 
  - (4) var -> get() 정의해도 초깃값 명시해야함  

<br>

> ### 👉 프로퍼티 -> 최상위 레벨 변수, 클래스 내부에 선언한 멤버 변수(iv)
- [다양한 변수와 프로퍼티]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/472fd999-b0d1-4913-b106-4c8cf672e41b" width="500" height="500"/>
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/919e3402-4b38-4425-b7c5-32d2e455be1a" width="500" height="500"/>
- 모든 변수가 프로퍼티는 아님
- lv는 프로퍼티 아님 

<br>

> ### 👉 생성자에 var, val 로 선언한 변수에는 get(), set() 정의 할 수 없음
- [주 생성자 프로퍼티 이용]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/3bd6ad3e-3c3e-41bc-b604-422bd999b208" width="500" height="500"/>
- 원래는 안됨, 하지만 가능하게 하는 방법이 있음
- 주 생성자의 매개변수를 클래스에 선언한 프로퍼티에 적용, 그 프로퍼티를 활용하면됨 

<br>

> ### 👉 다양한 방식의 프로퍼티 초기화. 크게 5가지 방식
- 원래 프로퍼티는 선언과 초기화 동시에 처리, 하지만 여러 방식들이 있음(4 가지 방식이 더 있음)
  - 일반적으로 프로퍼티는 선언과 초기화 동시에 처리 안하면 컴파일 에러 발생 
- 선언과 초기화 동시 처리 이외의 초기화 방식은 크게 4가지가 있음
  - (1) [초기화 블록에서 프로퍼티 초기화]
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/407ac4ce-6786-4ab3-8f7f-ba9299d098f0" width="500" height="500"/>
  
  <br>
  
  - (2) [null 허용으로 선언]
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/e946b3e0-c408-48b9-9118-d6ce76ed5734" width="500" height="500"/>
  - '?' -> nullable 로 선언 
  - null 로 초기화한 후 실제 데이터로 값을 변경 
  
  <br>
  
  - (3) [늦은 초기화]
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/fb569eab-996a-4b2a-beee-cf13b1da6bc1" width="500" height="500"/>
  - 프로퍼티를 nullable 선언안하고 프로퍼티 초기화를 미룸, 이를 늦은 초기화
  - lateinit 키워드 사용, 그리고 규칙이 있음
    - (1) lateinit은 var 만 가능
    - (2) 주 생성자에 사용할 수 없음
    - (3) 사용자 정의 getter/setter 못함 
    - (4) nullable 안됨
    - (5) 기초 타입 프로퍼티 사용 불가 
      - [lateinit 사용 에러]
      - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/e11b0b32-08f9-4fb4-9f8e-fb28e37a6187" width="500" height="500"/>

  <br>

  - (4) [초기화 미루기]
  - <img src="https://github.com/jongheonleee/kotlin/assets/87258372/d27f3246-83c0-4434-9a82-86db23f1f3dc" width="500" height="500"/>
  - 미리 정의는 해두지만 미룸
  - by lazy {} 로 선언, 프로퍼티가 이용되는 시점에 해당 영역 실행됨 
  - 프로퍼티 선언하면서 초기화하는 것을 미룸, 사용 시점에 초기화 실행 
  - lazy의 규칙
    - (1) 호출 시점에 초기화 실행
    - (2) val 로 선언한 프로퍼티에만 사용 가능 
    - (3) 클래스 몸체, 최상위 레벨에서 사용 가능
    - (4) 기초 타입에도 가능 


<br>

> ### 👉 초기화 시점을 미루는 이유
- 코틀린에서는 null 처리가 엄격함
- null 대입하지 않을 프로퍼티에 null 대입했다가 추후에 초기화하는 것은 불필요한 작업
- null 허용하지 않는 프로퍼티인데 초기화를 나중에 하는 경우는 많음
  - DI, 의존성 주입

<br>

> ### 👉 프로퍼티 값 변경 감지, 변경 -> 특정 코드 실행 
- [프로퍼티 observable]
- <img src="https://github.com/jongheonleee/kotlin/assets/87258372/74193400-5e04-4934-b5a8-f146e1cc3c53" width="500" height="500"/>
- 'by Delegates.observable(초기값, 실행문(람다))'

<br>

> ### 👉 코틀린에서는 필드가 없음
- 필드 : 클래스의 멤버 데이터, 별도로 지정하지 않는 한 정적이지 않음
  - 하나의 클래스 내에서만 사용하고자 하는 변수(iv)
- 프로퍼티 : 사용자가 설정할 수 있는 객체의 특성
  - 외부에서 이용을 위해 getter/setter 를 포함한 변수(iv + 접근자)

<br>
<br>

> ### 👉 09. 상속 

<br>

> ### 👉 Any 클래스 -> equals(), toString() 만 제공하는 최고조상 


<br>

> ### 👉 상속을 통한 클래스 정의 
- [상위 클래스/하위 클래스]
- <img src="" width="500" height="500"/>
- <img src="" width="500" height="500"/>
- <img src="" width="500" height="500"/>
- open 키워드, 콜론(:) 사용
- 코틀린은 기본적으로 final 로 상속을 막아둠
  - 상속 허용 여부 명시하지 않으면 기본적으로 final 적용
  - final 의미
    - (1) final 클래스 : 상속 x
    - (2) final 함수 : 함수 오버라이드 x
    - (3) final 프로퍼티 : 프로퍼티 오버리이드 x 

<br>

> ### 👉 오버라이드 -> 함수, 프로퍼티 
- [상위 클래스/하위 클래스]
- <img src="" width="500" height="500"/>
- <img src="" width="500" height="500"/>
- <img src="" width="500" height="500"/>
- 오버라이드 : 상위 클래스의 프로퍼티나 함수 -> 하위 클래스에서 재정의
- 상위에서는 해당 타겟이 open으로 열려있어야함
- 하위에서는 override를 통해서 오버라이함 
  - override로 정의한 함수는 자동으로 open 상태
    - 하위에서 오버라이드 막으려면 final 사용, 즉 final override 사용해야함 
  
<br>

- 프로퍼티 오버라이드 규칙
  - (1) 상위 클래스의 프로퍼티, 이름, 타입 일치
  - (2) val -> var, val 가능 
  - (3) var -> var 가능 
  - (4) nullable -> null 불가 가능 
  - (5) null 불가 -> nullable 불가능 

<br>

> ### 👉 상위 클래스 멤버 접근, 상위 클래스 생성자 호출 -> super.멤버, super()  
- [상속에 의한 생성자]
- <img src="" width="500" height="500"/>

<br>

- [상위 클래스 생성자 연결]
- <img src="" width="500" height="500"/>
- 생성자 간의 관계 
  - (1) 주 생성자 선언, 해당 클래스의 보조 생성자에서는 주 생성자와 연결하기 위해 this() 구문이 추가되야함 
  - (2) 객체 생성 시 어떤 식으로든 상위 클래스의 생성자는 호출되어야함 

<br>

- [상하위 생성자의 수행 흐름]
- <img src="" width="500" height="500"/>
- 생성자가 호출되는 순서
  - (1) this(), super()에 의해 다른 생성자 호출
  - (2) init {} 호출
  - (3) 생성자의 {} 실행 

<br>

> ### 👉 스마트 캐스팅 -> 타입 확인되면 그 타입으로 자동 변환
- 스마트 캐스팅 : 명시적으로 캐스팅을 선언하지 않아도 자동으로 캐스팅되는 것
  - is 는 스마트 캐스팅 : 타입 체크 + 스마트 캐스팅 

<br>

> ### 👉 as를 이용한 캐스팅, 명시적 캐스팅 
- 코틀린에는 자동 캐스팅 없음
- 상속 관계에 있는 객체를 명시적으로 캐스팅할 때는 'as' 키워드 사용
- [형식]
- <img src="" width="500" height="500"/>

<br>

- 'as?'를 사용하면, nullable 객체에 객체가 대입되면 캐스팅, 그렇지 않으면 null 반환

<br>

> ### 👉 접근 제한자, 각 요소별로 상이함 
- [최상위 구성요소의 접근 제한자]
- <img src="" width="500" height="500"/> 

<br>

- [클래스 멤버의 접근 범위]
- <img src="" width="500" height="500"/> 

<br>

- [프로퍼티의 접근 제한자]
- <img src="" width="500" height="500"/> 

<br>

- 주 생성자와 보조 생성자 모두 접근 제한자를 지정할 수 있음
- 상속 관계에 의한 접근 제한자 지정 규칙
  - (1) open과 private 동시에 사용 x
    - 최상위 파일에서는 가능, 또한 해당 클래스의 하위 클래스 구현시 똑같은 접근 제한자 써야함(private)
  - (2) 하위 클래스에서 상위 멤버를 오버라이드할 때 접근 범위를 줄일 수 없음 
  


<br>

> ### 👉 코틀린에서의 상속이 자바의 상속과 다른 부분
- (1) 최상위 클래스 Any
- (2) 세미 콜론(:) 사용
- (3) 기본값 final, 상속 ... 처리하려면 open 사용
- (4) 명시적 캐스팅 -> as

## 📌 03. 코틀린과 함수형 프로그래밍 : 

## 📌 04. 코틀린의 다양한 기법 활용 : 

