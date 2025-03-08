# 문제 1592번 영식이와 친구들

영식이와 친구들이 원형으로 모여서 시계방향으로 1부터 N까지 적혀있는 자리에 앉는다. <br>
영식이와 친구들은 공 던지는 게임을 하기로 했다. 게임의 규칙은 다음과 같다. 일단 1번 자리에 앉은 사람이 공을 받는다. <br>
그리고 나서 공을 다른 사람에게 던진다. 다시 공을 받은 사람은 다시 공을 던지고, 이를 계속 반복한다. <br>
한 사람이 공을 M번 받았으면 게임은 끝난다. (지금 받은 공도 포함하여 센다.) <br>
공을 M번보다 적게 받은 사람이 공을 던질 때, 현재 공을 받은 횟수가 홀수번이면 자기의 현재 위치에서 시계 방향으로 L번째 있는 사람에게, 짝수번이면 자기의 현재 위치에서 반시계 방향으로 L번째 있는 사람에게 공을 던진다.

공을 총 몇 번 던지는지 구하는 프로그램을 작성하시오.
<br>
<table>
  <tr>
    <th>예제 입력</th>
    <th>예제 출력</th>
  </tr>
  <tr>
    <td>5 3 2</td>
    <td>10</td>
  </tr>
  <tr>
    <td>4 1 3</td>
    <td>0</td>
  </tr>
  <tr>
    <td>10 3 5</td>
    <td>4</td>
  </tr>
  <tr>
    <td>15 4 9</td>
    <td>15</td>
  </tr>
</table>
<br>

## 개발 환경
JAVA, Eclipse IDE <br>

## 학습 내용
오랜만에 사용하는 JAVA라서 구글링 통해 상기하며 진행했다. <br>
전역에서 사용하기 위해 입력받는 값 N,M,L은 static 키워드를 붙였다. <br>
![image](https://github.com/user-attachments/assets/8e7320fc-a0a7-4437-a71e-bdd23a94abdb)

값 입력을 위해 Scanner를 import 하고 생성한다. <br>
![image](https://github.com/user-attachments/assets/f466072b-6fe0-45ee-8f1c-81d2096dcbee) <br>
![image](https://github.com/user-attachments/assets/8bd153ef-f250-41c7-a8b5-e1e3260c6072) 

다음이 메인 로직이다. <br>
![image](https://github.com/user-attachments/assets/6872bf7b-2e76-4aab-9ecd-f3dafe46866e)

배열을 통해 한 사람당 공을 받은 횟수가 얼마인지 관리했으며 현재 공을 가지고 있는 대상을 target 변수를 통해 관리했다. <br>
만약 target이 2라면 공을 가지고 있는 사람은 3번째 사람인 arr[2]이 되는 것 이다. <br>
<br>
![image](https://github.com/user-attachments/assets/3af175e6-95a8-49c7-ad25-b9d5b7be4485) <br>
공을 받은 사람의 횟수를 1 증가시키고 만약 그 횟수가 M보다 크다면 반복문에서 탈출한다. <br>

![image](https://github.com/user-attachments/assets/4d199a02-c720-419e-a98d-1b2a8a3c7a0b) <br>
횟수가 M보다 작다면 받은 횟수가 짝수인지 홀수인지에 따라 시계(+) 반시계(-) 방향으로 L만큼 이동한다. <br>
이는 공을 받은 대상을 가리키는 target 변수에 값을 더하거나 빼서 관리할 수 있다.<br>
target을 더하거나 뺄 때 값이 N보다 크거나 0보다 작으면 안되기 때문에 다음과 같이 조정해준다.<br>
![image](https://github.com/user-attachments/assets/b5a23540-3c42-4918-a5a2-9b33f37a2d45) 

한 번의 반복문이 종료되면 count의 값을 1 증가시켜준다.<br>
마지막으로 반복문에서 탈출했을 때 count값을 return 해준다.<br>
<br>

## 느낀점
어려운 문제가 아니였지만 오랜 기간 사용하지 않은 JAVA에 기본적인 입출력이나 변수, 배열 등의 기억이 가물가물하여<br>
구글링을 통해 JAVA에 대한 기억을 상기시킬 수 있는 기회가 되었다.<br>
