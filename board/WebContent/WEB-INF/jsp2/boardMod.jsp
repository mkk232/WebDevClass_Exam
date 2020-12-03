<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
	<form action="/v2/boardMod" method="post">
		<div>
			글넘버 : <input type="text" name="i_board" value="${item.i_board }" readonly>
		</div>
		<div>
			제목 : <input type="text" name="title" value="${item.title}">
		</div>
		<div>
			내용 :
			<textarea name="ctnt">${item.ctnt}</textarea>
		</div>
		<div>
			수정일 : <input type="date" name="r_dt" value="${item.r_dt }">
		</div>
		<div>
			<input type="submit" value="수정">
		</div>
		</form>
	</div>
</body>
</html>