# No.17413 단어 뒤집기 2

## 문제
문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.<br>
먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.<br>
알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.<br>
문자열의 시작과 끝은 공백이 아니다.<br>
'<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.<br>
태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고, '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다. 단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 연속하는 두 단어는 공백 하나로 구분한다. <br>
태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.

## 입력
첫째 줄에 문자열 S가 주어진다. S의 길이는 100,000 이하이다.

## 출력
첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.

## 예제
<ul>
<li>예제 입력 1 </li>
baekjoon online judge
<li>예제 출력 1 </li>
noojkeab enilno egduj
<li>예제 입력 2 </li>
<open>tag<close>
<li>예제 출력 2 </li>
<open>gat<close>
<li>예제 입력 3 </li>
<ab cd>ef gh<ij kl>
<li>예제 출력 3 </ij>li>
<ab cd>fe hg<ij kl>
</ul>

## 풀이

![image](https://github.com/user-attachments/assets/e0701cab-e5f8-4e98-bac5-a1f6e39f6669)<br>
문자열을 자주 변경하기 위해 StringBuilder를 사용했다. .append()를 사용하여 문자열에 문자를 추가할 수 있다.<br>
<br>
![image](https://github.com/user-attachments/assets/c49c53b3-d924-406a-af9e-accdb586e75a)<br>
입력받은 문자열을 '<'로 나눈다.<br>
만약 <ab cd>ef gh<ij kl>를 입력한다면 {ab cd>ef gh },{li kl>} 이 된다.<br>

![image](https://github.com/user-attachments/assets/68a87147-7a4a-4d59-8c7f-c07a8859a0e8)<br>
작성한 전체적인 코드는 다음과 같다.<br>
<br>
![image](https://github.com/user-attachments/assets/d363584d-931a-4e1c-8829-7c0420f95648)<br>
첫 토큰을 가져와 '>' 문자가 있는 확인한다. 만약 있다면 해당 부분의 인덱스를 체크한 후 시작에 '<' 문자를 추가한 뒤 '>' 문자까지를 저장한다.<br>
<br>
![image](https://github.com/user-attachments/assets/8579491b-0336-4e2c-9b24-8e05d4327990)<br>
공백을 기준으로 문자열을 한번 더 나눈다.<br>
그 이후 삼항연산자를 통해 만약 이전에 태그가 있었다면 closeIndex+1부터 아니라면 closeIndex부터 시작하여 역순으로 출력한다.<br>
만약 다음 토큰이 존재한다면 마지막에 공백을 추가해준다.<br>

## 느낀점
마찬가지로 해결하고 나서 다른사람들의 코드와 gpt에게 평가받았다. 다른 사람들의 경우 stack를 사용하여 조금 더 간결하고 최적화된 코드를 작성하였다.<br>
이 문제는 stack 사용하여 다시 한 번 풀어보아야겠다.
