# SQL은 대소문자를 구분하지 않는다.
# 평균은 AVG() 함수를 사용하고, 반올림은 ROUND() 함수를 사용하며, 묶어서 평균을 내는 문제에서는 GROUP BY()를 생각해준다.
# 또, YEAR()는 DATE 타입에서 연도만 빼준다.

select year(ym) as year, round(avg(pm_val1), 2) as pm10, round(avg(pm_val2), 2) as "pm2.5"
from air_pollution
where location1 = '경기도' and location2 = '수원'
group by year(ym)
order by year(ym) asc;