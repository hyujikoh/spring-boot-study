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
 
 
<details>
<summary> 2022.1.16(Sun) </summary>
<div markdown="1">

## 📝스프링부트 프로젝트 구조 살펴보기 / 의존성 / 내장 웹서버 / JAR / Application.properties 1 

### 1. 📌Today's study    
 
1-1. pom.xml 작성

 ```XML
 <?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.6.2</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>org.example</groupId>
    <artifactId>hello-boot</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

    <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
    </properties>

</project>
 ```
 
1-2. Structure
 - JAVA 폴더에 io.namusori.hello package 생성후, application 클래스 생성
 
```
 hello-boot
 > src
   > main
     > java
       > io.namosori.hello
          | application.java // 서버 run, 스프링부트의 
          > controller
             | Hellocontroller.java // localhost 서버 연결시 상호작용
 ```
 
 1-3. application.java
 
 ```JAVA
 package io.namosori.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class, args);
    }
}
 ```
 
 
 1-4. Hellocontroller.java
 
 ```JAVA
 package io.namosori.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

    @GetMapping("/spring")
    public String hello(){
        return "2022-01-16-오현직 테스트 완료";
    }
}

```

1-5 실행결과
 
![image](https://user-images.githubusercontent.com/42793489/149650412-89c21a1e-66f0-4ed2-bb28-b87df2e4f291.png)

### 2. 공부한 내용
 #### Annotation
 스프링 부트는 어노테이션을 다양하게 아는 것이 중요하다. SpringBoot의 시작점을 알리는 @SpringBootApplication 어노테이션 뿐만 아니라, 스프링 부트 어노테이션 등의 키워드로 구글링 해서 스프링부트에서 자주 사용되는 다양한 어노테이션을 이해하고 외워두자. 
 
 #### 상속    
 
 pom.xml 파일 안에 artifactId = spring-boot-starter-parent 를 상속 받으므로서  캐릭터 인코딩에 대한 utf-8 에 대한 버전 그리고 자바에 대한 버전과 관련된 properies 설정을 하지 않아도 되고, 
 상속 받은 spring-boot-starter-parent의 부모 spring-boot-dependencies 안에 관련 버전 설정 내용 이 들어가 있기 때문에 따로 설정을 안해도 된디. 
</div>
</details>
 
<details>
<summary> 2022.1.17(Sun) </summary>
<div markdown="1">
 
## 📝 스프링부트 프로젝트 구조 살펴보기 / 의존성 / 내장 웹서버 / JAR / Application.properties 1 

### 1. Today's Study

 - <h3> Spring Boot 설정</h3> 
 
   - Spring boot 사용하지 않는다면, 기본적으로 웹서버(Tomcat, jetty등), Servlet 설정, web.xml, bean 설정 등 전반적인 configuration을 해야하지만, Spring Boot 에서 기본적인 설정이 되어있기 때문에 따로 설정할 필요가 없다.    
 
   - 설정 구성 할 경우   
 
   1. XML 파일을 통한 설정
   2. Class 기반으로 하여 Annotation을 준다. @configuration Annotation을 주고 특정 bean 등록하면 해당 bean 은 설정을 위해 사용되는 클래스다. 그래서 해당 클래스를 등록하고 @configuration 에 정의 되는 그 기능들을 통해 움직이는 필요한 기본 설정을 지원한다.    
 
 - <h3> Annotation </h3>    
 
   1. 전날 공부한 application.java 파일안에 추가한 @SpringBootApplication 문장은 3가지 Annotation을 포함한다.
   2. @SpringBootConfiguration : @configuration이라고 이해해야한다. 
   3. @ComponentScan : 특정 패키지 부터 Annotation이 붙은 클래스들을 (ex. @service 등등) 찾아서 bean 을 등록하는것 즉, Spring bean 객체들을 찾기 위해서 사용하는 Annotation이다. 만약 내가 임의로 생성한 bean 객체라면, 예를들어 어제 공부위해 추가한 Hellocontroller 클래스 파일에서 @RestController라는 Annotation을 갖고 있고, @RestController라는 Annotation은 controller라는 bean 등록 controller 클래스에 bean이 등록되는 Annotation이다 . 
   4. @EnableAutoConfiguration : 자동설정 진행 Annotation, 먼저 componentScan 우리가 등록하고자 하는 bean 들이 쭉 등록이 될거다. 그리고 이후 @EnableAutoConfiguration 이 기능을 통해서 한번더 컴포넌트들을 스캔하면서 bean 등록이 되게 되는데 , 그때 등록된 빈 들은 설정을 위해 사용되는 다양한 빈들이 등록이 된다. 

 - <h3> 내장 웹서버 </h3>
 
   - spring-boot-starter-web 에 기본 내장웹서버가 설정되어있고, 해당 파일을 통해 내장 웹서버를 따로 구축 안해도 되고, 간단하게 다른 웹서버로 변경이 가능하다. 
 
 - <h3> JAR 파일 </h3>
  
   - 여러개의 JAVA Class 파일과, 관련 리소스 및 메타데이터를 하나의 파일로 모아소 플랫폼에 SW배포와 Libary를 배포하기 위한 파일 포맷
</div>
</details>



<details>
<summary> 2022.1.18(Tue) </summary>
<div markdown="1">

## 📝 데이터베이스 개념, Mysql 설치 

### 1. 데이터베이스 개념
 
 
 
 - 넓은 의미에서, 일상생활 속에서 나오는 다양한 정보들이 사회와 밀접한 관계를 맺고 있고, 이러한 일상적인 정보들을 모아 놓은것 자체를 의미한다. 일반적으로 데이터베이스 정의는 기업, 조직, 또는 개인이 필요에 의해 데이터를 일정한 형태로 저장해 놓은 것을 의미한다.
 - 이후 관리 대상이 되는 데이터 양이 많아지고 여러 사람이 동시 여러 용도로 사용하게 되면서 단순히 개인이 관리하는 SW 만으로 한계에 부딪힌다. 이로인해 많은 사용자들이 보다 데이터관리, 데이터 손실 방지, 같은 기본적인 요구사항 만족시키는 DBMS가 나오게 된다.

### 2. 관계형 데이터베이스
 
 - 기능
   - 이상(ANOMALY) 현상, 중복 방지
   - 동시성관리, 병행제어 
   - 메타 데이터 총괄관리할 수 있기 때문에, 데이터의 성격, 속성 또는 표현 방법 등을 체계화를 통한 데이터 표준화 제공
   - 인가된 인증된 사용자만이 참조할 수 있도록 보안기능 제공
   - 조건에 위배되는 데이터 입력, 중요데이터 삭제 방지하여 데이터 무결성(Integrity) 보장
 
 - SQL : 관계형 데이터베이스에서, 데이터 정의 , 데이터 조작, 데이터 제어를 하기 위해 사용되는 언어.
 
### 3. MYSQL 설치 및 실행 결과
 
 - 화면 캡처
![image](https://user-images.githubusercontent.com/42793489/149841846-071eccf6-dabc-4091-a11c-176b335e03c3.png) 

</div>
</details>

 
 
<details>
<summary> 2022.1.19(Wen) </summary>
<div markdown="1">
 

## 📝 Mysql 구조 및 서버 접속하기

### 1. 데이터베이스 구조
 
 - TABLE : 관계형 데이터베이스의 기본 단위, 어느 특정한 주제와 목적으로 만들어지는 일종의 집합
 - SCHEMA : 각각의 테이블을 연관유무에 따라 그룹핑 하고, 아닌 경우 테이블을 분리하여 표현하는 구조
  - 내부 SCHEMA : 데이터베이스가 물리적으로 저장된 형식. 물리적 장치에서 데이터가 실제적으로 저장되는 방법을 표현하는 스키마
  - 개념 SCHEMA : 모든 사용자 관점 통합한 전체 DB 기술한 것 , DB 에 저장되는 데이터와 사용자들간의 관계를 표현 하는 스키마
  - 외부 SCHEMA : 데이터베이스의 개개 사용자나 응용프로그래머가 접근하는 DB 정의하는 스키마
 - DB : 여러 스키마를 그룹화 한 것이 DB

 ### 2. Mysql 서버 접속하기
 
 - bitnami WAMP 설치후 Mysql 동작 하는지 확인
 ![image](https://user-images.githubusercontent.com/42793489/150064279-8347f2ca-13a0-4290-93a5-f21e5ed8a145.png)
 
 - bitnami 가 설치된 경로중 C:\Bitnami\wampstack-8.0.1-0\mysql\bin 폴더안에 mysql 파일 cmd 에서 실행(계정은 root)하여 mysql 서버 접속
![image](https://user-images.githubusercontent.com/42793489/150049511-db0e777d-3c01-4b14-b7aa-c0a2be0372ae.png)
 

 
</div>
</details>
 
 
<details>
<summary> 2022.1.20(Thu) </summary>
<div markdown="1">

## 📝 SQL, 테이블 개념 알아보기
 
### 1. SQL 

- 개념 : 관계형 DB 에서 데이터 정의, 데이터 정의, 데이터 제어 위해 사용되는 언어이다.

- SQL 문장들의 종류

| 명령어 종류 | 명령어 | 설명 |
| :---: | :----: | :---- |
| 데이터 조작어(DML) | SELECT</br>INSERT</br>UPDATE</br>DELETE | 데이터 조회 검색 위한 SELECT와 데이터를 새로운 행에 집어넣는 INSERT, 데이터 삭제와 수정하는 UPDATE 와 DELETE 같이 데이터 조회와 변형을 가하는 명형어를 DML이라 말한다  |
| 데이터 정의어(DDL) | CREATE</br>ALTER</br>DROP</br>RENAME| 테이블과 같은 데이터 구저 정의하는데 사용되는 명령어. 구조를 생성하거나 변경, 삭제, 이름 바꾸는 데이터 구조와 관련된 명령어들을 DDL |
| 데이터 제어어(DCL) | GRANT</br>REVOKE | 데이터베이스에 접근하고 객체 ㅏ용하도록 권한을 주고 회수하는 명령어를 DCL |
| 트랜잭션 제어어(TCL) | COMMIT</br>ROLLBACK | 논리적인 작업의 단위를 묶어서 DML에 의해 조작된 결과를 작업단위(트랜잭션) 별로 제어하는 명령어를 TCL |
 
### 2. TABLE

- 개념 : 데이터를 저장하는 객체로서 관계형 데이터베이스의 기본 단위이다.

| 용어 | 설명 |
| :---: | :--- |
| 테이블 | 행과 칼럼의 2차원 구조를 가진 데이터의 저장 장소이며, DB의 가장 기본적인 개념 |
| 칼럼/열 | 2차원 구조를 가진 테이블에서 세로 방향으로 이루어진 하나하나의 특정 속성 |
| 행 | 2차원 구조를 가진 테이블에서 가로 방향으로 이루어진 연결된 데이터 |


</div>
</details>

<details>
<summary> 2022.1.21(Fri) </summary>
<div markdown="1">
 
## 📝 Mysql INSERT, SELECT, UPDATE, DELETE 실습하기

### 테이블 구축

- springboot 데이터베이스에 pet 테이블 구축
 
- springboot 데이터베이스 구축 및 pet 테이블 구축

![image](https://user-images.githubusercontent.com/42793489/150477538-e81b555b-90e2-47e8-adfb-a126ee40c357.png)
 
![image](https://user-images.githubusercontent.com/42793489/150477859-32e9b657-f81e-4f87-b112-3cfa7dbdbf35.png)

### INSERT, SELECT, UPDATE, DELETE 실습
 
- pet 테이블 INSERT 명령어로 데이터 추가, SELECT 명령어로 데이터 조회
 
![image](https://user-images.githubusercontent.com/42793489/150478081-af2f0b03-6817-4cdf-88f1-b90c36ae5373.png)

- UPDATE 명령어로 데이터 수정 ( NAME = NACHO 라는 데이터의 DEATH 속성 데이터 추가 )

![image](https://user-images.githubusercontent.com/42793489/150478633-02de25e2-9396-42e4-81ef-992538856b17.png)

 - DELETE 명령어로 pet 테이블에 데이터 삭제( sex = m 인 데이터 삭제)

 ![image](https://user-images.githubusercontent.com/42793489/150478846-0e7498d3-1828-44f2-8172-af0c734867d0.png)

</div>
</details>

<details>
<summary> 2022.1.22(Sat) </summary>
<div markdown="1">

## 📝 Mysql JOIN 개념 알아보고 실습하기

 
### 사전 구축
- 테이블 pet 과 테이블 shop 두개의 테이블을 통해 동일한 속성 pet name 을 통해 join 이용 
 > ### pet 테이블 
![image](https://user-images.githubusercontent.com/42793489/150632737-d4091f24-2d8b-4ea7-8f32-4dbce8f27c5e.png)
 
 > ### shop 테이블 
![image](https://user-images.githubusercontent.com/42793489/150632773-67c7855e-8713-4b21-9f58-198bfe4e8b10.png)

 ### 📌 실습
 #### (pet.*,shop.shopName,shop.number 으로 출력)
 
 </br>
 
 > ### inner join result
![image](https://user-images.githubusercontent.com/42793489/150632857-4c0eb56d-19aa-4a16-8ecf-69c1194d2188.png)

 > ### left outer join result
![image](https://user-images.githubusercontent.com/42793489/150632989-4d7fef0b-5365-4f29-a903-69203721c703.png)

 > ### right outer join result
![image](https://user-images.githubusercontent.com/42793489/150633015-4ff2253d-a2a9-4131-8ac3-18933c58775f.png)

</div>
</details>


<details>
<summary> 2022.1.23(Sun) </summary>
<div markdown="1">

## 📝 앞서 진행했던 Spring Boot 복습해보기
 
### user-rest java 파일 생성하여 이름, email, 난수화된 id를 json 형태로 출력

```
 user-rest
 > src
   > main
     > java
       > io.namoosori.rest
          | UserRestApp // 서버 run, 스프링부트의 
          > entity
             | user.java // user의 난수화된 id, 입력화된 이름, email 을 출력하는 테스트 java 파일
 ```
 
1. pom.xml
``` JAVA
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
 
    <parent> // spring-boot-starter-parent 상속을 받음 
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.6.2</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>

    <groupId>io.namoosori</groupId>
    <artifactId>user-rest</artifactId>
    <version>1.0-SNAPSHOT</version>
    
    <dependencies> // 초기 설정 위한 spring-boot-starter-web과 user api 구축위한 lombok 의존성주입
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
        <dependency> //json 타입 데이터 사용 위한 gson 의존성 주입 
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.5</version>
        </dependency>

    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>


    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>

</project>
```
 
 
2. UserRestApp.class 
```JAVA
 
// 초기 실행 위한 java 파일
package io.namoosori.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserRestApp {
   public UserRestApp() {
   }

   public static void main(String[] args) {
       SpringApplication.run(UserRestApp.class, args);
   }
}
```
 
3. User.java
``` JAVA
package io.namoosori.rest.entity;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class User {
    private String id;
    private String name;
    private String email;
    public User(){
        this.id = UUID.randomUUID().toString();/** 유저객체가 생성될때마다 랜덤할 아이디를 부여한다**/
    }
    public User(String name, String email){
        /** id 는 랜덤으로 만들어주기 때문에 this ();으로 호출하여 아이디를 생성하고 매개변수로 초기화 **/
        this();
        this.name = name;
        this.email = email;
    }

    /**유저에 데이터를 여러가지 형태로 사용한다 . 우리는 insomnia 라는 restclient라는 클라이언트로 데이터를 주고받을것이다 그 테스트를 위해서 필요한 데이터들이 있다. 샘플데이터를 위해서 entity 에다 static 데이터를 만든다**/
    public static User smaple(){
        return new User("Thomas","dvum0045@gmail.com");
    }
    public static void main(String[] args) {
        User user = new User("kim","kim@gmali.com"); // 객체생성
        /**만약 getsetter 가 나온다면 만약 lombok 을 처음 사용한다면 플러그인을 설치해야한다**/
        /**json 형태로 출력 // **/
        System.out.println(new Gson().toJson(user));
    }
}

```
 
> ### 해당 프로그램 실행결과
![image](https://user-images.githubusercontent.com/42793489/150667499-20e05e9a-61b5-4790-96e1-245c36863b9b.png)

</div>
</details>

<details>
<summary> 2022.1.23(Mon) </summary>
<div markdown="1">

## 📝 앞서 진행했던 java 기본 문법과 SQL문 복습하기 
 
 
### 1. JAVA 기본 문법 복습

> [코딩테스트 연습(전화번호 목록)](https://programmers.co.kr/learn/courses/30/lessons/42577)
``` JAVA
// hashmap 을 통해 문제 풀이
import java.util.HashMap;
import java.util.Map;
class Solution {
    //해시 맵 선언 , 키값은 문자형 value 는 정수형 을 갖는 해시 구조 생성
    public boolean solution(String[] phone_book) {
        Map<String,Integer> map = new HashMap<>();

        //2. HashMap 에 phone_book의 전화번호를 넣는다.
        for(int i=0;i<phone_book.length;i++){
            map.put(phone_book[i],i);
        }
        //모든 전화번호의 substring이 hashmap이 존재하는지 확인
        for(int i=0;i<phone_book.length;i++){
            for (int j=0;j<phone_book[i].length();j++){
                //각 phone_book[i]의 substring 을 추출하여 그것이 hash 값에 존재하는지 여부 판단 
                if(map.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }
        return true;
    }
}
```
``` JAVA
// for 문과 startwith 으로 문제 풀이
import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        // phoneBook 정렬 
        Arrays.sort(phone_book);
        //for 문 사용 하여 앞번호가 뒷번호 접두어 인지 확인
        
        for (int i = 0; i < phone_book.length - 1; i++){
          if (phone_book[i + 1].startsWith(phone_book[i])) 
              return false;  
        } 

       
        return true;
    }
}
```
![image](https://user-images.githubusercontent.com/42793489/150726544-5b3a7957-29e5-4616-81c7-eafe173ff31f.png)

### 2. SQL 문 
> [코딩테스트 연습(중복 제거하기)](https://programmers.co.kr/learn/courses/30/lessons/59408)
``` MYSQL
select count(distinct NAME) as count  from ANIMAL_INS;
```
![image](https://user-images.githubusercontent.com/42793489/150711416-aad191d9-b3f6-4033-8731-daff8723fcf8.png)

 
 > [코딩테스트 연습(NULL 처리하기)](https://programmers.co.kr/learn/courses/30/lessons/59410)
``` MYSQL
SELECT ANIMAL_TYPE, IFNULL(NAME,"No name") as NAME,SEX_UPON_INTAKE from ANIMAL_INS;
```
![image](https://user-images.githubusercontent.com/42793489/150717055-8138c239-c101-4313-9ed5-92b568cf0ec4.png)
</div>
</details>

 
 
 <details>
<summary> 2022.2.16(Wen) </summary>
<div markdown="1">
 
 앞써 설치한 nginx 웹서버만으로는 동적인 페이지 구현이 어렵습니다. 여기서 동적인 페이지라 함은 접속할때마다 변하는 페이지를 의미합니다. 그래서 로그인과 게시글 등록이란 것 할 수 있지요. 로그인이나 게시글 등록을 할때마다 페이지가 변하는... 그런 페이지가 바로 동적인 페이지입니다. 어째거나 웹서버의 역할은 정적인 html 웹문서 파일을 웹브라우저에 전송해주는 역활만 하거든요.



로그인과 게시글 등록을 하기위해서는 동적인 페이지 구현이 필요합니다. 또 동적인 페이지를 구현하기위해서는 웹서버 이외의 외부 프로그램에서 처리하는 방법을 사용합니다. 웹서버에서 요청을 받아 그 요청을 외부 프로그램에 넘겨주면, 외부 프로그램은 프로그램 파일을 읽어 html로 반환하는 단계를 거치게 됩니다. 이것을 CGI 라고 합니다. 우리가 설치해볼 php-fpm도 CGI에 해당됩니다.



php 프로그램, php 언어는 아는데.. php-fpm는 뭔가요? PHP FastCGI Process Manager의 약자입니다. FastCGI는 위에서 말한 CGI보다좀더 빠른 버전이라고 할 수 있습니다. CGI는 요청할때마다 새로운 프로세스 생성하여 구동하게 되는 데.. 이렇게 되면 부하가 심할뿐만 느려지게 되어있습니다. 하지만 FastCGI은 요청할때마다 새로운 프로세스 생성하는 것이 아니라 이미 생성한 프로세스를 재활용하는 방법을 사용합니다. 때문에 처리가 빠르다는 장점이 있습니다.



apache의 경우에는 apache용 php 모듈이 있어서 자체적으로 처리하게 되어있습니다. 하지만 nginx에는 그런 모듈따윈 없습니다. 때문에 php-fpm를 따로 설치해서 nginx와 연동시켜야 합니다.


 
 phhmyadmin phpmyadmin이란?
mysql을 GUI로 관리할 수 있는 무료 소프트웨어 도구이다.
 웹기반으로 mysql을 제어할 수 있는 mysql-client
 </div>
</details>
