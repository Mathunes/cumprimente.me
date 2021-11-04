<%@include file="header.jsp" %>
        <div class="card text-center card-saudation">
            
            <h5 class="card-title">Sauda��o pelo m�todo POST</h5>
            
            <form action="alomundo" method="post">
                
                <input type="hidden" name="hour" id="hour" />
                
                <select class="form-control" name="lang" required="">
                    <option value="pt" selected>Selecione o idioma</option>
                    <option value="pt">Portugu�s</option>
                    <option value="en">Ingl�s</option>
                    <option value="es">Espanhol</option>
                    <option value="fr">Franc�s</option>
                    <option value="de">Alem�o</option>
                    <option value="it">Italiano</option>
                </select>
                
                <input class="form-control" type="text" name="nome" placeholder="Informe seu nome" required/>
                
                <label>Pronome de tratamento</label>
                
                <div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="pronome" id="inlineRadio1" value="0" checked>
                        <label class="form-check-label" for="inlineRadio1">Nenhum</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="pronome" id="inlineRadio2" value="1">
                        <label class="form-check-label" for="inlineRadio2">Sr.</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="pronome" id="inlineRadio3" value="2">
                        <label class="form-check-label" for="inlineRadio3">Sra.</label>
                    </div>
                </div>
                
                <input class="form-control" type="submit" value="Cumprimente-me"/>
                
             </form>
            
            <a href="./">Voltar</a>
            
        </div>
        
        <script>document.getElementById("hour").value = new Date().getHours()</script>
<%@include file="footer.jsp" %>