-- 統一價格加 10% 
--update book set price = price*1.1;

-- 修改 id = 1 的資料bookName = java8 price=200
update book set bookName='Java8', price=200 where id = 1 ;
update book b set b.BOOKNAME ='C++', b.PRICE=110 where b.ID =2
