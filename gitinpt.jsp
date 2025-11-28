<%@ page contentType="text/html; charset=utf8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>profileInput</title>
    </head>
    <body>
        <form action="gitinputservlet" method="POST">
            <label for="sei">姓:</label>
            <input type="text" name="sei" id="sei">
            <label for="mei">名:</label>
            <input type="text" name="mei" id="mei">
            <input type="submit" value="送信">
        </form>
    </body>
</html>