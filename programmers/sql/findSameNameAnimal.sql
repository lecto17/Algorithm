--ORDER BY 순서가 헷갈렷음

SELECT distinct NAME, count(NAME) as COUNT
FROM ANIMAL_INS
GROUP BY NAME 
HAVING count(NAME) > 1 and NAME is not null
ORDER BY NAME
