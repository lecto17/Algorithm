--중성화 여부 파악하기
-- CASE ~ WHEN ~ THEN ~ ELSE END 

SELECT ANIMAL_ID, NAME,
    CASE WHEN SEX_UPON_INTAKE LIKE 'Neutered%' 
            OR SEX_UPON_INTAKE LIKE 'Spayed%' THEN 'O' 
         ELSE 'X' 
    END AS SEX_UPON_INTAKE
FROM ANIMAL_INS
ORDER BY ANIMAL_ID