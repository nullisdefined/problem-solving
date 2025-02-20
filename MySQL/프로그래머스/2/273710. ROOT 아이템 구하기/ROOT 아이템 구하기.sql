# 별칭(Alias)과 원래 테이블명을 혼용해서 사용할 수 없다.
# 별칭을 지정했으면 반드시 별칭을 사용해야 한다.

select it.item_id, item_name
from item_tree it
join item_info ii on it.item_id = ii.item_id
where parent_item_id is null