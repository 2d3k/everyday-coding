문제: 정수를 요소로 갖는 배열을 입력받아 3개의 요소를 곱해 나올 수 있는 최대값을 리턴

---
설계
1. 배열을 오름차순으로 정렬한다.
2. 배열의 끝에 있는 가장 큰 값 3개의 값을 곱한다.
3. 음수도 있기 때문에 가장 마지막값과 음수 중에 가장 작은 값(절대값으로 따지면 음수 중 가장 큰 값) 2개를 곱한다.