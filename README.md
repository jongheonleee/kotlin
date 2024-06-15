# 🦸🏻‍♀️ kotlin(코틀린)

# 🎯 FP의 중요성

OOP가 각광받은 이유는 변경 사항이 많이 발생했고 이를 효율적으로 대처하기 위함
그 이후는 멀티 코어와 멀티 쓰레드 환경에서 서비스가 돌아가고 데이터가 증가하여 빅데이터 시대가 도래함. 따라서, 이 데이터를 처리하기 위해 FP가 각광 받음

함수형 프로그래밍이 중요한 이유, 바로 빅데이터다
멀티 쓰레딩 환경에서 함수형 프로그래밍이 각광 받음 
OOP의 경우 iv를 저장해서 공유함, 하지만 FP는 이를 지양함
FP에서 중요한 것은 두 가지
- 불변 : 변경되지 않는 것 
- 순수함수 : 외부에 영향 x

=> 그 이유는, 빅데이터 처리 과정에서 되돌리기 쉬워야함. 예를들어서, 빅데이터를 처리하는 과정에서 오류가 발생하면 해당 작업을 멈추고 작업 전 상태로 다시 되돌아가야함. 그래서 순수함수가 중요한 것임(비순수함수의 경우 되돌리기가 어려움)


나의 계획
- 2024년도 : 자바, 자스 -> 코틀린 -> 스칼라 

# 📚 기본 개념 

## 📌 02. 코틀린 기초 프로그래밍


### 1. 코틀린의 파일 구조
> 클래스 파일, 일반 파일(둘 다 확장자가 .kt)
- 둘의 차이는 없음
- 클래스 파일은 자바와 동일
- 파일은 클래스 변수, 함수 구성
- 코틀린 소스 -> 자바 소스 -> JVM 실행 

### 2. 이름 변경해서 임포트 가능
> import java.sql.Date as sqlDate
- SQL에서 사용하는 AS 처럼 별명 부여해서 그걸로 사용 가능 


## 📌 03. 코틀린과 객체지향 프로그래밍 

### 1. 변수 
> 변수 선언 var(read & write), val(read-only)
- FP이기 때문에 불변이 중요함, 그래서 기본적으로 불변
  - 예를 들어서, 메서드의 매개변수는 변수 선언 x 이는 불변으로 선언하기 때문
- 타입과 값을 분리해서 선언함 
- val는 상수가 아님, 프로퍼티 .. 이 있음
  - const 를 통해 상수로 사용가능 


> 기본적으로 null 값 사용 못함 
- ? 를 통해 nullable로 선언해줘야함 

### 2. 함수 
> fun으로 선언
- 함수의 매개변수는 무조건 val 적용
- 매개변수에는 기본 인수 이용할 수 있음 fun some(amount : Int = 10)

> 중위 표현식(infix)
- 코틀린은 모든 것이 객체, 이 말은 . 찍어서 메서드를 호출하는 것과 같이 여러 기능을 사용할 수 있다를 의미함
- infix를 통해 함수를 중위 표현으로 나타낼 수 있음, 예를들어 obj infixFun 10(infix fun infixFun() {...})

> 가변 인수(varag)
- 가변인수(매개변수가 n개)를 포함하는 함수로 선언할 수 있음
- fun <T> varagsFun(a1 : Int, varag arr : T) { ... }

> 재귀함수 
- tailrec 재귀함수, 코틀린 -> 자바 변형할 때 while(true)로 변형
  - StackOverFlowError 방지 




## 📌 04. 코틀린과 함수형 프로그래밍 

## 📌 05. 코틀린의 다양한 기법 활용

# 📝 기초 언어 적응 연습 

## 📌 01. 별찍기 풀이 과정 

### ⭐️ 문제 
<img src="https://github.com/jongheonleee/kotlin/assets/87258372/8d4c0b13-b64b-4d15-8770-196d4a84f35e" width="500" height="500"/>


### ✍🏻 풀이 과정(1~5) 
<img src="https://github.com/jongheonleee/kotlin/assets/87258372/6ef39fac-9239-43ce-86c4-9992503a94d0" width="500" height="500"/>

### ✍🏻 풀이 과정(6~10) 
<img src="https://github.com/jongheonleee/kotlin/assets/87258372/00ae515d-c391-4d46-9f8a-9f16670922ad" width="500" height="500"/>

### 🧑🏻‍🏫 출력 결과물 
<img src="https://github.com/jongheonleee/kotlin/assets/87258372/2704a8aa-f5d7-40aa-ab07-52c442c2db55" width="500" height="800"/>
<img src="https://github.com/jongheonleee/kotlin/assets/87258372/50f8eed6-d7fb-4fbb-86a3-8ab9fa602b26" width="500" height="800"/>

