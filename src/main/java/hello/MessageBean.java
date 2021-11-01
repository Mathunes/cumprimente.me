package hello;

import java.beans.*;
import java.io.Serializable;
import java.util.Random;

public class MessageBean implements Serializable {
     
    private String msg;
        
    public MessageBean() {
    }
    
    public String getMsg() {
        return msg;
    }
    
    public void setMsg(String lang) {      
        Random rand = new Random();
        
        int randomNumber = rand.nextInt(5);
        
        switch (randomNumber) {
            case 0:
                
                switch (lang) {
                    case "en":
                        msg = "Persistence is the path to success.";
                        break;
                    case "de":
                        msg = "Beständigkeit ist der Weg zum Erfolg.";
                        break;
                    case "fr":
                        msg = "La persévérance est la voie du succès.";
                        break;
                    default:
                        msg = "A persistência é o caminho para o sucesso.";
                        break;
                }
                
                break;
                
            case 1:
                
                switch (lang) {
                    case "en":
                        msg = "In the midst of difficulty is opportunity.";
                        break;
                    case "de":
                        msg = "Inmitten der Schwierigkeit liegt die Gelegenheit.";
                        break;
                    case "fr":
                        msg = "Au milieu de la difficulté se trouve l'opportunité.";
                        break;
                    default:
                        msg = "No meio da dificuldade encontra-se a oportunidade.";
                        break;
                }
                
                break;
            case 2:
                
                switch (lang) {
                    case "en":
                        msg = "Failure is just an opportunity to start over with more intelligence.";
                        break;
                    case "de":
                        msg = "Scheitern ist nur eine Gelegenheit, mit mehr Intelligenz neu anzufangen.";
                        break;
                    case "fr":
                        msg = "L'échec n'est qu'une opportunité de recommencer avec plus d'intelligence.";
                        break;
                    default:
                        msg = "O insucesso é apenas uma oportunidade para recomeçar com mais inteligência.";
                        break;
                }
                
            case 3:
                
                switch (lang) {
                    case "en":
                        msg = "Our biggest weakness is giving up. The surest way to win is to try one more time.";
                        break;
                    case "de":
                        msg = "Unsere größte Schwäche ist das Aufgeben. Der sicherste Weg zu gewinnen ist, es noch einmal zu versuchen.";
                        break;
                    case "fr":
                        msg = "Notre plus grande faiblesse est d'abandonner. Le moyen le plus sûr de gagner est d'essayer une fois de plus.";
                        break;
                    default:
                        msg = "Nossa maior fraqueza está em desistir. O caminho mais certo de vencer é tentar mais uma vez.";
                        break;
                }
                
            case 4:
                
                switch (lang) {
                    case "en":
                        msg = "Courage is not the absence of fear; it's persistence despite fear.";
                        break;
                    case "de":
                        msg = "Mut ist nicht die Abwesenheit von Angst; es ist Beharrlichkeit trotz Angst.";
                        break;
                    case "fr":
                        msg = "Le courage n'est pas l'absence de peur ; c'est la persistance malgré la peur.";
                        break;
                    default:
                        msg = "Coragem não é ausência de medo; é persistência apesar do medo.";
                        break;
                }
        }

    }
}
