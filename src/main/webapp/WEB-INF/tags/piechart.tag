<%-- 
    Document   : piechart
    Created on : 2021/7/12, 下午 07:57:33
    Author     : denne
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@attribute name="work" required="true" rtexprvalue="true" %>
<%@attribute name="eat" required="true" rtexprvalue="true" %>
<%@attribute name="commute" required="true" rtexprvalue="true" %>
<%@attribute name="watchTV" required="true" rtexprvalue="true" %>
<%@attribute name="sleep" required="true" rtexprvalue="true" %>

<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
    google.charts.load('current', {'packages': ['corechart']});
    google.charts.setOnLoadCallback(drawChart);

    function drawChart() {

        var data = google.visualization.arrayToDataTable([
            ['任務', '小時/每天'],
            ['工作', ${ work }],
            ['吃飯', ${ eat }],
            ['社交', ${commute}],
            ['看電視', ${watchTV}],
            ['睡覺', ${sleep}]
        ]);

        var options = {
            title: '日常生活時間分布圖'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
    }
</script>

<div id="piechart" style="width: 900px; height: 500px;"></div>