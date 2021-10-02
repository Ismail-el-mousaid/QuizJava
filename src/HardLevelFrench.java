import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class HardLevelFrench extends HardLevel{
	
	
	private static final String[] Answer = new String[] {
            "Adapter",
            "Builder",
            "Structurel",
            "Bridge",
            "Prototype",
            "Facade",
            "Composite",
            "Observer",
            "Strategy",
            "Factory"
            
    };
	
	
	private static final QuestionAnswer[] QUESTIONS = new QuestionAnswer[] {
            new QuestionAnswer("Lequel des pattrons fonctionne comme un pont entre deux interfaces incompatibles?", Answer[0]),
            new QuestionAnswer("Lequel des patrons construit un objet complexe en utilisant des objets simples et en utilisant une approche étape par étape?", Answer[1]),
            new QuestionAnswer("Quels types de modèles de conception concernent la composition des classes et des objets?", Answer[2]),         
            new QuestionAnswer("Quel patron de conception est utilisé lorsque la création d'un objet directement est coûteuse?", Answer[3]),
            new QuestionAnswer("Quel design pattern fait référence à la création d'objets en double tout en gardant à l'esprit les performances?", Answer[4]),
            new QuestionAnswer("Quel modèle devrions-nous sélectionner pour un système qui s'interface avec un ensemble d'objets existant?", Answer[5]),
            new QuestionAnswer("Quel modèle utiliser pour gérer une structure complexe?", Answer[6]),
            new QuestionAnswer("Il développe un système évolutif. Modèle de conception?", Answer[7]),
            new QuestionAnswer("Notre système pourra modifier les algorithmes lors de l'exécution. Pattern?", Answer[8]),
            new QuestionAnswer("Définit une interface pour créer un objet, mais laisse les sous-classes décider de la classe à instancier. Il a laissé l'instanciation différer des sous-classes.Design Pattern ?", Answer[9]),
            
	};
	
	public List<QuestionAnswer> appliquer() {
		
			List<QuestionAnswer> randomizedList = Arrays.asList(QUESTIONS);
			Collections.shuffle(randomizedList);
			return randomizedList;
	}


}
