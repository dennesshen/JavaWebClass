select b.BOOKNAME, sum(b.PRICE*b.AMOUNT) as subtotal,
                    sum(b.AMOUNT) as amount,
                    sum(b.PRICE*b.AMOUNT)/ sum(b.AMOUNT) as avg_price
from book b
group by b.BOOKNAME