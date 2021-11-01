<%@include file="header.jsp" %>
        <div class="card text-center card-saudation">
            <h5 class="card-title">Saudação pelo método GET</h5>
            <p class="card-text">Insira os dados na URL</p>
            <h4><%= request.getAttribute("msg") %></h4>
            <a href="./">Voltar</a>
        </div>
<%@include file="footer.jsp" %>
