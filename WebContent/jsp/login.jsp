<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../header.html"%>



<p>ログイン画面</p>
<form action="../Login.Action" method="post">
	<table>
		<tr>
			<th>ログインID</th>
			<td><input type="text" name="login"></td>
		</tr>
		<tr>
			<th>パスワード</th>
			<td><input type="password" name="passward"></td>
		</tr>
	</table>
	<p>
		<input type="submit" value="ログイン">
	</p>
</form>


<%@include file="../footer.html"%>