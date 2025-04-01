# Comprehend Mobile Robots
## Homework 2 Class and Abstraction

Let Quiz be an abstract class representing a general quiz question.
You are given the main method in the file QuizGame.java, which utilizes three classes:
Quiz, WordQuiz, and NumberQuiz. Implement the following classes so that the program
executes as intended:

<details>
<summary>Korean</summary>
<div markdown="1">

Quiz를 일반적인 퀴즈 문제를 나타내는 추상 클래스라고 합시다. QuizGame.java 파일에는 세 개의 클래스를 활용하는 메인 메서드가 있습니다: Quiz, WordQuiz, NumberQuiz입니다. 다음 클래스를 구현하여
프로그램이 의도한 대로 실행되도록 합니다.

</div>
</details>


### A. Quiz (Abstract Class)
- Declare a String question field.
- Define a constructor that receives a String question.
- Implement a concrete method void askQuestion() that prints the question to the
console.
- Declare an abstract method boolean checkAnswer(String input).

<details>
<summary>Korean</summary>
<div markdown="1">

- 문자열 문제 필드를 선언한다.
- String 질문을 받는 생성자를 정의한다.
- 질문을 콘솔에 출력하는 구체적인 메서드 void askQuestion()을 구현한다.
- 추상 메서드 boolean checkAnswer(String input)를 선언한다.

</div>
</details>

### B. World Quiz (Subclass of Quiz)
- Declare a private field to store the correct answer as a String.
- Implement the constructor with parameters (String question, String answer).
- Override the method checkAnswer to return true if the user input matches the
correct answer (case-insensitive), and false otherwise.


<details>
<summary>Korean</summary>
<div markdown="1">

- 정답을 문자열로 저장할 비공개 필드를 선언한다.
- 매개변수(문자열 질문, 문자열 답변)로 생성자를 구현한다.
- 사용자 입력이 정답과 일치하면 참을 반환하고(대소문자 구분 없음) 그렇지 않으면 거짓을 반환하도록 checkAnswer 메서드를 재정의한다.

</div>
</details>

### C. Number Quiz (Subclass of Quiz)
- Declare a private field to store the correct answer as an int.
- Implement the constructor with parameters (String question, int answer).
- Override the method checkAnswer to return true if the user input, parsed as an
integer, matches the correct answer, and false otherwise.


<details>
<summary>Korean</summary>
<div markdown="1">

- 정답을 정수로 저장하는 비공개 필드를 선언한다.
- 매개변수(문자열 질문, 정답)를 사용하여 생성자를 구현한다.
- 정수로 파싱된 사용자 입력이 정답과 일치하면 참을 반환하고, 그렇지 않으면 거짓을 반환하도록 checkAnswer 메서드를 재정의한다.

</div>
</details>