# 📌[Spring-boot-study-challenge](https://softsquared.notion.site/Spring-Boot-2c133315be4e4e78a5bdf8514cb28bcd)

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
 
 
 ##### <h4> 2-2 switch/case문
 - 입력변수의 값과 일치하는 case 입력값에 따라 해당 case 문에 속한 문장이 실행된다. case 문장안에 break 문장을 통해 case 문장 실행 뒤 switch 문을 빠져 나간다.
 - 입력값이 정형화 되어있는 경우에는 switch/case 문장을 사용하는것이 편리하다. 
 
 ### 3. 백준문제 풀이
 - if 문 백준 5문제
 
 ![백준_if문](https://user-images.githubusercontent.com/42793489/148174171-5dd8016e-bf28-4cda-a71d-c2da6c8118f7.PNG)

 
 - while 문 백준 3문제
 
 ![백준_while문](https://user-images.githubusercontent.com/42793489/148174178-8cbb3950-6702-42c3-bbcb-43e578a23643.PNG)

</div>
</details>
 
 
<details>
<summary> 2022.1.6(Tur)</summary>
<div markdown="1">  
 
 ## 📝연산자/조건문/반복문2 + 백준문제 풀이 
 ### 1. 반복문
 ##### <h4> 1-1 while 문
 - 조건이 참인 동안 while문 아래의 문장을 반복하여 수행한다. 
 - while문 강제로 멈춰야 하는경우 break 호출하여 while 문 빠져 나가게 한다.
 - while 문 조건문으로 돌아가기 위해 continue 를 호출하여 다시 while문으로 돌아간다.
 
 ##### <h4> 1-2 for 문
 - 세미콜론(;)으로 구분을 한다. 
 - while문과 동일하게 continue를 사용해서 for 문 처음으로 돌아가서 사용이 가능하다. 
 
  ### 2. 백준 for문 문제풀이
 
 ![백준_for문](https://user-images.githubusercontent.com/42793489/148317500-8c39860d-2a55-4042-85b5-ea51ab1856c5.PNG)

 </div>
</details>
 
<details>
<summary> 2022.1.7(Fri)</summary>
<div markdown="1">  
 
 ## 📝객체지향 프로그래밍, 클래스와 인스턴스 개념 알아보고 실습하기
 ### 1. 객체지향 프로그래밍 
 - C언어처럼 실행하고자 하는 절차를 정하고, 절차대로 프로그래밍 하는 방법을 절차지향 프로그래밍이라고 한다. 그러나. 현실에서는 단순히 일련의 행위가 아니라 각 물체 간의 관계, 상호작용 등 훨씬 복잡하게 구성되어 있다.
 - 객체 지향 프로그래밍은 절차 지향 프로그래밍의 이러한 단점을 극복하고 물체를 객체로 표현하고, 관계, 상호 작용을 프로그램으로 나타낸다.
 - 자판기를 객체 지향 프로그램으로 구현하면, 관련 물체들을 객체로 추출하고, 이들의 상호작용에 필요한 함수(메소드)와 변수(필드)를 설계를 및 구현한다.
 
 ### 2. 클래스와 인스턴스
 - 클래스는 객체를 만들어 내기 위한 설계 혹은 틀이다.
 - 클래스에 선언된 모양 그대로 생성된 실체가 객체이다. 이러한 연유로 객체를 클래스의 인스턴스라고도 부른다.
 - 하나의 클래스에 여러개의 객체들이 생성될수 있다. 각 객체들은 동일한 속성을 가지고 있지만, 자신만의 고유한 값을 가짐으로 구분된다. 
 
 ### 3. 실습
 
 <details>

<summary> 백준문제 1712번 손익분기점 계산 문제 class 를 이용해서 풀이</summary>
<div markdown="2">
 
 - 소스코드
 
 ![백준_손익분기점_클래스사용_code](https://user-images.githubusercontent.com/42793489/148509965-4e62239e-30f5-4e68-a779-d803c1ef13a8.PNG)

 - 문제풀이 결과 
 
 ![백준_손익분기점_클래스사용](https://user-images.githubusercontent.com/42793489/148510001-6c265268-b73e-44ee-b1d1-a96346804a60.PNG)
 </div>
</details>
 
 <details>

<summary> 백준문제 2292번 벌집 문제 class 를 이용해서 풀이</summary>
<div markdown="2">
 
 - 소스코드
 
![백준_벌집_code](https://user-images.githubusercontent.com/42793489/148516881-8c9ee82a-d531-47c7-8a88-56766f85672b.PNG)


 - 문제풀이 결과 
 
 ![백준_벌집](https://user-images.githubusercontent.com/42793489/148516904-5ace6ae7-b6e2-4b3c-b5f2-a2c7682bc602.PNG)


 </div>
</details>

 </div>
</details>
 
 
  
<details>

<summary> 2022.1.8(Sat) </summary>
<div markdown="1">
 
 ## 📝 상속 / 캡슐화 / 다형성
 
 ### 1. 상속
 - 자식 클래스가 부모 클래스의 기능을 그대로 물려 받을 수 있는 것이 상속이다.
 - 부모 클래스의 private 접근 제한을 갖는 필드 및 메소드는 자식이 물려받을수 없다.
 - 상속 받고자 하는 자식 클래스 옆에 extends 키워드를 붙이고, 상속할 부모 클래스를 작성한다.
 ``` JAVA
 public class parent {};
 public class Child extends parent {}:
 ```
 
 - 상속할 부모는 오직 1명 뿐이다. 다음은 동작하지 않는 코드이다.
 ``` JAVA
 public class parent {};
 public class parent2 {};
 public class Child extends parent, parent2 {}:
 ```
 
 ### 2. 캡슐화
 - 변수와 함수를 하나의 클래스로 묶고 외부에서 쉽게 접근하지 못하도록 하는것 은닉화가 핵심이다. 
 - 외부에서 객체 접근하는데 있어서 정보를 숨기고 객체의 연산을 통해서만 접근가능하게 하는것이다. 
 - 외부에서 특정 객체의 데이터 및 함수를 직접 접근을 막음으로써 변경을 못하게 하고 시스템 확장시 오류를 최소화 할 수 있다는 점에서 은닉화는 장점이 된다. 
 - 캡슐화를 위한 접근 제어자
  ``` JAVA
 public class parent1 {
     private int val1; // 동일한 클래스안에서만 접근이 가능하고, 외부에서는 접근이 불가능하다.
 }; // 다른패키지에서 인스턴스(객체) 생성가능하다.
 private class parent2 {}; //동일한 클래스안에서만 접근이 가능하고,  상속은 안된다.
 protected class parent3 {}; //동일한 패키지 안에서 사용가능하고, 다른 외부 패키지라도 상속받은 클래스에는 접근 가능 
 ```
 ### 3. 다형성 
 - 하나의 객체가 여러 타입을 가질수있는 특징을 다형성이라고한다.
 - JAVA 에서 다형성은 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 인스턴스를 참조할 수 있도록 구현되고 있다.
 - JAVA 에서 부모클래스는 다중상속을 지원하지 않지만, 인터페이스는 더 추상적이기때문에 여러 인터페이스를 상속받는 다중 상속을 지원한다.
 ``` JAVA
 public class child {};
 public class parent {};
 public class child extends parent implements parents1, parents2 {}: // child 객체는 parents 클래스의 객체이면서, parents1, parents2 인터페이스의 객체이기도 하다. 
 ```
 </div>
</details>

<h1> 프로그램 실행도중 readme 파일이 날라가서 1/9~ 1/12일 기록이 없어졌습니다 조속히 복구 하겠습니다 .</h1>
 
<details>

<summary> 2022.1.13(Tru) </summary>
<div markdown="1">

## 📝자바 프로그래밍 실습

### 1. 프로그램 소개

- 프로그래머스 문제 [멀쩡한 삼각형](https://programmers.co.kr/learn/courses/30/lessons/62048?language=java) 풀이

- [소스코드](https://github.com/hyujikoh/spring-boot-study/blob/main/spring-boot/src/spring_boot.java)

- 결과 </br>
 ![image](https://user-images.githubusercontent.com/42793489/149349512-1ac7adae-95bc-4fde-a83a-4bebc23f27fd.png)

- 아쉬운점 </br>
해당 문제를 gui로 구현을 하면 좀더 한눈에 알아보기 쉬운 프로그램라는걸 알게되었지만 구현하지 못한것이 아쉬움이 남았습니다.</br>

 
 </div>
</details>

 
<details>

<summary> 2022.1.14(Fri) </summary>
<div markdown="1">

## 📝 스프링부트 개념 찾아보고 정리하기


### 스프링
- 개념    
 자바를 기반으로 한 웹 어플리케이션 프레임워크 

- 특징
  - 내장된 서버(ex. tomcat, apache 등...) 제공해서 독집 실행이 가능한 어플 개발을 지원한다.      
  - 다양한 starter  제공하어 빌드 도구 구성에 대해서 간소화 가능
  - actuator  어플에 대한 모니터링과 관리를 보다 쉽게 할 수 있다. 
 - 스프링 부트 적용 유무에 대해 차이    
   - 없는 경우 스프링 web , mvc, json같이 라이브러리 의존성 들을 추가해야한다. 또, 의존성 관리 , 서버 설정 개발 후 빌드, 배포 할 때 여러가지 설정들을 직접 다 진행하는것이 단점    
   - 있는 경우 일반 자바 어플리케이션 형태로 빌드 배포가 가능한 형태로 스프링 부트 프로젝트를 만들수있다. 또, 개발할때 사용되는 서버가 기본적으로 내장 되어있고,    
 따라서 별도의 톰캣 설정을 web.xml이나 서버 설정에서 하지 않는다.
 스프링 부트는 starter 를 제공하기 때문에 웹어플에 필요한 기본 라이브러리를 포함하기 때문에 의존성과 같은 별도의 설정을 할 필요가 없다
 
 - 기능 : starter , auto configuration, actuator
   - starter : 스프링에서 사용되는 라이브러리들의 의존 관계를 보다 간편하게 설정 할 수 있다.
   - auto configuration : 어플리케이션 기능에 대한 자동 설정을 제공함
   - actuator : 스프링 어플리케이션을 모니터링를 하기 위한 상태 제공
 
</div>
</details>

 
 
<details>
<summary> 2022.1.15(Sat) </summary>
<div markdown="1">
 
### IntelliJ 설치 및 실행

- 설치 및 결과

![image](https://user-images.githubusercontent.com/42793489/149618042-1b2cc886-00b6-4bd6-a9ad-0bd46734ed2b.png)

</div>
</details>
