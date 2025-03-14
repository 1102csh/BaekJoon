# No.8320 직사각형을 만드는 방법

## 문제
상근이는 변의 길이가 1인 정사각형 n개를 가지고 있다. 이 정사각형을 이용해서 만들 수 있는 직사각형의 개수는 총 몇 개일까?<br>
두 직사각형 A와 B가 있을 때, A를 이동, 회전시켜서 B를 만들 수 없으면, 두 직사각형은 다르다고 한다. <br>
직사각형을 만들 때, 정사각형을 변형시키거나, 한 정사각형 위에 다른 정사각형을 놓을 수 없다. 또, 직사각형은 정사각형으로 꽉 차있어야 한다.<br>

## 입력
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

## 출력
만들 수 있는 직사각형의 개수를 출력한다.

## 예제
<table>
  <tr>
  <th>예제 입력 1</th>
  <th>예제 출력 1</th>
  </tr>
  <tr>
    <td>6</td>
    <td>8</td>
  </tr>
</table>

## 풀이

![image](https://github.com/user-attachments/assets/861e40ef-b7d1-4374-837d-b47ccf25e2e5)<br>
다음과 같은 조건을 생각하며 풀어보았다.<br>
* 한 변의 길이가 정사각형의 개수 n을 넘을 수 없다.<br>
* 길이 * 높이 < n<br>
이렇게 생각한 후 중복을 어떻게 처리할까 고민하였다.<br>

## 느낀점
이번 문제는 처음에는 어떻게 해야할까? 고민하게 만들었다. 이럴때 나는 단순히 그림을 통해 크게 바라보곤 한다. <br><br>
![image](https://github.com/user-attachments/assets/91b3e487-ef26-40e9-860b-c4f23a069034)<br>
크게 바라보고 순서대로 단계별로 생각하면 쉽게 생각할 수 있는 것 같다.
