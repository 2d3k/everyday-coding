백준 1110번 (더하기 사이클)

문제
0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.
먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다.
N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

예시
26부터 시작한다. 2+6 = 8이다.
새로운 수는 68이다. 6+8 = 14이다.
새로운 수는 84이다. 8+4 = 12이다.
새로운 수는 42이다. 4+2 = 6이다.
새로운 수는 26이다.
위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.

입력: 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
출력: 첫째 줄에 N의 사이클 길이를 출력한다.

문제 이해
숫자 n을 입력받고 n의 왼쪽과 오른쪽을 더한 숫자와 원래 n의 오른쪽 숫자를 이어준다
반복해서 이어주다가 원래의 숫자 n이 나오면 반복한 회수를 출력한다

설계
1. BR을 사용해서 숫자 n을 입력받는다
2. while (n과 n이 같아질 때까지 반복)
    if (n이 n과 다르다면)
    2-1)n의 오른쪽 숫자를 x로 받는다
    2-2)왼쪽과 오른쪽의 합을 y로 받는다
    반복문의 마지막에 count를 1씩 증가시킨다
3. count의 값을 출력
4. if (n이 0보다 작다면) '0'+n;