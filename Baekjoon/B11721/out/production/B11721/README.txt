백준 11721번 (열 개씩 끊어 출력하기)

문제: 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다. 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
입력: 첫째 줄에 단어가 주어진다. 단어는 알파벳 소문자와 대문자로만 이루어져 있으며, 길이는 100을 넘지 않는다. 길이가 0인 단어는 주어지지 않는다.
출력: 입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력한다. 단어의 길이가 10의 배수가 아닌 경우에는 마지막 줄에는 10개 미만의 글자만 출력할 수도 있다.

예제입력
BaekjoonOnlineJudge

예제출력
BaekjoonOn
lineJudge

수도코드
1. BR 사용해서 string str에 입력받음 -> br.close();
2. 줄바꿈을 해 줄 for (1부터 str.length / 10보다 작게)
	
str을 10개씩 나눌 수 있는 방법 -> substring사용

for (0~str.length / 10 )까지 돌림
	if (str.length % 10 == 0)
		substring(10*i + 1, 10*(i+1))

	//필요한지 아닌 지 확실하지 않음	
	else substring (str.length % 10 != 0)
		print("\n")

10의 배수일 때
str.length % 10 == 0
10의 배수가 아니라서 나머지가 남음 -> 엔터가 한번 더 필요함
str.length % 10 != 0

substring 범위 구하는 식
1~ 10
11~20
21~30
31~40
41~50

i가 0부터 str.length/10
i = 0 1

시작
10*i + 1
1	11
끝
10*(i+1)
10	20
