select name, min(datetime) as datetime
from animal_ins
group by animal_id
order by animal_id desc