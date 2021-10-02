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
            new QuestionAnswer("Lequel des patrons construit un objet complexe en utilisant des objets simples et en utilisant une approche �tape par �tape?", Answer[1]),
            new QuestionAnswer("Quels types de mod�les de conception concernent la composition des classes et des objets?", Answer[2]),         
            new QuestionAnswer("Quel patron de conception est utilis� lorsque la cr�ation d'un objet directement est co�teuse?", Answer[3]),
            new QuestionAnswer("Quel design pattern fait r�f�rence � la cr�ation d'objets en double tout en gardant � l'esprit les performances?", Answer[4]),
            new QuestionAnswer("Quel mod�le devrions-nous s�lectionner pour un syst�me qui s'interface avec un ensemble d'objets existant?", Answer[5]),
            new QuestionAnswer("Quel mod�le utiliser pour g�rer une structure complexe?", Answer[6]),
            new QuestionAnswer("Il d�veloppe un syst�me �volutif. Mod�le de conception?", Answer[7]),
            new QuestionAnswer("Notre syst�me pourra modifier les algorithmes lors de l'ex�cution. Pattern?", Answer[8]),
            new QuestionAnswer("D�finit une interface pour cr�er un objet, mais laisse les sous-classes d�cider de la classe � instancier. Il a laiss� l'instanciation diff�rer des sous-classes.Design Pattern ?", Answer[9]),
            
	};
	
	public List<QuestionAnswer> appliquer() {
		
			List<QuestionAnswer> randomizedList = Arrays.asList(QUESTIONS);
			Collections.shuffle(randomizedList);
			return randomizedList;
	}


}
