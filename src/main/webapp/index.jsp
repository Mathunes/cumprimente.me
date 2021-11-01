<%@include file="header.jsp" %>
        
        <div class="container-card">
            
            <a href=".\alomundo?lang=pt&nome=Fulano">
                <div class="card text-center">
                    <h5 class="card-title">Saudação pelo método GET</h5>
                    <p class="card-text">Insira os dados na URL</p>
                </div>
            </a>
            
            <a href=".\saudacao-post-form.jsp">
                <div class="card text-center">
                    <h5 class="card-title">Saudação pelo método POST</h5>
                    <p class="card-text">Insira os dados no formulário</p>
                </div>
            </a>
            
            <a href=".\motivacional-form.jsp">
                <div class="card text-center">
                    <h5 class="card-title">Motivacional pelo método POST</h5>
                    <p class="card-text">Gerar mensagem motivacional aleatória</p>
                </div>
            </a>
            
        </div>
        
<%@include file="footer.jsp" %>