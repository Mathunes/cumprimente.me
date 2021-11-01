<%@include file="header.jsp" %>
        <div class="card text-center card-saudation">
            
            <h5 class="card-title">Motivacional pelo método POST</h5>
            
            <form action="motivacional.jsp" method="post">
                <select class="form-control" name="lang" required="">
                    <option value="pt" selected>Selecione o idioma</option>
                    <option value="pt">Português</option>
                    <option value="en">Inglês</option>
                    <option value="fr">Francês</option>
                    <option value="de">Alemão</option>
                </select>
                
                <input class="form-control" type="submit" value="Motive-me"/>
            </form>
            
            <a href="./">Voltar</a>
            
        </div>
    
<%@include file="footer.jsp" %>