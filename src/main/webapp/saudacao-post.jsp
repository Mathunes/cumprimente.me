<%@include file="header.jsp" %>
        <div class="card text-center card-saudation">
            <h5 class="card-title">Saudação pelo método POST</h5>
            <h4><%= request.getAttribute("msg") %></h4>
            <a href="./saudacao-post-form.jsp">Voltar</a>
        </div>
<%@include file="footer.jsp" %>