--루시와 엘라 찾기
--IN 연산자

SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', "Mitty")
ORDER BY ANIMAL_ID

# SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
# FROM ANIMAL_INS
# WHERE NAME = 'Lucy' OR NAME = 'Ella' OR NAME = 'Pickle' OR NAME = 'Rogan' OR NAME = 'Sabrina' OR NAME = 'Mitty'
