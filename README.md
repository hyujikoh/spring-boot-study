# π[Spring-boot-study-challenge](https://softsquared.notion.site/Spring-Boot-2c133315be4e4e78a5bdf8514cb28bcd)
   
<details>  
<summary> 2022.1.3(Mon)</summary>
<div markdown="1">
  
## πJAVAμ μΈμ΄μ  νΉμ±μ μ°Ύμλ³΄κ³  μ λ¦¬νκΈ°
        
  
### 1. λ©λͺ¨λ¦¬ κ΄λ¦¬ μ©μ΄
- κΈ°μ‘΄μ CμΈμ΄ κ°μ΄ point λ³μλ₯Ό ν΅ν΄ λ©λͺ¨λ¦¬λ₯Ό κ΄λ¦¬μν΄λ μλμΌλ‘ λ©λͺ¨λ¦¬ κ΄λ¦¬κ° κ°λ₯νλ€.
### 2. κ°μ²΄ μ§ν₯ μΈμ΄
- κ°μ²΄λ₯Ό λ§λ€κΈ° μν΄ ν΄λμ€λ₯Ό μμ±ν΄μΌνκ³ , κ°μ²΄μ κ°μ²΄λ₯Ό μ°κ²°ν΄ λͺ©μ μ λ§λ νλ‘κ·Έλ¨μ λ§λ€μ΄μΌνλ€.
### 3. μ΄μμ±μ΄ λλ€.
- JAVAλ‘ κ°λ°λ νλ‘κ·Έλ¨μ JREμ΄ μ€μΉλμ΄μλ λͺ¨λ  OSμμ μ€νμ΄ κ°λ₯νλ€.
### 4. λ©ν°μ€λ λ μ§μ
- μλ° μμ²΄κ° Thread μμ± λ° μ μ΄μ κ΄λ ¨λ λΌμ΄λΈλ¬λ¦¬ api μ κ³΅νκΈ° λλ¬Έμ λ³΄λ€ Multi Thread κ΅¬νμ΄ κ°λ₯νλ€.
### 5. λμ λ‘λ© μ§μ
- νλ‘κ·Έλ¨ μ€νμ λͺ¨λ  κ°μ²΄ μμ±νμ§ μκ³ , κ°μ²΄κ° νμν μμ μ λμ λ‘λ©ν΄μ κ°μ²΄ μμ±νλ€.
μ μ§λ³΄μ ν  μ ν΄λΉ ν΄λμ€λ§ μμ νλ©΄ λλ―λ‘ μ μ§λ³΄μμ μ©μ΄νλ€.
 
</div>
</details>

 
 
<details>
<summary> 2022.1.4(Tue)</summary>
<div markdown="1">

## πλ³μ/ μμ/ μλ£ν/ νΉμλ¬Έμ + λ°±μ€λ¬Έμ  νμ΄
 
### 1. λ³μ
 - λ°μ΄ν°λ₯Ό μ μ₯νλ κ³΅κ°μ λ³μλΌ νλ€. 
 - λ³μλͺμ μ«μλ‘ μμν  μ μλ€. 
 - _μ $ λ¬Έμ μ΄μΈμ νΉμ λ¬Έμ μ¬μ©ν  μ μλ€. 
 - JAVA ν€μλλ λ³μλͺμΌλ‘ μ¬μ©ν  μ μλ€.
### 2. μμ
 - λ³νμ§ μκ±°λ μΌμ ν κ°μ κ°μ§ μμ μμ μλ§νλ€. μ£Όλ‘ Final ν€μλλ₯Ό μ¬μ©νμ¬ μ μΈνλ€. 
 Ex) final double PI = 3.141592; // finalλ‘ double λ°μ΄ν° νμ λ³μλͺ PI λ₯Ό 3.141592λ‘ μμμ μΈμ νμλ€.
### 3. μλ£ν 
 - νλ‘κ·Έλλ°μ ν  λ μ°μ΄λ μ«μ, λ¬Έμμ΄ λ±μ μλ£ ννλ‘ μ¬μ©νλ κ²λ€μ μλ―Ένλ€. 
 - λΌλ¦¬νμ : boolean (1λ°μ΄νΈ, True or False)
 - λ¬Έμνμ : char (2λ°μ΄νΈ)
 - μ μνμ : byte (1λ°μ΄νΈ), short (2λ°μ΄νΈ), int (4λ°μ΄νΈ), long(8λ°μ΄νΈ)
 - μ€μνμ : float(4λ°μ΄νΈ), double(8λ°μ΄νΈ)
### 4. νΉμλ¬Έμ
- μλ°μμ μΆλ ₯λ¬Έμμ νΉμλ¬Έμκ° λμ€λκ²½μ°, κ·Έ λ€μ λ¬Έμλ₯Ό μΈμν΄ μν©μ λ§κ² μ²λ¦¬νλ Escape Sequenceλ₯Ό ν΅ν΄ μ²λ¦¬νλ€.    
 
| μλ ₯ | μΆλ ₯ |    
| :---: | :----: |    
| \ | μλ¬ |    
| \\ | \ |
| \' | ' |
| \" | " |
| ( | ( |
| \( | Error |
| / | / |
| \/ | Error |
| \n | μ€ λ°κΏ |
| \r | μ€ λ§¨ μ²μμΌλ‘ |
| \t | tab |
| \b | λ°±μ€νμ΄μ€ |
| \0 | λΉ μΉΈ |
### 5. λ°±μ€λ¬Έμ  νμ΄ 
 - λ°±μ€ λ¨κ³1 μμΆλ ₯κ³Ό μ¬μΉμ°μ° 11λ¬Έμ  νμ΄ μλ£    
 
 ![λ°±μ€_κΈ°λ³Έ](https://user-images.githubusercontent.com/42793489/148000764-9ba92dcf-48f3-4a84-abe1-2bd36a94d261.PNG)

</div>
</details>

<details>
<summary> 2022.1.5(Wen)</summary>
<div markdown="1">    

 
## πμ°μ°μ/μ‘°κ±΄λ¬Έ/λ°λ³΅λ¬Έ1 + λ°±μ€λ¬Έμ  νμ΄    
 ### 1. μ°μ°μ
 - μ°μ°μμ μ°μ°μλ₯Ό ν΅ν΄ νλμ κ°μ μ°μΆνλ€.
 - νΌ μ°μ°μμ μμ λ°λΌ λ¨ν­ μ°μ°μ, μ΄ν­μ°μ°μ, μΌν­ μ°μ°μλ‘ κ΅¬λΆλμ΄μ§λ€.
 - μ°μ°μ μ’λ₯
 
 | μ°μ°μ μ’λ₯ | μ°μ°μ | νΌμ°μ°μμ | μ€λͺ |   
 | :---: | :----: | :----: | :----: |  
 | μ°μ μ°μ° | +,-,*,/,% | μ΄ν­ | μ¬μΉμ°μ° λ° κ³μ° |
 | λΆνΈ | +,- | λ¨ν­ | μ μ, μ€μ νμμ λΆνΈ |
 | λ¬Έμμ΄ | + | μ΄ν­ | λ¬Έμν λ³μ 2κ°λ₯Ό μ°κ²°μν΄ |
 | λμ μ°μ° | =,+= ,-=, *=, <<= ...etc | μ΄ν­ | μ°λ³μ κ°μ μ’λ³ λ³μμ λμ |
 | μ¦κ° μ°μ° | ++, -- | λ¨ν­ | 1λ§νΌ μ¦κ°/ κ°μ |
 | λΉκ΅ μ°μ° | ==, !=, <, >, <= ..etc | μ΄ν­ | μ’ μ°λ³ κ° λΉκ΅ |
 | λΌλ¦¬ μ°μ° | !, &, ||, &&| μ΄ν­,λ¨ν­ | λΌλ¦¬μ  NOT, AND, OR μ°μ° |
 | μ‘°κ±΄ μ°μ° | (μ‘°κ±΄μ)? A : B | μΌν­ | μ‘°κ±΄μμ λ°λΌ μ°ΈμΌκ²½μ° A, κ±°μ§μ΄λ©΄ B |
 | λΉνΈ | ~,&,^ | λ¨ν­, μ΄ν­ | λΉνΈμ NOT, AND, OR μ°μ° |
 | λΉνΈ μ¬ννΈ | >>,<<,>>> | μ΄ν­ | λΉνΈλ₯Ό μ’ or μ°μΈ‘μΌλ‘ μ΄λ |
 
 - μ°μ° μ°μ μμ  
 1. λ¨ν­ - μ΄ν­ - μΌν­ μμΌλ‘ μ°μ μ΄μ κ°λλ€.
 2. μ°μ  - λΉκ΅, λΌλ¦¬ - λμ μ°μ°μ μμΌλ‘ μ°μ μμ κ°λλ€.
 ### 2. μ‘°κ±΄λ¬Έ
 - νλ‘κ·Έλλ°ν  λ μΌμ΄ λ  μ μλ μν©μ‘°κ±΄μ νλ¨ν΄μ κ·Έ μν©μ λ§κ² μ²λ¦¬νλκ²μ΄ μ‘°κ±΄λ¬Έμ΄λ€. 
 
 ##### <h4> 2-1 ifλ¬Έ
 - if(μ‘°κ±΄λ¬Έ)μ μ¬μ©ν μ‘°κ±΄λ¬ΈμΌλ‘ μ°Έκ³Ό κ±°μ§μ νλ¨νλ€.
 - else if λ₯Ό μ¬μ©νμ¬ λ€μ€μ‘°κ±΄ νλ¨μ κ°λ₯νκ² νλ€. 
 - if μ else if μ‘°κ±΄μ μΆ©μ‘± λͺ»νλ μ‘°κ±΄λ€μ else λ¬Έμ₯μΌλ‘ μνλλ€.
 
 
 ##### <h4> 2-2 switch/caseλ¬Έ
 - μλ ₯λ³μμ κ°κ³Ό μΌμΉνλ case μλ ₯κ°μ λ°λΌ ν΄λΉ case λ¬Έμ μν λ¬Έμ₯μ΄ μ€νλλ€. case λ¬Έμ₯μμ break λ¬Έμ₯μ ν΅ν΄ case λ¬Έμ₯ μ€ν λ€ switch λ¬Έμ λΉ μ Έ λκ°λ€.
 - μλ ₯κ°μ΄ μ νν λμ΄μλ κ²½μ°μλ switch/case λ¬Έμ₯μ μ¬μ©νλκ²μ΄ νΈλ¦¬νλ€. 
 
 ### 3. λ°±μ€λ¬Έμ  νμ΄
 - if λ¬Έ λ°±μ€ 5λ¬Έμ 
 
 ![λ°±μ€_ifλ¬Έ](https://user-images.githubusercontent.com/42793489/148174171-5dd8016e-bf28-4cda-a71d-c2da6c8118f7.PNG)

 
 - while λ¬Έ λ°±μ€ 3λ¬Έμ 
 
 ![λ°±μ€_whileλ¬Έ](https://user-images.githubusercontent.com/42793489/148174178-8cbb3950-6702-42c3-bbcb-43e578a23643.PNG)

</div>
</details>
 
 
<details>
<summary> 2022.1.6(Tur)</summary>
<div markdown="1">  
 
 ## πμ°μ°μ/μ‘°κ±΄λ¬Έ/λ°λ³΅λ¬Έ2 + λ°±μ€λ¬Έμ  νμ΄ 
 ### 1. λ°λ³΅λ¬Έ
 ##### <h4> 1-1 while λ¬Έ
 - μ‘°κ±΄μ΄ μ°ΈμΈ λμ whileλ¬Έ μλμ λ¬Έμ₯μ λ°λ³΅νμ¬ μννλ€. 
 - whileλ¬Έ κ°μ λ‘ λ©μΆ°μΌ νλκ²½μ° break νΈμΆνμ¬ while λ¬Έ λΉ μ Έ λκ°κ² νλ€.
 - while λ¬Έ μ‘°κ±΄λ¬ΈμΌλ‘ λμκ°κΈ° μν΄ continue λ₯Ό νΈμΆνμ¬ λ€μ whileλ¬ΈμΌλ‘ λμκ°λ€.
 
 ##### <h4> 1-2 for λ¬Έ
 - μΈλ―Έμ½λ‘ (;)μΌλ‘ κ΅¬λΆμ νλ€. 
 - whileλ¬Έκ³Ό λμΌνκ² continueλ₯Ό μ¬μ©ν΄μ for λ¬Έ μ²μμΌλ‘ λμκ°μ μ¬μ©μ΄ κ°λ₯νλ€. 
 
  ### 2. λ°±μ€ forλ¬Έ λ¬Έμ νμ΄
 
 ![λ°±μ€_forλ¬Έ](https://user-images.githubusercontent.com/42793489/148317500-8c39860d-2a55-4042-85b5-ea51ab1856c5.PNG)

 </div>
</details>
 
<details>
<summary> 2022.1.7(Fri)</summary>
<div markdown="1">  
 
 ## πκ°μ²΄μ§ν₯ νλ‘κ·Έλλ°, ν΄λμ€μ μΈμ€ν΄μ€ κ°λ μμλ³΄κ³  μ€μ΅νκΈ°
 ### 1. κ°μ²΄μ§ν₯ νλ‘κ·Έλλ° 
 - CμΈμ΄μ²λΌ μ€ννκ³ μ νλ μ μ°¨λ₯Ό μ νκ³ , μ μ°¨λλ‘ νλ‘κ·Έλλ° νλ λ°©λ²μ μ μ°¨μ§ν₯ νλ‘κ·Έλλ°μ΄λΌκ³  νλ€. κ·Έλ¬λ. νμ€μμλ λ¨μν μΌλ ¨μ νμκ° μλλΌ κ° λ¬Όμ²΄ κ°μ κ΄κ³, μνΈμμ© λ± ν¨μ¬ λ³΅μ‘νκ² κ΅¬μ±λμ΄ μλ€.
 - κ°μ²΄ μ§ν₯ νλ‘κ·Έλλ°μ μ μ°¨ μ§ν₯ νλ‘κ·Έλλ°μ μ΄λ¬ν λ¨μ μ κ·Ήλ³΅νκ³  λ¬Όμ²΄λ₯Ό κ°μ²΄λ‘ νννκ³ , κ΄κ³, μνΈ μμ©μ νλ‘κ·Έλ¨μΌλ‘ λνλΈλ€.
 - μνκΈ°λ₯Ό κ°μ²΄ μ§ν₯ νλ‘κ·Έλ¨μΌλ‘ κ΅¬ννλ©΄, κ΄λ ¨ λ¬Όμ²΄λ€μ κ°μ²΄λ‘ μΆμΆνκ³ , μ΄λ€μ μνΈμμ©μ νμν ν¨μ(λ©μλ)μ λ³μ(νλ)λ₯Ό μ€κ³λ₯Ό λ° κ΅¬ννλ€.
 
 ### 2. ν΄λμ€μ μΈμ€ν΄μ€
 - ν΄λμ€λ κ°μ²΄λ₯Ό λ§λ€μ΄ λ΄κΈ° μν μ€κ³ νΉμ νμ΄λ€.
 - ν΄λμ€μ μ μΈλ λͺ¨μ κ·Έλλ‘ μμ±λ μ€μ²΄κ° κ°μ²΄μ΄λ€. μ΄λ¬ν μ°μ λ‘ κ°μ²΄λ₯Ό ν΄λμ€μ μΈμ€ν΄μ€λΌκ³ λ λΆλ₯Έλ€.
 - νλμ ν΄λμ€μ μ¬λ¬κ°μ κ°μ²΄λ€μ΄ μμ±λ μ μλ€. κ° κ°μ²΄λ€μ λμΌν μμ±μ κ°μ§κ³  μμ§λ§, μμ λ§μ κ³ μ ν κ°μ κ°μ§μΌλ‘ κ΅¬λΆλλ€. 
 
 ### 3. μ€μ΅
 
 <details>

<summary> λ°±μ€λ¬Έμ  1712λ² μμ΅λΆκΈ°μ  κ³μ° λ¬Έμ  class λ₯Ό μ΄μ©ν΄μ νμ΄</summary>
<div markdown="2">
 
 - μμ€μ½λ
 
 ![λ°±μ€_μμ΅λΆκΈ°μ _ν΄λμ€μ¬μ©_code](https://user-images.githubusercontent.com/42793489/148509965-4e62239e-30f5-4e68-a779-d803c1ef13a8.PNG)

 - λ¬Έμ νμ΄ κ²°κ³Ό 
 
 ![λ°±μ€_μμ΅λΆκΈ°μ _ν΄λμ€μ¬μ©](https://user-images.githubusercontent.com/42793489/148510001-6c265268-b73e-44ee-b1d1-a96346804a60.PNG)
 </div>
</details>
 
 <details>

<summary> λ°±μ€λ¬Έμ  2292λ² λ²μ§ λ¬Έμ  class λ₯Ό μ΄μ©ν΄μ νμ΄</summary>
<div markdown="2">
 
 - μμ€μ½λ
 
![λ°±μ€_λ²μ§_code](https://user-images.githubusercontent.com/42793489/148516881-8c9ee82a-d531-47c7-8a88-56766f85672b.PNG)


 - λ¬Έμ νμ΄ κ²°κ³Ό 
 
 ![λ°±μ€_λ²μ§](https://user-images.githubusercontent.com/42793489/148516904-5ace6ae7-b6e2-4b3c-b5f2-a2c7682bc602.PNG)


 </div>
</details>

 </div>
</details>
 
 
  
<details>

<summary> 2022.1.8(Sat) </summary>
<div markdown="1">
 
 ## π μμ / μΊ‘μν / λ€νμ±
 
 ### 1. μμ
 - μμ ν΄λμ€κ° λΆλͺ¨ ν΄λμ€μ κΈ°λ₯μ κ·Έλλ‘ λ¬Όλ € λ°μ μ μλ κ²μ΄ μμμ΄λ€.
 - λΆλͺ¨ ν΄λμ€μ private μ κ·Ό μ νμ κ°λ νλ λ° λ©μλλ μμμ΄ λ¬Όλ €λ°μμ μλ€.
 - μμ λ°κ³ μ νλ μμ ν΄λμ€ μμ extends ν€μλλ₯Ό λΆμ΄κ³ , μμν  λΆλͺ¨ ν΄λμ€λ₯Ό μμ±νλ€.
 ``` JAVA
 public class parent {};
 public class Child extends parent {}:
 ```
 
 - μμν  λΆλͺ¨λ μ€μ§ 1λͺ λΏμ΄λ€. λ€μμ λμνμ§ μλ μ½λμ΄λ€.
 ``` JAVA
 public class parent {};
 public class parent2 {};
 public class Child extends parent, parent2 {}:
 ```
 
 ### 2. μΊ‘μν
 - λ³μμ ν¨μλ₯Ό νλμ ν΄λμ€λ‘ λ¬Άκ³  μΈλΆμμ μ½κ² μ κ·Όνμ§ λͺ»νλλ‘ νλκ² μλνκ° ν΅μ¬μ΄λ€. 
 - μΈλΆμμ κ°μ²΄ μ κ·Όνλλ° μμ΄μ μ λ³΄λ₯Ό μ¨κΈ°κ³  κ°μ²΄μ μ°μ°μ ν΅ν΄μλ§ μ κ·Όκ°λ₯νκ² νλκ²μ΄λ€. 
 - μΈλΆμμ νΉμ  κ°μ²΄μ λ°μ΄ν° λ° ν¨μλ₯Ό μ§μ  μ κ·Όμ λ§μμΌλ‘μ¨ λ³κ²½μ λͺ»νκ² νκ³  μμ€ν νμ₯μ μ€λ₯λ₯Ό μ΅μν ν  μ μλ€λ μ μμ μλνλ μ₯μ μ΄ λλ€. 
 - μΊ‘μνλ₯Ό μν μ κ·Ό μ μ΄μ
  ``` JAVA
 public class parent1 {
     private int val1; // λμΌν ν΄λμ€μμμλ§ μ κ·Όμ΄ κ°λ₯νκ³ , μΈλΆμμλ μ κ·Όμ΄ λΆκ°λ₯νλ€.
 }; // λ€λ₯Έν¨ν€μ§μμ μΈμ€ν΄μ€(κ°μ²΄) μμ±κ°λ₯νλ€.
 private class parent2 {}; //λμΌν ν΄λμ€μμμλ§ μ κ·Όμ΄ κ°λ₯νκ³ ,  μμμ μλλ€.
 protected class parent3 {}; //λμΌν ν¨ν€μ§ μμμ μ¬μ©κ°λ₯νκ³ , λ€λ₯Έ μΈλΆ ν¨ν€μ§λΌλ μμλ°μ ν΄λμ€μλ μ κ·Ό κ°λ₯ 
 ```
 ### 3. λ€νμ± 
 - νλμ κ°μ²΄κ° μ¬λ¬ νμμ κ°μ§μμλ νΉμ§μ λ€νμ±μ΄λΌκ³ νλ€.
 - JAVA μμ λ€νμ±μ λΆλͺ¨ ν΄λμ€ νμμ μ°Έμ‘° λ³μλ‘ μμ ν΄λμ€ νμμ μΈμ€ν΄μ€λ₯Ό μ°Έμ‘°ν  μ μλλ‘ κ΅¬νλκ³  μλ€.
 - JAVA μμ λΆλͺ¨ν΄λμ€λ λ€μ€μμμ μ§μνμ§ μμ§λ§, μΈν°νμ΄μ€λ λ μΆμμ μ΄κΈ°λλ¬Έμ μ¬λ¬ μΈν°νμ΄μ€λ₯Ό μμλ°λ λ€μ€ μμμ μ§μνλ€.
 ``` JAVA
 public class child {};
 public class parent {};
 public class child extends parent implements parents1, parents2 {}: // child κ°μ²΄λ parents ν΄λμ€μ κ°μ²΄μ΄λ©΄μ, parents1, parents2 μΈν°νμ΄μ€μ κ°μ²΄μ΄κΈ°λ νλ€. 
 ```
 </div>
</details>

<h1> νλ‘κ·Έλ¨ μ€νλμ€ readme νμΌμ΄ λ λΌκ°μ 1/9~ 1/12μΌ κΈ°λ‘μ΄ μμ΄μ‘μ΅λλ€ μ‘°μν λ³΅κ΅¬ νκ² μ΅λλ€ .</h1>
 
<details>

<summary> 2022.1.13(Tru) </summary>
<div markdown="1">

## πμλ° νλ‘κ·Έλλ° μ€μ΅

### 1. νλ‘κ·Έλ¨ μκ°

- νλ‘κ·Έλλ¨Έμ€ λ¬Έμ  [λ©μ©‘ν μΌκ°ν](https://programmers.co.kr/learn/courses/30/lessons/62048?language=java) νμ΄

- [μμ€μ½λ](https://github.com/hyujikoh/spring-boot-study/blob/main/spring-boot/src/spring_boot.java)

- κ²°κ³Ό </br>
 ![image](https://user-images.githubusercontent.com/42793489/149349512-1ac7adae-95bc-4fde-a83a-4bebc23f27fd.png)

- μμ¬μ΄μ  </br>
ν΄λΉ λ¬Έμ λ₯Ό guiλ‘ κ΅¬νμ νλ©΄ μ’λ νλμ μμλ³΄κΈ° μ¬μ΄ νλ‘κ·Έλ¨λΌλκ±Έ μκ²λμμ§λ§ κ΅¬ννμ§ λͺ»νκ²μ΄ μμ¬μμ΄ λ¨μμ΅λλ€.</br>

 
 </div>
</details>

 
<details>

<summary> 2022.1.14(Fri) </summary>
<div markdown="1">

## π μ€νλ§λΆνΈ κ°λ μ°Ύμλ³΄κ³  μ λ¦¬νκΈ°


### μ€νλ§
- κ°λ    
 μλ°λ₯Ό κΈ°λ°μΌλ‘ ν μΉ μ΄νλ¦¬μΌμ΄μ νλ μμν¬ 

- νΉμ§
  - λ΄μ₯λ μλ²(ex. tomcat, apache λ±...) μ κ³΅ν΄μ λμ§ μ€νμ΄ κ°λ₯ν μ΄ν κ°λ°μ μ§μνλ€.      
  - λ€μν starter  μ κ³΅νμ΄ λΉλ λκ΅¬ κ΅¬μ±μ λν΄μ κ°μν κ°λ₯
  - actuator  μ΄νμ λν λͺ¨λν°λ§κ³Ό κ΄λ¦¬λ₯Ό λ³΄λ€ μ½κ² ν  μ μλ€. 
 - μ€νλ§ λΆνΈ μ μ© μ λ¬΄μ λν΄ μ°¨μ΄    
   - μλ κ²½μ° μ€νλ§ web , mvc, jsonκ°μ΄ λΌμ΄λΈλ¬λ¦¬ μμ‘΄μ± λ€μ μΆκ°ν΄μΌνλ€. λ, μμ‘΄μ± κ΄λ¦¬ , μλ² μ€μ  κ°λ° ν λΉλ, λ°°ν¬ ν  λ μ¬λ¬κ°μ§ μ€μ λ€μ μ§μ  λ€ μ§ννλκ²μ΄ λ¨μ     
   - μλ κ²½μ° μΌλ° μλ° μ΄νλ¦¬μΌμ΄μ ννλ‘ λΉλ λ°°ν¬κ° κ°λ₯ν ννλ‘ μ€νλ§ λΆνΈ νλ‘μ νΈλ₯Ό λ§λ€μμλ€. λ, κ°λ°ν λ μ¬μ©λλ μλ²κ° κΈ°λ³Έμ μΌλ‘ λ΄μ₯ λμ΄μκ³ ,    
 λ°λΌμ λ³λμ ν°μΊ£ μ€μ μ web.xmlμ΄λ μλ² μ€μ μμ νμ§ μλλ€.
 μ€νλ§ λΆνΈλ starter λ₯Ό μ κ³΅νκΈ° λλ¬Έμ μΉμ΄νμ νμν κΈ°λ³Έ λΌμ΄λΈλ¬λ¦¬λ₯Ό ν¬ν¨νκΈ° λλ¬Έμ μμ‘΄μ±κ³Ό κ°μ λ³λμ μ€μ μ ν  νμκ° μλ€
 
 - κΈ°λ₯ : starter , auto configuration, actuator
   - starter : μ€νλ§μμ μ¬μ©λλ λΌμ΄λΈλ¬λ¦¬λ€μ μμ‘΄ κ΄κ³λ₯Ό λ³΄λ€ κ°νΈνκ² μ€μ  ν  μ μλ€.
   - auto configuration : μ΄νλ¦¬μΌμ΄μ κΈ°λ₯μ λν μλ μ€μ μ μ κ³΅ν¨
   - actuator : μ€νλ§ μ΄νλ¦¬μΌμ΄μμ λͺ¨λν°λ§λ₯Ό νκΈ° μν μν μ κ³΅
 
</div>
</details>

 
 
<details>
<summary> 2022.1.15(Sat) </summary>
<div markdown="1">
 
### IntelliJ μ€μΉ λ° μ€ν

- μ€μΉ λ° κ²°κ³Ό

![image](https://user-images.githubusercontent.com/42793489/149618042-1b2cc886-00b6-4bd6-a9ad-0bd46734ed2b.png)

</div>
</details>
 
 
<details>
<summary> 2022.1.16(Sun) </summary>
<div markdown="1">

## πμ€νλ§λΆνΈ νλ‘μ νΈ κ΅¬μ‘° μ΄ν΄λ³΄κΈ° / μμ‘΄μ± / λ΄μ₯ μΉμλ² / JAR / Application.properties 1 

### 1. πToday's study    
 
1-1. pom.xml μμ±

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
 - JAVA ν΄λμ io.namusori.hello package μμ±ν, application ν΄λμ€ μμ±
 
```
 hello-boot
 > src
   > main
     > java
       > io.namosori.hello
          | application.java // μλ² run, μ€νλ§λΆνΈμ 
          > controller
             | Hellocontroller.java // localhost μλ² μ°κ²°μ μνΈμμ©
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
        return "2022-01-16-μ€νμ§ νμ€νΈ μλ£";
    }
}

```

1-5 μ€νκ²°κ³Ό
 
![image](https://user-images.githubusercontent.com/42793489/149650412-89c21a1e-66f0-4ed2-bb28-b87df2e4f291.png)

### 2. κ³΅λΆν λ΄μ©
 #### Annotation
 μ€νλ§ λΆνΈλ μ΄λΈνμ΄μμ λ€μνκ² μλ κ²μ΄ μ€μνλ€. SpringBootμ μμμ μ μλ¦¬λ @SpringBootApplication μ΄λΈνμ΄μ λΏλ§ μλλΌ, μ€νλ§ λΆνΈ μ΄λΈνμ΄μ λ±μ ν€μλλ‘ κ΅¬κΈλ§ ν΄μ μ€νλ§λΆνΈμμ μμ£Ό μ¬μ©λλ λ€μν μ΄λΈνμ΄μμ μ΄ν΄νκ³  μΈμλμ. 
 
 #### μμ    
 
 pom.xml νμΌ μμ artifactId = spring-boot-starter-parent λ₯Ό μμ λ°μΌλ―λ‘μ  μΊλ¦­ν° μΈμ½λ©μ λν utf-8 μ λν λ²μ  κ·Έλ¦¬κ³  μλ°μ λν λ²μ κ³Ό κ΄λ ¨λ properies μ€μ μ νμ§ μμλ λκ³ , 
 μμ λ°μ spring-boot-starter-parentμ λΆλͺ¨ spring-boot-dependencies μμ κ΄λ ¨ λ²μ  μ€μ  λ΄μ© μ΄ λ€μ΄κ° μκΈ° λλ¬Έμ λ°λ‘ μ€μ μ μν΄λ λλ. 
</div>
</details>
 
<details>
<summary> 2022.1.17(Sun) </summary>
<div markdown="1">
 
## π μ€νλ§λΆνΈ νλ‘μ νΈ κ΅¬μ‘° μ΄ν΄λ³΄κΈ° / μμ‘΄μ± / λ΄μ₯ μΉμλ² / JAR / Application.properties 1 

### 1. Today's Study

 - <h3> Spring Boot μ€μ </h3> 
 
   - Spring boot μ¬μ©νμ§ μλλ€λ©΄, κΈ°λ³Έμ μΌλ‘ μΉμλ²(Tomcat, jettyλ±), Servlet μ€μ , web.xml, bean μ€μ  λ± μ λ°μ μΈ configurationμ ν΄μΌνμ§λ§, Spring Boot μμ κΈ°λ³Έμ μΈ μ€μ μ΄ λμ΄μκΈ° λλ¬Έμ λ°λ‘ μ€μ ν  νμκ° μλ€.    
 
   - μ€μ  κ΅¬μ± ν  κ²½μ°   
 
   1. XML νμΌμ ν΅ν μ€μ 
   2. Class κΈ°λ°μΌλ‘ νμ¬ Annotationμ μ€λ€. @configuration Annotationμ μ£Όκ³  νΉμ  bean λ±λ‘νλ©΄ ν΄λΉ bean μ μ€μ μ μν΄ μ¬μ©λλ ν΄λμ€λ€. κ·Έλμ ν΄λΉ ν΄λμ€λ₯Ό λ±λ‘νκ³  @configuration μ μ μ λλ κ·Έ κΈ°λ₯λ€μ ν΅ν΄ μμ§μ΄λ νμν κΈ°λ³Έ μ€μ μ μ§μνλ€.    
 
 - <h3> Annotation </h3>    
 
   1. μ λ  κ³΅λΆν application.java νμΌμμ μΆκ°ν @SpringBootApplication λ¬Έμ₯μ 3κ°μ§ Annotationμ ν¬ν¨νλ€.
   2. @SpringBootConfiguration : @configurationμ΄λΌκ³  μ΄ν΄ν΄μΌνλ€. 
   3. @ComponentScan : νΉμ  ν¨ν€μ§ λΆν° Annotationμ΄ λΆμ ν΄λμ€λ€μ (ex. @service λ±λ±) μ°Ύμμ bean μ λ±λ‘νλκ² μ¦, Spring bean κ°μ²΄λ€μ μ°ΎκΈ° μν΄μ μ¬μ©νλ Annotationμ΄λ€. λ§μ½ λ΄κ° μμλ‘ μμ±ν bean κ°μ²΄λΌλ©΄, μλ₯Όλ€μ΄ μ΄μ  κ³΅λΆμν΄ μΆκ°ν Hellocontroller ν΄λμ€ νμΌμμ @RestControllerλΌλ Annotationμ κ°κ³  μκ³ , @RestControllerλΌλ Annotationμ controllerλΌλ bean λ±λ‘ controller ν΄λμ€μ beanμ΄ λ±λ‘λλ Annotationμ΄λ€ . 
   4. @EnableAutoConfiguration : μλμ€μ  μ§ν Annotation, λ¨Όμ  componentScan μ°λ¦¬κ° λ±λ‘νκ³ μ νλ bean λ€μ΄ μ­ λ±λ‘μ΄ λ κ±°λ€. κ·Έλ¦¬κ³  μ΄ν @EnableAutoConfiguration μ΄ κΈ°λ₯μ ν΅ν΄μ νλ²λ μ»΄ν¬λνΈλ€μ μ€μΊνλ©΄μ bean λ±λ‘μ΄ λκ² λλλ° , κ·Έλ λ±λ‘λ λΉ λ€μ μ€μ μ μν΄ μ¬μ©λλ λ€μν λΉλ€μ΄ λ±λ‘μ΄ λλ€. 

 - <h3> λ΄μ₯ μΉμλ² </h3>
 
   - spring-boot-starter-web μ κΈ°λ³Έ λ΄μ₯μΉμλ²κ° μ€μ λμ΄μκ³ , ν΄λΉ νμΌμ ν΅ν΄ λ΄μ₯ μΉμλ²λ₯Ό λ°λ‘ κ΅¬μΆ μν΄λ λκ³ , κ°λ¨νκ² λ€λ₯Έ μΉμλ²λ‘ λ³κ²½μ΄ κ°λ₯νλ€. 
 
 - <h3> JAR νμΌ </h3>
  
   - μ¬λ¬κ°μ JAVA Class νμΌκ³Ό, κ΄λ ¨ λ¦¬μμ€ λ° λ©νλ°μ΄ν°λ₯Ό νλμ νμΌλ‘ λͺ¨μμ νλ«νΌμ SWλ°°ν¬μ Libaryλ₯Ό λ°°ν¬νκΈ° μν νμΌ ν¬λ§·
</div>
</details>



<details>
<summary> 2022.1.18(Tue) </summary>
<div markdown="1">

## π λ°μ΄ν°λ² μ΄μ€ κ°λ, Mysql μ€μΉ 

### 1. λ°μ΄ν°λ² μ΄μ€ κ°λ
 
 
 
 - λμ μλ―Έμμ, μΌμμν μμμ λμ€λ λ€μν μ λ³΄λ€μ΄ μ¬νμ λ°μ ν κ΄κ³λ₯Ό λ§Ίκ³  μκ³ , μ΄λ¬ν μΌμμ μΈ μ λ³΄λ€μ λͺ¨μ λμκ² μμ²΄λ₯Ό μλ―Ένλ€. μΌλ°μ μΌλ‘ λ°μ΄ν°λ² μ΄μ€ μ μλ κΈ°μ, μ‘°μ§, λλ κ°μΈμ΄ νμμ μν΄ λ°μ΄ν°λ₯Ό μΌμ ν ννλ‘ μ μ₯ν΄ λμ κ²μ μλ―Ένλ€.
 - μ΄ν κ΄λ¦¬ λμμ΄ λλ λ°μ΄ν° μμ΄ λ§μμ§κ³  μ¬λ¬ μ¬λμ΄ λμ μ¬λ¬ μ©λλ‘ μ¬μ©νκ² λλ©΄μ λ¨μν κ°μΈμ΄ κ΄λ¦¬νλ SW λ§μΌλ‘ νκ³μ λΆλͺνλ€. μ΄λ‘μΈν΄ λ§μ μ¬μ©μλ€μ΄ λ³΄λ€ λ°μ΄ν°κ΄λ¦¬, λ°μ΄ν° μμ€ λ°©μ§, κ°μ κΈ°λ³Έμ μΈ μκ΅¬μ¬ν­ λ§μ‘±μν€λ DBMSκ° λμ€κ² λλ€.

### 2. κ΄κ³ν λ°μ΄ν°λ² μ΄μ€
 
 - κΈ°λ₯
   - μ΄μ(ANOMALY) νμ, μ€λ³΅ λ°©μ§
   - λμμ±κ΄λ¦¬, λ³νμ μ΄ 
   - λ©ν λ°μ΄ν° μ΄κ΄κ΄λ¦¬ν  μ μκΈ° λλ¬Έμ, λ°μ΄ν°μ μ±κ²©, μμ± λλ νν λ°©λ² λ±μ μ²΄κ³νλ₯Ό ν΅ν λ°μ΄ν° νμ€ν μ κ³΅
   - μΈκ°λ μΈμ¦λ μ¬μ©μλ§μ΄ μ°Έμ‘°ν  μ μλλ‘ λ³΄μκΈ°λ₯ μ κ³΅
   - μ‘°κ±΄μ μλ°°λλ λ°μ΄ν° μλ ₯, μ€μλ°μ΄ν° μ­μ  λ°©μ§νμ¬ λ°μ΄ν° λ¬΄κ²°μ±(Integrity) λ³΄μ₯
 
 - SQL : κ΄κ³ν λ°μ΄ν°λ² μ΄μ€μμ, λ°μ΄ν° μ μ , λ°μ΄ν° μ‘°μ, λ°μ΄ν° μ μ΄λ₯Ό νκΈ° μν΄ μ¬μ©λλ μΈμ΄.
 
### 3. MYSQL μ€μΉ λ° μ€ν κ²°κ³Ό
 
 - νλ©΄ μΊ‘μ²
![image](https://user-images.githubusercontent.com/42793489/149841846-071eccf6-dabc-4091-a11c-176b335e03c3.png) 

</div>
</details>

 
 
<details>
<summary> 2022.1.19(Wen) </summary>
<div markdown="1">
 

## π Mysql κ΅¬μ‘° λ° μλ² μ μνκΈ°

### 1. λ°μ΄ν°λ² μ΄μ€ κ΅¬μ‘°
 
 - TABLE : κ΄κ³ν λ°μ΄ν°λ² μ΄μ€μ κΈ°λ³Έ λ¨μ, μ΄λ νΉμ ν μ£Όμ μ λͺ©μ μΌλ‘ λ§λ€μ΄μ§λ μΌμ’μ μ§ν©
 - SCHEMA : κ°κ°μ νμ΄λΈμ μ°κ΄μ λ¬΄μ λ°λΌ κ·Έλ£Ήν νκ³ , μλ κ²½μ° νμ΄λΈμ λΆλ¦¬νμ¬ νννλ κ΅¬μ‘°
  - λ΄λΆ SCHEMA : λ°μ΄ν°λ² μ΄μ€κ° λ¬Όλ¦¬μ μΌλ‘ μ μ₯λ νμ. λ¬Όλ¦¬μ  μ₯μΉμμ λ°μ΄ν°κ° μ€μ μ μΌλ‘ μ μ₯λλ λ°©λ²μ νννλ μ€ν€λ§
  - κ°λ SCHEMA : λͺ¨λ  μ¬μ©μ κ΄μ  ν΅ν©ν μ μ²΄ DB κΈ°μ ν κ² , DB μ μ μ₯λλ λ°μ΄ν°μ μ¬μ©μλ€κ°μ κ΄κ³λ₯Ό νν νλ μ€ν€λ§
  - μΈλΆ SCHEMA : λ°μ΄ν°λ² μ΄μ€μ κ°κ° μ¬μ©μλ μμ©νλ‘κ·Έλλ¨Έκ° μ κ·Όνλ DB μ μνλ μ€ν€λ§
 - DB : μ¬λ¬ μ€ν€λ§λ₯Ό κ·Έλ£Ήν ν κ²μ΄ DB

 ### 2. Mysql μλ² μ μνκΈ°
 
 - bitnami WAMP μ€μΉν Mysql λμ νλμ§ νμΈ
 ![image](https://user-images.githubusercontent.com/42793489/150064279-8347f2ca-13a0-4290-93a5-f21e5ed8a145.png)
 
 - bitnami κ° μ€μΉλ κ²½λ‘μ€ C:\Bitnami\wampstack-8.0.1-0\mysql\bin ν΄λμμ mysql νμΌ cmd μμ μ€ν(κ³μ μ root)νμ¬ mysql μλ² μ μ
![image](https://user-images.githubusercontent.com/42793489/150049511-db0e777d-3c01-4b14-b7aa-c0a2be0372ae.png)
 

 
</div>
</details>
 
 
<details>
<summary> 2022.1.20(Thu) </summary>
<div markdown="1">

## π SQL, νμ΄λΈ κ°λ μμλ³΄κΈ°
 
### 1. SQL 

- κ°λ : κ΄κ³ν DB μμ λ°μ΄ν° μ μ, λ°μ΄ν° μ μ, λ°μ΄ν° μ μ΄ μν΄ μ¬μ©λλ μΈμ΄μ΄λ€.

- SQL λ¬Έμ₯λ€μ μ’λ₯

| λͺλ Ήμ΄ μ’λ₯ | λͺλ Ήμ΄ | μ€λͺ |
| :---: | :----: | :---- |
| λ°μ΄ν° μ‘°μμ΄(DML) | SELECT</br>INSERT</br>UPDATE</br>DELETE | λ°μ΄ν° μ‘°ν κ²μ μν SELECTμ λ°μ΄ν°λ₯Ό μλ‘μ΄ νμ μ§μ΄λ£λ INSERT, λ°μ΄ν° μ­μ μ μμ νλ UPDATE μ DELETE κ°μ΄ λ°μ΄ν° μ‘°νμ λ³νμ κ°νλ λͺνμ΄λ₯Ό DMLμ΄λΌ λ§νλ€  |
| λ°μ΄ν° μ μμ΄(DDL) | CREATE</br>ALTER</br>DROP</br>RENAME| νμ΄λΈκ³Ό κ°μ λ°μ΄ν° κ΅¬μ  μ μνλλ° μ¬μ©λλ λͺλ Ήμ΄. κ΅¬μ‘°λ₯Ό μμ±νκ±°λ λ³κ²½, μ­μ , μ΄λ¦ λ°κΎΈλ λ°μ΄ν° κ΅¬μ‘°μ κ΄λ ¨λ λͺλ Ήμ΄λ€μ DDL |
| λ°μ΄ν° μ μ΄μ΄(DCL) | GRANT</br>REVOKE | λ°μ΄ν°λ² μ΄μ€μ μ κ·Όνκ³  κ°μ²΄ γμ©νλλ‘ κΆνμ μ£Όκ³  νμνλ λͺλ Ήμ΄λ₯Ό DCL |
| νΈλμ­μ μ μ΄μ΄(TCL) | COMMIT</br>ROLLBACK | λΌλ¦¬μ μΈ μμμ λ¨μλ₯Ό λ¬Άμ΄μ DMLμ μν΄ μ‘°μλ κ²°κ³Όλ₯Ό μμλ¨μ(νΈλμ­μ) λ³λ‘ μ μ΄νλ λͺλ Ήμ΄λ₯Ό TCL |
 
### 2. TABLE

- κ°λ : λ°μ΄ν°λ₯Ό μ μ₯νλ κ°μ²΄λ‘μ κ΄κ³ν λ°μ΄ν°λ² μ΄μ€μ κΈ°λ³Έ λ¨μμ΄λ€.

| μ©μ΄ | μ€λͺ |
| :---: | :--- |
| νμ΄λΈ | νκ³Ό μΉΌλΌμ 2μ°¨μ κ΅¬μ‘°λ₯Ό κ°μ§ λ°μ΄ν°μ μ μ₯ μ₯μμ΄λ©°, DBμ κ°μ₯ κΈ°λ³Έμ μΈ κ°λ |
| μΉΌλΌ/μ΄ | 2μ°¨μ κ΅¬μ‘°λ₯Ό κ°μ§ νμ΄λΈμμ μΈλ‘ λ°©ν₯μΌλ‘ μ΄λ£¨μ΄μ§ νλνλμ νΉμ  μμ± |
| ν | 2μ°¨μ κ΅¬μ‘°λ₯Ό κ°μ§ νμ΄λΈμμ κ°λ‘ λ°©ν₯μΌλ‘ μ΄λ£¨μ΄μ§ μ°κ²°λ λ°μ΄ν° |


</div>
</details>

<details>
<summary> 2022.1.21(Fri) </summary>
<div markdown="1">
 
## π Mysql INSERT, SELECT, UPDATE, DELETE μ€μ΅νκΈ°

### νμ΄λΈ κ΅¬μΆ

- springboot λ°μ΄ν°λ² μ΄μ€μ pet νμ΄λΈ κ΅¬μΆ
 
- springboot λ°μ΄ν°λ² μ΄μ€ κ΅¬μΆ λ° pet νμ΄λΈ κ΅¬μΆ

![image](https://user-images.githubusercontent.com/42793489/150477538-e81b555b-90e2-47e8-adfb-a126ee40c357.png)
 
![image](https://user-images.githubusercontent.com/42793489/150477859-32e9b657-f81e-4f87-b112-3cfa7dbdbf35.png)

### INSERT, SELECT, UPDATE, DELETE μ€μ΅
 
- pet νμ΄λΈ INSERT λͺλ Ήμ΄λ‘ λ°μ΄ν° μΆκ°, SELECT λͺλ Ήμ΄λ‘ λ°μ΄ν° μ‘°ν
 
![image](https://user-images.githubusercontent.com/42793489/150478081-af2f0b03-6817-4cdf-88f1-b90c36ae5373.png)

- UPDATE λͺλ Ήμ΄λ‘ λ°μ΄ν° μμ  ( NAME = NACHO λΌλ λ°μ΄ν°μ DEATH μμ± λ°μ΄ν° μΆκ° )

![image](https://user-images.githubusercontent.com/42793489/150478633-02de25e2-9396-42e4-81ef-992538856b17.png)

 - DELETE λͺλ Ήμ΄λ‘ pet νμ΄λΈμ λ°μ΄ν° μ­μ ( sex = m μΈ λ°μ΄ν° μ­μ )

 ![image](https://user-images.githubusercontent.com/42793489/150478846-0e7498d3-1828-44f2-8172-af0c734867d0.png)

</div>
</details>

<details>
<summary> 2022.1.22(Sat) </summary>
<div markdown="1">

## π Mysql JOIN κ°λ μμλ³΄κ³  μ€μ΅νκΈ°

 
### μ¬μ  κ΅¬μΆ
- νμ΄λΈ pet κ³Ό νμ΄λΈ shop λκ°μ νμ΄λΈμ ν΅ν΄ λμΌν μμ± pet name μ ν΅ν΄ join μ΄μ© 
 > ### pet νμ΄λΈ 
![image](https://user-images.githubusercontent.com/42793489/150632737-d4091f24-2d8b-4ea7-8f32-4dbce8f27c5e.png)
 
 > ### shop νμ΄λΈ 
![image](https://user-images.githubusercontent.com/42793489/150632773-67c7855e-8713-4b21-9f58-198bfe4e8b10.png)

 ### π μ€μ΅
 #### (pet.*,shop.shopName,shop.number μΌλ‘ μΆλ ₯)
 
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

## π μμ μ§ννλ Spring Boot λ³΅μ΅ν΄λ³΄κΈ°
 
### user-rest java νμΌ μμ±νμ¬ μ΄λ¦, email, λμνλ idλ₯Ό json ννλ‘ μΆλ ₯

```
 user-rest
 > src
   > main
     > java
       > io.namoosori.rest
          | UserRestApp // μλ² run, μ€νλ§λΆνΈμ 
          > entity
             | user.java // userμ λμνλ id, μλ ₯νλ μ΄λ¦, email μ μΆλ ₯νλ νμ€νΈ java νμΌ
 ```
 
1. pom.xml
``` JAVA
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
 
    <parent> // spring-boot-starter-parent μμμ λ°μ 
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.6.2</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>

    <groupId>io.namoosori</groupId>
    <artifactId>user-rest</artifactId>
    <version>1.0-SNAPSHOT</version>
    
    <dependencies> // μ΄κΈ° μ€μ  μν spring-boot-starter-webκ³Ό user api κ΅¬μΆμν lombok μμ‘΄μ±μ£Όμ
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
        <dependency> //json νμ λ°μ΄ν° μ¬μ© μν gson μμ‘΄μ± μ£Όμ 
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
 
// μ΄κΈ° μ€ν μν java νμΌ
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
        this.id = UUID.randomUUID().toString();/** μ μ κ°μ²΄κ° μμ±λ λλ§λ€ λλ€ν  μμ΄λλ₯Ό λΆμ¬νλ€**/
    }
    public User(String name, String email){
        /** id λ λλ€μΌλ‘ λ§λ€μ΄μ£ΌκΈ° λλ¬Έμ this ();μΌλ‘ νΈμΆνμ¬ μμ΄λλ₯Ό μμ±νκ³  λ§€κ°λ³μλ‘ μ΄κΈ°ν **/
        this();
        this.name = name;
        this.email = email;
    }

    /**μ μ μ λ°μ΄ν°λ₯Ό μ¬λ¬κ°μ§ ννλ‘ μ¬μ©νλ€ . μ°λ¦¬λ insomnia λΌλ restclientλΌλ ν΄λΌμ΄μΈνΈλ‘ λ°μ΄ν°λ₯Ό μ£Όκ³ λ°μκ²μ΄λ€ κ·Έ νμ€νΈλ₯Ό μν΄μ νμν λ°μ΄ν°λ€μ΄ μλ€. μνλ°μ΄ν°λ₯Ό μν΄μ entity μλ€ static λ°μ΄ν°λ₯Ό λ§λ λ€**/
    public static User smaple(){
        return new User("Thomas","dvum0045@gmail.com");
    }
    public static void main(String[] args) {
        User user = new User("kim","kim@gmali.com"); // κ°μ²΄μμ±
        /**λ§μ½ getsetter κ° λμ¨λ€λ©΄ λ§μ½ lombok μ μ²μ μ¬μ©νλ€λ©΄ νλ¬κ·ΈμΈμ μ€μΉν΄μΌνλ€**/
        /**json ννλ‘ μΆλ ₯ // **/
        System.out.println(new Gson().toJson(user));
    }
}

```
 
> ### ν΄λΉ νλ‘κ·Έλ¨ μ€νκ²°κ³Ό
![image](https://user-images.githubusercontent.com/42793489/150667499-20e05e9a-61b5-4790-96e1-245c36863b9b.png)

</div>
</details>

<details>
<summary> 2022.1.23(Mon) </summary>
<div markdown="1">

## π μμ μ§ννλ java κΈ°λ³Έ λ¬Έλ²κ³Ό SQLλ¬Έ λ³΅μ΅νκΈ° 
 
 
### 1. JAVA κΈ°λ³Έ λ¬Έλ² λ³΅μ΅

> [μ½λ©νμ€νΈ μ°μ΅(μ νλ²νΈ λͺ©λ‘)](https://programmers.co.kr/learn/courses/30/lessons/42577)
``` JAVA
// hashmap μ ν΅ν΄ λ¬Έμ  νμ΄
import java.util.HashMap;
import java.util.Map;
class Solution {
    //ν΄μ λ§΅ μ μΈ , ν€κ°μ λ¬Έμν value λ μ μν μ κ°λ ν΄μ κ΅¬μ‘° μμ±
    public boolean solution(String[] phone_book) {
        Map<String,Integer> map = new HashMap<>();

        //2. HashMap μ phone_bookμ μ νλ²νΈλ₯Ό λ£λλ€.
        for(int i=0;i<phone_book.length;i++){
            map.put(phone_book[i],i);
        }
        //λͺ¨λ  μ νλ²νΈμ substringμ΄ hashmapμ΄ μ‘΄μ¬νλμ§ νμΈ
        for(int i=0;i<phone_book.length;i++){
            for (int j=0;j<phone_book[i].length();j++){
                //κ° phone_book[i]μ substring μ μΆμΆνμ¬ κ·Έκ²μ΄ hash κ°μ μ‘΄μ¬νλμ§ μ¬λΆ νλ¨ 
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
// for λ¬Έκ³Ό startwith μΌλ‘ λ¬Έμ  νμ΄
import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        // phoneBook μ λ ¬ 
        Arrays.sort(phone_book);
        //for λ¬Έ μ¬μ© νμ¬ μλ²νΈκ° λ·λ²νΈ μ λμ΄ μΈμ§ νμΈ
        
        for (int i = 0; i < phone_book.length - 1; i++){
          if (phone_book[i + 1].startsWith(phone_book[i])) 
              return false;  
        } 

       
        return true;
    }
}
```
![image](https://user-images.githubusercontent.com/42793489/150726544-5b3a7957-29e5-4616-81c7-eafe173ff31f.png)

### 2. SQL λ¬Έ 
> [μ½λ©νμ€νΈ μ°μ΅(μ€λ³΅ μ κ±°νκΈ°)](https://programmers.co.kr/learn/courses/30/lessons/59408)
``` MYSQL
select count(distinct NAME) as count  from ANIMAL_INS;
```
![image](https://user-images.githubusercontent.com/42793489/150711416-aad191d9-b3f6-4033-8731-daff8723fcf8.png)

 
 > [μ½λ©νμ€νΈ μ°μ΅(NULL μ²λ¦¬νκΈ°)](https://programmers.co.kr/learn/courses/30/lessons/59410)
``` MYSQL
SELECT ANIMAL_TYPE, IFNULL(NAME,"No name") as NAME,SEX_UPON_INTAKE from ANIMAL_INS;
```
![image](https://user-images.githubusercontent.com/42793489/150717055-8138c239-c101-4313-9ed5-92b568cf0ec4.png)
</div>
</details>

 
 
 <details>

