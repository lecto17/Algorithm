#컴퓨팅적 사고 수업 필기

컴파일러 방식 : 프로그램 전체를 한번에 읽어들여 실행 / 번역이 느리지만 실행이 빠름

인터프리터 방식 : 라인 단위로 프로그램을 실행 / 번역이 빠름 but 실행이 느림(shell이 인터프리터 방식)

파이썬은 위 두가지 방식을 지원함, 어떤 것을 사용할지 선택하면 됨.

IDE = (Intergrated Development Environment)통합 개발 환경: 코딩, 디버그, 컴파일, 배포 등 프로그램 개발에 관련된 모든 작업을 하나의 프로그램 안에서 처리하는 환경을 제공하는 소프트웨어이다.


(7 // 2)**5%8 -> 앞에서부터 순서대로

출력값은 ?  -> 3

7 // 2 -> 7 / 2의 소수점을 버린다.

3 ** 5 -> 3의 5제곱


![image](https://user-images.githubusercontent.com/53415000/102231067-e8b3a700-3f30-11eb-83dc-cdbaa7778496.png)

![image](https://user-images.githubusercontent.com/53415000/102231237-18fb4580-3f31-11eb-99c9-4e20677492ad.png)


  
쉘 모드에서 print() 함수 생략가능

파이썬은 큰 따옴표와 작은 따옴표를 구분하지 않는다.
 
 

컴마를 써서 문자열을 이어 쓰는 경우 // 변수를 중간에 사용해야 되는 경우

컴마를 써서 문자열을 이어 쓰면 한글자가 띄어서 출력된다.
 
![image](https://user-images.githubusercontent.com/53415000/102231376-42b46c80-3f31-11eb-9bdc-81157a238b1e.png)
 

 ![image](https://user-images.githubusercontent.com/53415000/102232028-fe759c00-3f31-11eb-9190-9adccc40cab4.png)

 
양식문자를 쓰면 print()함수 안에 형태가 깔끔해진다. 복잡해질 수 있는 문장을 간결하게 한다.


 %는 “문자열”과 변수를 구분하는 것
 ![image](https://user-images.githubusercontent.com/53415000/102232398-688e4100-3f32-11eb-9a0e-1a8cdd4d205e.png)
 ![image](https://user-images.githubusercontent.com/53415000/102232553-9f645700-3f32-11eb-9ae3-1571f38f3f24.png)
  
  
.2f 로 출력하면 소수점 2자리 출력
5.2f로 출력하면 5는 출력하는 전체 숫자의 길이를 5로 한다는 것.
 

 

%4d로 출력하면 출력하는 칸이 4칸이 됨

 
 
![image](https://user-images.githubusercontent.com/53415000/102232664-c0c54300-3f32-11eb-9ba3-1d7aa778ec25.png) 

print함수는 end 파라미터에 개행이 들어가 있어서 자동으로 함수 실행하고 아래 줄로 내려가게 되있다. 따라서 end = ‘ ’ 이렇게 하면 한 칸 뛰고 함수 종료한다.
그래서 대신에 input(“메세지”)로 입력 받는게 보통 방법임.


데이터 타입 변환
![image](https://user-images.githubusercontent.com/53415000/102232749-db97b780-3f32-11eb-99be-88fb03cc3948.png) 
 

![image](https://user-images.githubusercontent.com/53415000/102232947-0e41b000-3f33-11eb-8dc0-a1f029fe14ca.png)

![image](https://user-images.githubusercontent.com/53415000/102233006-1e598f80-3f33-11eb-8f4e-afc255216723.png)

![image](https://user-images.githubusercontent.com/53415000/102233076-34675000-3f33-11eb-867e-636803fb9ff1.png)
 
else 뒤에는 조건 쓰지 않는다.
괄호를 써도 되지만 지저분해서 쓰지 않도록 한다. 대신 들여쓰기로 구분 

 
![image](https://user-images.githubusercontent.com/53415000/102233190-54970f00-3f33-11eb-846f-3cece465486c.png)

pass를 입력하면 아무것도 안하고 넘어감 // pass는 키워드

만약 아무것도 안할려고 비워놓고 넘어간다면 error 발생
 
 
 
![image](https://user-images.githubusercontent.com/53415000/102233331-814b2680-3f33-11eb-826a-0e7e1f46337f.png)

else 문장 안 쓸수도 있음

 
while 1 :  // 무한 반복 while True : 도 됨

 
![image](https://user-images.githubusercontent.com/53415000/102233550-c1120e00-3f33-11eb-915a-eb5100ebb05d.png)

if문에 조건을 저렇게 줄 수도 있음
 

 
아이디어를 구현할 때 절차대로 작업을 해야하는데, 그 순서, 절차를 만드는 것이 ‘순서도’이다.
Flowgorithm – 순서도를 주면 자동으로 순서도에 해당하는 코드를 출력해줌

 문제가 생겼을 때 컴퓨터를 기반으로 해결하려는 것
 

 
컴퓨팅적 사고의 한 분야 / 딥러닝, AI의 기초적인 알고리즘
 
컴퓨팅적 사고의 목적

순서도를 쓰는 이유
1.	프로그램을 작성할 떄 필요
2.	아래 이유
 

 
각각의 모양 중요!

 
 
  변수 선언 안하면 error 출력된다!

 
 
![image](https://user-images.githubusercontent.com/53415000/102233690-e272fa00-3f33-11eb-95dd-d2269af02e5a.png)

![image](https://user-images.githubusercontent.com/53415000/102233805-fcacd800-3f33-11eb-8741-55843c0475cf.png)

![image](https://user-images.githubusercontent.com/53415000/102233966-25cd6880-3f34-11eb-8956-9317539a9278.png)

위 그림을 통해 수열 내에 반복적으로 값을 넣을 수 있음


![image](https://user-images.githubusercontent.com/53415000/102234096-4a294500-3f34-11eb-862c-355456d33c2e.png)

10부터 45까지 5씩 증가, 50은 제외되고 출력됨 만약 print(range(10, 50, 5)) 하면 range(10, 50, 5) 그대로 출력이 됨.


![image](https://user-images.githubusercontent.com/53415000/102234356-8c528680-3f34-11eb-988a-3b8df4bc7860.png)

1부터 10까지 출력됨


![image](https://user-images.githubusercontent.com/53415000/102235072-4ba73d00-3f35-11eb-85ee-b270bcff58ef.png)  

첫번째 그림 : 1 부터 11까지 1씩 증가하며 출력

두번째 그림 : 위와 동일한 내용 출력 

세번째 그림 : 0부터 10 (11 -1 )까지 출력됨


![image](https://user-images.githubusercontent.com/53415000/102234938-21ee1600-3f35-11eb-8b4c-a8545372c3ba.png)


 randint(1,6) //1부터 6까지 숫자중 랜덤한 숫자를출력


![image](https://user-images.githubusercontent.com/53415000/102235334-95902300-3f35-11eb-8526-c3948ed94458.png)
 
두번째(오른쪽) 코드는 else가 출력되지 않음

 

![image](https://user-images.githubusercontent.com/53415000/102235544-c6705800-3f35-11eb-9283-94f68cdd7d38.png)
 
![image](https://user-images.githubusercontent.com/53415000/102235609-d720ce00-3f35-11eb-92a1-01a77f431e2c.png)
 


![image](https://user-images.githubusercontent.com/53415000/102235724-fb7caa80-3f35-11eb-9df2-7afa5df49015.png)

![image](https://user-images.githubusercontent.com/53415000/102235749-00d9f500-3f36-11eb-8900-0beb70709c55.png)



![image](https://user-images.githubusercontent.com/53415000/102235863-2535d180-3f36-11eb-8266-a4579cd43c6a.png)

![image](https://user-images.githubusercontent.com/53415000/102235883-2c5cdf80-3f36-11eb-8770-64cd442e44e6.png)




**for문
for i in range(1, 10): #i가 1부터 10 전까지 반복, i는 1부터 9까지 반복됨.
    print("%d", % i)


**파이썬 현재 날짜 구하기 // 출처: https://yujuwon.tistory.com/entry/현재-날짜-가져오기 [Ju Factory]

from datetime import datetime

datetime.today()            # 현재 날짜 가져오기


datetime.today().year        # 현재 연도 가져오기

datetime.today().month      # 현재 월 가져오기

datetime.today().day        # 현재 일 가져오기

datetime.today().hour        # 현재 시간 가져오기



** int to String


# 내장함수인 str() 함수로

n = 123.456

s = str(n)

print s + "ABC"    # 출력 결과: 123.456ABC



# 키보드 맨 좌측 상단의 Backtick(Backquote:`) 문자로

# 주의! 작은따옴표(홑따옴표)가 아님

n = 123

s = `n`

print s + "ABC"    # 출력 결과: 123ABC



# C의 sprintf() 함수 스타일의 형식 지정자로

n = 100

s = "%d" % (n)

print s + "ABC"    # 출력 결과: 100ABC

