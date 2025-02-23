select e.id, e.genotype, p.genotype as parent_genotype
from ecoli_data e
join ecoli_data p
on e.parent_id = p.id
where (e.genotype | p.genotype) = e.genotype
order by e.id;