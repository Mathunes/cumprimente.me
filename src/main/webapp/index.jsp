<%@include file="header.jsp" %>
        
        <div class="container-card">
            
            <a href="" id="link-get">
                <div class="card text-center">
                    <h5 class="card-title">Sauda��o pelo m�todo GET</h5>
                    <p class="card-text">Insira os dados na URL</p>
                </div>
            </a>
            
            <a href=".\saudacao-post-form.jsp">
                <div class="card text-center">
                    <h5 class="card-title">Sauda��o pelo m�todo POST</h5>
                    <p class="card-text">Insira os dados no formul�rio</p>
                </div>
            </a>
            
            <a href=".\motivacional-form.jsp">
                <div class="card text-center">
                    <h5 class="card-title">Motivacional pelo m�todo POST</h5>
                    <p class="card-text">Gerar mensagem motivacional aleat�ria</p>
                </div>
            </a>
            
        </div>
        <script>
            document.getElementById("link-get").href = ".\\alomundo?lang=pt&nome=Fulano&hour=" + new Date().getHours();
        </script>
        
<%@include file="footer.jsp" %>