# No.2941 크로아티아 알파벳
문제
예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.

### 크로아티아 알파벳	<br>
č	▶ c=<br>
ć	▶ c-<br>
dž ▶	dz=<br>
đ	▶ d-<br>
lj	▶ lj<br>
nj	▶ nj<br>
š	▶ s=<br>
ž	▶ z=<br>
예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.<br>
<br>
입력<br>
첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.<br>

단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.<br>
<br>
출력<br>
입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.<br>
<br>
예제 입력 1 <br>
ljes=njak<br>
예제 출력 1 <br>
6<br>
예제 입력 2 <br>
ddz=z=<br>
예제 출력 2 <br>
3<br>
예제 입력 3 <br>
nljj<br>
예제 출력 3 <br>
3<br>
예제 입력 4 <br>
c=c=<br>
예제 출력 4 <br>
2<br>
예제 입력 5 <br>
dz=ak<br>
예제 출력 5 <br>
3<br>
## 풀이
입력과 출력을 BufferReader, BufferWriter를 사용하여 구현했다. 결과를 출력할 result와 현재 문자열의 index를 표현하는 index 변수를 생성했다.<br>
![image](https://github.com/user-attachments/assets/16851b1a-de47-451b-8020-55b0e45b2626)<br>
메인 로직은 다음과 같다.<br>
![image](https://github.com/user-attachments/assets/21bc5926-a561-428c-bc49-4055dbbff4c8)<br>
현재 인덱스가 문자열의 길이를 넘지 않는 동안 반복하며 현재 문자가 무엇인지 판별 후 리스트에 있는 문자라면 case 조건문을 통해 다음에 올 문자가 조건에 맞는다면 하나의 단어로 취급한다.<br>
![image](https://github.com/user-attachments/assets/1de3f07a-d147-4cbf-89cb-c28e387a75bb)<br>
마지막에 조건에 부합했다면 현재 문자를 나타내는 index를 그만큼 이동시키고 result를 1만큼 더한다.

## 느낀점
어렵지 않은 문제였지만 문제를 풀고나서 다른사람과 gpt 코드를 보았을 때 또 다른 방법이 있었다.<br>
![image](https://github.com/user-attachments/assets/6abff5e9-b026-4af1-82b2-8cd1bc83093e)<br>
문자열을 치환하는 것이였다.<br> 또한 switch문의 case중 중복되는 조건은 break를 걸지않고 내림으로써 코드를 더 짧게 구성할 수 도 있었다.

