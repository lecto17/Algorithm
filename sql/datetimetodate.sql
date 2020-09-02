--DATETIME에서 DATE로 형 변환
--%y : 2자리 연도, %M : 달 이름(January, February, etc), %D : 몇 번째일(3rd, 7th, 19th)

SELECT ANIMAL_ID, NAME, date_format(DATETIME, '%Y-%m-%d')
FROM ANIMAL_INS
ORDER BY ANIMAL_ID
