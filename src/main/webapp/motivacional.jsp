<%@include file="header.jsp" %>
        
        <jsp:useBean id="myBean" class="hello.MessageBean"/>
        <% String lang = request.getParameter("lang"); %>
        
        <div class="card text-center card-saudation">
            <h5 class="card-title">Motivacional pelo método POST</h5>
            
            <jsp:setProperty name="myBean" property="msg" value="<%=lang%>"/>
            <jsp:getProperty name="myBean" property="msg"/>
            
            <a href="./motivacional-form.jsp">Voltar</a>
        </div>
        
<%@include file="footer.jsp" %>