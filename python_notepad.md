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

