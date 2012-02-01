<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="fr.xebia.katas.gildedrose.Item"%>
<html>
        <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>WebApp UI</title>
                <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
                <script type="text/javascript" src="http://documentcloud.github.com/underscore/underscore-min.js"></script>
                <script type="text/javascript" src="http://documentcloud.github.com/backbone/backbone-min.js"></script>
                <script type="text/javascript" src="<%=request.getContextPath()%>/js/gildedRose.js"></script>
                
<style type="text/css">
body{
	font-family: Georgia, sans-serif;
}

p, h1, table{
	width:80%;
	margin: auto;
	margin-bottom: 20px;
}

.mylist
{
	border-collapse: collapse;
}

.mylist th,
.mylist td
{
	font-weight: bold;
	text-align: center;
	border: solid 1px black;
}

.mylist th
{
	background-color: grey;
}

a{
	border: solid 1px black;
	padding: 2px;
	background-color: #CCC;
	text-decoration: none;
	color: black;
	border-radius: 5px;
}

a:hover{
	background-color: #AAA;
}

</style>

                
        </head>
        <body>
        	    <h1>List des items</h1>
                <p>Day n° : <%=request.getAttribute("numDay")%>
                	<a href="<%=request.getContextPath()%>/GildedRose?numDay=<%=((Integer)request.getAttribute("numDay"))+1%>">Next day</a>
            
                </p>
                
                <table class="mylist">
                        <tr>
                                <th>Name</th>   <th>SellIn</th>         <th>Quality</th>
                        </tr>
                        <% for(Item item : (List<Item>)request.getAttribute("items")) { %>
                        <tr>
                                <td><%=item.getName() %> <td><%=item.getSellIn()  %> <td><%=item.getQuality()  %></td>
                        </tr>
                        <% }  %>
                </table>
                
        </body>
</html>