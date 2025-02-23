# LIKE는 문자열 비교를 할 때 사용된다.
# = 연산자로 문자열 비교를 해도되지만 와일드 카드를 쓸 수 있다는 점에서 차이가 있다.

select id, email, first_name, last_name
from developer_infos
# where skill_1 = 'Python' or skill_2 = 'Python' or skill_3 = 'Python'
# IN 연산자는 특정 값이 주어진 값 목록 안에 존재하는지 확인할 때 사용된다.
where 'Python' in (skill_1, skill_2, skill_3)
order by id asc;
