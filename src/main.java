import java.util.List;
import java.util.Scanner;





public class main {
	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------------------");
		System.out.println("+-------Jeu Quiz avec differents options pour jouer------+");
		System.out.println("  1-Quiz avec langue francais");
		System.out.println("  2-Quiz avec langue Anglais");
		System.out.println("  3-Quiz dichotomique");
		System.out.println("  4-Quiz choix unique");
		System.out.println("Entrer le numero de quiz que vous souhaitez le passer:");
		Scanner scanner2 = new Scanner(System.in);
        int nombre = scanner2.nextInt();
        
        // langue francais
        if(nombre==1) {
    		Quiz z = QuizFrench.getInstance();
    		System.out.println("  1-Level : EasyQuiz");
    		System.out.println("  2-Level : HardQuiz");
    		System.out.println("Entrer le numero de niveau de diffuclté :");
    		Scanner scanner3 = new Scanner(System.in);
            int nbr = scanner3.nextInt();
            System.out.println("------Donne le design pattern correspondant à chaque question: -------");
            if(nbr==1) {
            	EasyLevel l = z.creerQuizEasy();
            	
            	List<QuestionAnswer> questions = (List<QuestionAnswer>) l.appliquer();                
                int counter = 0;

                for (int i = 0; i < questions.size(); i++) {
                    QuestionAnswer questionAnswer = questions.get(i);
                    System.out.println((i + 1) + ". " + questionAnswer.getQuestion());

                    Scanner scanner = new Scanner(System.in);
                    String actualAnswer = scanner.nextLine();
                    
                    String patternName = actualAnswer.split(" ")[0];
                    if (patternName.toLowerCase().equals(questionAnswer.getAnswer().toLowerCase())) {
                        System.out.println("- Correct -\n");
                        counter++;
                    } else {
                        System.out.println("- Wrong: " + questionAnswer.getAnswer() + " Pattern -\n");
                    }
                }
                System.out.println("--- RESULT: " + counter + " / " + questions.size() + " ---");
            }
            
            
            else if(nbr==2) {
            	HardLevel l = z.creerQuizHard();
            	
            	List<QuestionAnswer> questions = (List<QuestionAnswer>) l.appliquer();            
                int counter = 0;

                for (int i = 0; i < questions.size(); i++) {
                    QuestionAnswer questionAnswer = questions.get(i);
                    System.out.println((i + 1) + ". " + questionAnswer.getQuestion());

                    Scanner scanner = new Scanner(System.in);
                    String actualAnswer = scanner.nextLine();
                    
                    String patternName = actualAnswer.split(" ")[0];
                    if (patternName.toLowerCase().equals(questionAnswer.getAnswer().toLowerCase())) {
                        System.out.println("- Correct -\n");
                        counter++;
                    } else {
                        System.out.println("- Wrong: " + questionAnswer.getAnswer() + " Pattern -\n");
                    }
                }
                System.out.println("--- RESULT: " + counter + " / " + questions.size() + " ---");
            }
    		
        }
        
        // langue Anglais
        
        else if(nombre==2) {
    		Quiz z = QuizEnglish.getInstance();
    		System.out.println("  1-Level : EasyQuiz");
    		System.out.println("  2-Level : HardQuiz");
    		System.out.println("Entrer le numero de niveau de diffuclté :");
    		Scanner scanner3 = new Scanner(System.in);
            int nbr = scanner3.nextInt();
            
            System.out.println("------Give the design pattern corresponding to each question: -------");
            
            if(nbr==1) {
            	EasyLevel l = z.creerQuizEasy();
            	
            	List<QuestionAnswer> questions = (List<QuestionAnswer>) l.appliquer();                
                int counter = 0;

                for (int i = 0; i < questions.size(); i++) {
                    QuestionAnswer questionAnswer = questions.get(i);
                    System.out.println((i + 1) + ". " + questionAnswer.getQuestion());

                    Scanner scanner = new Scanner(System.in);
                    String actualAnswer = scanner.nextLine();
                    
                    String patternName = actualAnswer.split(" ")[0];
                    if (patternName.toLowerCase().equals(questionAnswer.getAnswer().toLowerCase())) {
                        System.out.println("- Correct -\n");
                        counter++;
                    } else {
                        System.out.println("- Wrong: " + questionAnswer.getAnswer() + " Pattern -\n");
                    }
                }
                System.out.println("--- RESULT: " + counter + " / " + questions.size() + " ---");
            }
            
            
            else if(nbr==2) {
            	HardLevel l = z.creerQuizHard();
            	
            	List<QuestionAnswer> questions = (List<QuestionAnswer>) l.appliquer();            
                int counter = 0;

                for (int i = 0; i < questions.size(); i++) {
                    QuestionAnswer questionAnswer = questions.get(i);
                    System.out.println((i + 1) + ". " + questionAnswer.getQuestion());

                    Scanner scanner = new Scanner(System.in);
                    String actualAnswer = scanner.nextLine();
                    
                    String patternName = actualAnswer.split(" ")[0];
                    if (patternName.toLowerCase().equals(questionAnswer.getAnswer().toLowerCase())) {
                        System.out.println("- Correct -\n");
                        counter++;
                    } else {
                        System.out.println("- Wrong: " + questionAnswer.getAnswer() + " Pattern -\n");
                    }
                }
                System.out.println("--- RESULT: " + counter + " / " + questions.size() + " ---");
            }
    		
        }
        
        // Quiz (True/false)
        
        else if(nombre==3) {
        	
    		QuizStrategy c = QuizDichotomique.getInstance();
    		QuizStrategy l = (QuizDichotomique) c.Clone();
            
    		List<QuestionAnswer> questions = (List<QuestionAnswer>) l.appliquer();
            
            int counter = 0;
            
            System.out.println("------Answer with true or false: ------");
            for (int i = 0; i < questions.size(); i++) {
            	
                QuestionAnswer questionAnswer = questions.get(i);
                System.out.println((i + 1) + ". " + questionAnswer.getQuestion());

                Scanner scanner = new Scanner(System.in);
                String actualAnswer = scanner.nextLine();
                
                String patternName = actualAnswer.split(" ")[0];
                if (patternName.toLowerCase().equals(questionAnswer.getAnswer().toLowerCase())) {
                    System.out.println("- Correct -\n");
                    counter++;
                } else {
                    System.out.println("- Wrong: " + questionAnswer.getAnswer() + " Pattern -\n");
                }
            }
            System.out.println("--- RESULT: " + counter + " / " + questions.size() + " ---");
            }
        
        // Quiz avec choix
        
        else if(nombre==4) {
    		QuizStrategy c = QuizChoix.getInstance();
            QuizStrategy l = (QuizChoix) c.Clone();
        	

    		List<QuestionChoix> questions = (List<QuestionChoix>) l.appliquer();
            
            int counter = 0;
            
            System.out.println("------Choose the corresponding design pattern: -------");
            for (int i = 0; i < questions.size(); i++) {
            	
                QuestionChoix questionchoix = questions.get(i);
                System.out.println((i + 1) + ". " + questionchoix .getQuestion());
                System.out.println( "   - " + questionchoix .geta());
                System.out.println( "   - " + questionchoix .getb());
                System.out.println( "   - " + questionchoix .getc());

                Scanner scanner = new Scanner(System.in);
                String actualAnswer = scanner.nextLine();
                
                String patternName = actualAnswer.split(" ")[0];
                if (patternName.toLowerCase().equals(questionchoix.geta().toLowerCase())) {
                    System.out.println("- Correct -\n");
                    counter++;
                } else {
                    System.out.println("- Wrong: " + questionchoix .geta() + " Pattern -\n");
                }
            }
            System.out.println("--- RESULT: " + counter + " / " + questions.size() + " ---");
            }
        
        
	}
}
