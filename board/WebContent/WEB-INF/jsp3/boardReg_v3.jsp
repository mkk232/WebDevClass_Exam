<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<form action="/v3/boardReg" method="post">
	<div>
		<div>
			제목 : <input type="text" name="title"> 
		</div>
		<div>
			내용 : <textarea name="ctnt"></textarea> 
		</div>
		<div>
			수정일 : <input type="date" name="r_dt"> 
		</div>
		<div>
			<input type="submit" value="글수정">
		</div>
	</div>
	</form>
</body>
</html>