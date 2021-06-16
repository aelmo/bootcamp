select * from cliente where cliente.id > 5;

select * from cliente where cliente.id > 5 order by cliente.created_at desc;

select * from cliente where cliente.id > 5 and cliente.tipo = 'PJ' order by cliente.created_at desc;

select * from cliente where cliente.id > 5 and cliente.tipo = 'CPF' order by cliente.created_at desc;

select * from pedidos where pedido.created_at between '01012020' and '31012020';

select * from pedidos limit 10;

select produtos.categoria from produtos group by produtos.categoria;

select sum(pedidos) from pedidos where pedidos.cliente_id = 48 and pedido.tipo = 'renda';

select count(pedidos) from pedidos where pedidos.status = 'cancelado';