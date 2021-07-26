/*select b.bookName, b.PRICE, b.amount, (b.price * b.AMOUNT) as subtotal 
from book b
order by b.Price asc; -- asc 升冪排列 desc 降冪排列
*/
select b.bookName,  sum(b.price * b.AMOUNT) as subtotal 
from book b
group by b.BOOKNAME
