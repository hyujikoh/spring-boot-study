# 📌Spring-boot-study-challenge

<details>

<summary> 2022.1.3(Mon)</summary>
<div markdown="1">

## 📝JAVA의 언어적 특성을 찾아보고 정리하기


### 1. 메모리 관리 용이
- 기존의 C언어 같이 point 변수를 통해 메모리를 관리안해도 자동으로 메모리 관리가 가능하다.
### 2. 객체 지향 언어
- 객체를 만들기 위해 클래스를 작성해야하고, 객체와 객체를 연결해 목적에 맞는 프로그램을 만들어야한다.
### 3. 이식성이 높다.
- JAVA로 개발된 프로그램은 JRE이 설치되어있는 모든 OS에서 실행이 가능하다.
### 4. 멀티스레드 지원
- 자바 자체가 Thread 생성 및 제어와 관련된 라이브러리 api 제공하기 때문에 보다 Multi Thread 구현이 가능하다.
### 5. 동적로딩 지원
- 프로그램 실행시 모든 객체 생성하지 않고, 객체가 필요한 시점에 동적로딩해서 객체 생성한다.
유지보수 할 시 해당 클래스만 수정하면 되므로 유지보수에 용이하다.

 
</div>
</details>

 
<details>
<summary> 2022.1.4(Tue)</summary>
<div markdown="1">

## 📝변수/ 상수/ 자료형/ 특수문자 + 백준문제 풀이
 
### 1. 변수
 - 데이터를 저장하는 공간을 변수라 한다. 
 - 변수명은 숫자로 시작할 수 없다. 
 - _와 $ 문자 이외의 특수 문자 사용할 수 없다. 
 - JAVA 키워드는 변수명으로 사용할 수 없다.
### 2. 상수
 - 변하지 않거나 일정한 값을 가진 수와 양을 의마한다. 주로 Final 키워드를 사용하여 선언한다. 
 Ex) final double PI = 3.141592; // final로 double 데이터 타입 변수명 PI 를 3.141592로 상수선언을 하였다.
### 3. 자료형 
 - 프로그래밍을 할 때 쓰이는 숫자, 문자열 등의 자료 형태로 사용하는 것들을 의미한다. 
 - 논리타입 : boolean (1바이트, True or False)
 - 문자타입 : char (2바이트)
 - 정수타입 : byte (1바이트), short (2바이트), int (4바이트), long(8바이트)
 - 실수타입 : float(4바이트), double(8바이트)
### 4. 특수문자
- 자바에서 출력문에서 특수문자가 나오는경우, 그 다음 문자를 인식해 상황에 맞게 처리하는 Escape Sequence를 통해 처리한다.    
 
| 입력 | 출력 |    
| :---: | :----: |    
| \ | 에러 |    
| \\ | \ |
| \' | ' |
| \" | " |
| ( | ( |
| \( | Error |
| / | / |
| \/ | Error |
| \n | 줄 바꿈 |
| \r | 줄 맨 처음으로 |
| \t | tab |
| \b | 백스페이스 |
| \0 | 빈 칸 |
### 5. 백준문제 풀이 
 - 백준 단계1 입출력과 사칙연산 11문제 풀이 완료    
 
 ![백준_기본](https://user-images.githubusercontent.com/42793489/148000764-9ba92dcf-48f3-4a84-abe1-2bd36a94d261.PNG)

</div>
</details>

<details>
<summary> 2022.1.5(Wen)</summary>
<div markdown="1">    

 
## 📝연산자/조건문/반복문1 + 백준문제 풀이    
 ### 1. 연산자
 - 연산식은 연산자를 통해 하나의 값을 산출한다.
 - 피 연산자의 수의 따라 단항 연산자, 이항연산자, 삼항 연산자로 구분되어진다.
 - 연산자 종류
 
 | 연산자 종류 | 연산자 | 피연산자수 | 설명 |   
 | :---: | :----: | :----: | :----: |  
 | 산술연산 | +,-,*,/,% | 이항 | 사칙연산 및 계산 |
 | 부호 | +,- | 단항 | 정수, 실수 타입에 부호 |
 | 문자열 | + | 이항 | 문자형 변수 2개를 연결시킴 |
 | 대입 연산 | =,+= ,-=, *=, <<= ...etc | 이항 | 우변의 값을 좌변 변수에 대입 |
 | 증감 연산 | ++, -- | 단항 | 1만큼 증가/ 감소 |
 | 비교 연산 | ==, !=, <, >, <= ..etc | 이항 | 좌 우변 값 비교 |
 | 논리 연산 | !, &, ||, &&| 이항,단항 | 논리적 NOT, AND, OR 연산 |
 | 조건 연산 | (조건식)? A : B | 삼항 | 조건식에 따라 참일경우 A, 거짓이면 B |
 | 비트 | ~,&,^ | 단항, 이항 | 비트식 NOT, AND, OR 연산 |
 | 비트 쉬프트 | >>,<<,>>> | 이항 | 비트를 좌 or 우측으로 이동 |
 
 - 연산 우선순위  
 1. 단항 - 이항 - 삼항 순으로 우선운위 갖는다.
 2. 산술 - 비교, 논리 - 대입 연산자 순으로 우선순위 갖는다.
 ### 2. 조건문
 - 프로그래밍할 때 일어 날 수 있는 상황조건을 판단해서 그 상황에 맞게 처리하는것이 조건문이다. 
 
 ##### <h4> 2-1 if문
 - if(조건문)에 사용한 조건문으로 참과 거짓을 판단한다.
 - else if 를 사용하여 다중조건 판단을 가능하게 한다. 
 - if 와 else if 조건을 충족 못하는 조건들은 else 문장으로 수행된다.
 
 ##### <h4> 2-2 while문
 - 조건이 참인 동안 while문 아래의 문장을 반복하여 수행한다. 
 - while문 강제로 멈춰야 하는경우 break 호출하여 while 문 빠져 나가게 한다.
 - while 문 조건문으로 돌아가기 위해 continue 를 호출하여 다시 while문으로 돌아간다.
 
 ##### <h4> 2-3 switch/case문
 - 입력변수의 값과 일치하는 case 입력값에 따라 해당 case 문에 속한 문장이 실행된다. case 문장안에 break 문장을 통해 case 문장 실행 뒤 switch 문을 빠져 나간다.
 - 입력값이 정형화 되어있는 경우에는 switch/case 문장을 사용하는것이 편리하다. 
 
 ### 3. 백준문제 풀이
 - if 문 백준 5문제
 
 ![백준_if문](https://user-images.githubusercontent.com/42793489/148174171-5dd8016e-bf28-4cda-a71d-c2da6c8118f7.PNG)

 
 - while 문 백준 3문제
 
 ![백준_while문](https://user-images.githubusercontent.com/42793489/148174178-8cbb3950-6702-42c3-bbcb-43e578a23643.PNG)

</div>
</details>
