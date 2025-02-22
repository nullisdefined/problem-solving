# IF()는 MySQL 지원하는 함수
# IF(조건, 참일 때 값, 거짓일 때 값)

select animal_id, name,
if(sex_upon_intake like '%Neutered%'
   or sex_upon_intake like '%Spayed%', 'O', 'X')
   as 중성화
from animal_ins