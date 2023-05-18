<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-05-11
  Time: 오후 4:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%--jstl 설정 해주는 jstl core--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
    <title>메인화면</title>
    <script>
        function signBtn() {

        }
    </script>
</head>
<body class="bg-light">
<header class="container-fluid bg-secondary">
    <div class="row">
        <div class="col-sm-3"><p class="nav-brand"><a href="#">로고임</a></p></div>
        <div class="col-sm">
            <form action="login.do" method="post">
                <div class="me-5 pe-5">
                    <label for="user-id">아이디 :</label>
                    <input type="text" id="user-id" name="userId" class="form-control" placeholder="아이디 입력해주세요">
                </div>
                <div>
                    <label for="user-pw">비밀번호 입력 :</label>
                    <input type="text" id="user-pw" name="userPw" class="form-control" placeholder="비밀번호를 입력해주세요">
                </div>
                <div>
                    <button type="submit" class="btn btn-primary" id="btnLogin">로그인</button>
                </div>
            </form>
            <div>
                <button type="submit" class="btn btn-outline-primary">로그인 하러가기</button>
            </div>
        </div>
    </div>
</header>
<%-- content 부분 --%>
<article>
<nav class="container">
    <div class="row">
        <div class="col-sm">
            <ul class="list-group">
                <li class="list-group-item"><a href="#" class="text-decoration-none btn btn-link">다이어리</a></li>
                <li class="list-group-item"><a href="#" class="text-decoration-none btn btn-link">그림 다이어리</a></li>
            </ul>
        </div>
    </div>
</nav>
<main class="container">
    <div class="row">
        <div class="col-sm-8">
            <p><i>최근 게시판 목록</i></p>
            <div class="list-group">
                <c:forEach var="item" items="${diaryList}">
                    <li>
                        <span>${item.num}</span><span>${item.title}</span><span>${item.id}</span><span>${item.date}</span><span>${item.count}</span>
                    </li>
                </c:forEach>
            </div>
            <div>
                <%--       페이지 처리공간         --%>
            </div>
            <div>
                <%--       검색 공간         --%>
                <form action="searchDiary.do" method="get">
                    <input type="text" class="form-control d-inline" placeholder="검색어을 입력해주세요">
                    <button type="submit" class="btn btn-primary">검색</button>
                </form>
            </div>
        </div>
    </div>
</main>
<aside></aside>
</article>
<%-- content 끝나는 부분 --%>

<%@include file="footer.jsp"%>
</body>
</html>
