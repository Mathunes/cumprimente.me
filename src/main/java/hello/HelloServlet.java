
package hello;

import java.io.IOException;
import java.time.LocalDateTime;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alomundo")
public class HelloServlet extends HttpServlet {

    public String getSaudation(String lang, int pronoumId, int hour) {
        
        String msg = "";
        String pronoum = "";
        
        switch(lang){
            case "pt":
                if (pronoumId == 1)
                    pronoum = "sr. ";
                else if (pronoumId == 2)
                    pronoum = "sra. ";
                
                if (hour < 6)
                    msg = "Boa madrugada, ";
                else if (hour < 12)
                    msg = "Bom dia, ";
                else if (hour < 18)
                    msg = "Boa tarde, ";
                else
                    msg = "Boa noite, ";
                break;
                
            case "en":
                if (pronoumId == 1)
                    pronoum = "mr. ";
                else if (pronoumId == 2)
                    pronoum = "mrs. ";
                
                if (hour < 6)
                    msg = "Good morning, ";
                else if (hour < 12)
                    msg = "Good morning, ";
                else if (hour < 18)
                    msg = "Good afternoon, ";
                else
                    msg = "Good night, ";
                break;
                
            case "fr":
                if (pronoumId == 1)
                    pronoum = "monsieur. ";
                else if (pronoumId == 2)
                    pronoum = "mme. ";
                
                if (hour < 6)
                    msg = "Bonjour, ";
                else if (hour < 12)
                    msg = "Bonjour, ";
                else if (hour < 18)
                    msg = "Bon après-midi, ";
                else
                    msg = "Bonne nuit, ";
                break;
                
            case "de":
                if (pronoumId == 1)
                    pronoum = "herr ";
                else if (pronoumId == 2)
                    pronoum = "frau ";
                
                if (hour < 6)
                    msg = "Guten Morgen, ";
                else if (hour < 12)
                    msg = "Guten Morgen, ";
                else if (hour < 18)
                    msg = "Guten Tag, ";
                else
                    msg = "Gute Nacht, ";
                break;
                
            case "es":
                if (pronoumId == 1)
                    pronoum = "sr. ";
                else if (pronoumId == 2)
                    pronoum = "señora ";
                
                if (hour < 6)
                    msg = "Buenos días, ";
                else if (hour < 12)
                    msg = "Buen día, ";
                else if (hour < 18)
                    msg = "Buenas tardes, ";
                else
                    msg = "Buenas noches, ";
                break;
                
            case "it":
                if (pronoumId == 1)
                    pronoum = "mr. ";
                else if (pronoumId == 2)
                    pronoum = "la signora ";
                
                if (hour < 6)
                    msg = "Buon giorno, ";
                else if (hour < 12) 
                    msg = "Buon giorno, ";
                else if (hour < 18) 
                    msg = "Buon pomeriggio, ";
                else
                    msg = "Buona Notte, ";
                break;
        }
        
        return msg+pronoum;
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String hour = request.getParameter("hour");
        
        if (hour==null)
            hour = Integer.toString(LocalDateTime.now().getHour());
        
        String msg = "";
        
        String lang = request.getParameter("lang");
        
        if(lang==null)
            lang = "pt";
        
        String nome = request.getParameter("nome");

        if(nome==null)
            nome = "Fulano";
        
        msg = getSaudation(lang, 0, Integer.parseInt(hour))+nome+"!";
        
        request.setAttribute("msg", msg);
        RequestDispatcher saudacaoGet = getServletContext().getRequestDispatcher("/saudacao-get.jsp");
        saudacaoGet.forward(request, response);

    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String hour = request.getParameter("hour");
        
        String msg = "";
        
        String pronome = request.getParameter("pronome");
        
        if(pronome==null)
            pronome = "";
        
        String lang = request.getParameter("lang");
        
        if(lang==null)
            lang = "pt";
        
        String nome = request.getParameter("nome");

        if(nome==null)
            nome = "Fulano";
        
        msg = getSaudation(lang, Integer.parseInt(pronome), Integer.parseInt(hour))+nome+"!";

        request.setAttribute("msg", msg);
        RequestDispatcher saudacaoGet = getServletContext().getRequestDispatcher("/saudacao-post.jsp");
        saudacaoGet.forward(request, response);
        
    }
    
}
