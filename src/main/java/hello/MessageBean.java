package hello;

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
        
        int randomNumber = rand.nextInt(10);
        
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
                break;
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
                break;
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
                break;
            case 5:
                
                switch (lang) {
                    case "en":
                        msg = "Before saying you can't do something, give it a try.";
                        break;
                    case "de":
                        msg = "Bevor Sie sagen, dass Sie etwas nicht tun können, probieren Sie es aus.";
                        break;
                    case "fr":
                        msg = "Avant de dire que vous ne pouvez pas faire quelque chose, essayez-le.";
                        break;
                    default:
                        msg = "Antes que diga que não consegue fazer alguma coisa, experimente.";
                        break;
                }
                break;
            case 6:
                
                switch (lang) {
                    case "en":
                        msg = "You can have results or excuses, not both.";
                        break;
                    case "de":
                        msg = "Sie können Ergebnisse oder Ausreden haben, nicht beides.";
                        break;
                    case "fr":
                        msg = "Vous pouvez avoir des résultats ou des excuses, pas les deux.";
                        break;
                    default:
                        msg = "Você pode ter resultados ou desculpas, não ambos.";
                        break;
                }
                break;
            case 7:
                
                switch (lang) {
                    case "en":
                        msg = "Discipline is the bridge between goals and achievements.";
                        break;
                    case "de":
                        msg = "Disziplin ist die Brücke zwischen Zielen und Erfolg.";
                        break;
                    case "fr":
                        msg = "La discipline est le pont entre les objectifs et les réalisations.";
                        break;
                    default:
                        msg = "Disciplina é a ponte entre metas e realizações.";
                        break;
                }
                break;
            case 8:
                
                switch (lang) {
                    case "en":
                        msg = "Always deliver more than expected.";
                        break;
                    case "de":
                        msg = "Liefern Sie immer mehr als erwartet.";
                        break;
                    case "fr":
                        msg = "Livrez toujours plus que prévu.";
                        break;
                    default:
                        msg = "Sempre entregue mais do que o esperado.";
                        break;
                }
                break;
            case 9:
                
                switch (lang) {
                    case "en":
                        msg = "If you don't like starting over, stop giving up.";
                        break;
                    case "de":
                        msg = "Wenn Sie nicht gerne von vorne beginnen, hören Sie auf aufzugeben.";
                        break;
                    case "fr":
                        msg = "Si vous n'aimez pas recommencer, arrêtez d'abandonner.";
                        break;
                    default:
                        msg = "Se você não gosta de recomeçar, pare de desistir.";
                        break;
                }
                break;
        }

    }
}
