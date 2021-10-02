import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EasyLevelFrench extends EasyLevel{
	
	
	private static final String[] Answer = new String[] {
            "Composite",
            "Factory",
            "Facade",
            "Flyweight",
            "Decorator",
            "Singleton",
            "Adapter",
            "Strategy",
            "Abstract Factory",
            "Prototype"
            
    };
	
	
	private static final QuestionAnswer[] QUESTIONS = new QuestionAnswer[] {
            new QuestionAnswer("Quel modèle de conception devez-vous utiliser lorsque ....... vous souhaitez représenter des hiérarchies partielles d'objets.", Answer[0]),
            new QuestionAnswer("Quel modèle de conception devez-vous utiliser quand   ....... une classe veut que ses sous-classes spécifient les objets qu'elle crée.", Answer[1]),
            new QuestionAnswer("Quel modèle de conception devez-vous utiliser lorsque ....... vous souhaitez fournir une interface simple à un sous-système complexe.", Answer[2]),         
            new QuestionAnswer("Quel modèle de conception devez-vous utiliser lorsque ....... une application utilise un grand nombre d'objets et que les coûts de stockage sont élevés en raison de la grande quantité d'objets.", Answer[3]),
            new QuestionAnswer("Quel modèle de conception devez-vous utiliser lorsque ....... vous souhaitez ajouter des responsabilités à des objets individuels de manière dynamique et transparente, c'est-à-dire sans affecter d'autres objets.", Answer[4]),
            new QuestionAnswer("Quel modèle de conception devez-vous utiliser lorsque ....... il doit y avoir exactement une instance d'une classe, et il doit être accessible aux clients à partir d'un point d'accès bien connu.", Answer[5]),
            new QuestionAnswer("Quel modèle de conception devez-vous utiliser lorsque ....... vous souhaitez utiliser une classe existante, et son interface ne correspond pas à celle dont vous avez besoin.", Answer[6]),
            new QuestionAnswer("Quel modèle de conception devez-vous utiliser lorsque ....... de nombreuses classes liées ne diffèrent que par leur comportement ou que vous avez besoin de différentes variantes d'un algorithme. Par exemple, vous pouvez définir des algorithmes reflétant différents compromis espace / temps.", Answer[7]),
            new QuestionAnswer("Quel modèle de conception devez-vous utiliser lorsque ....... un système doit être configuré avec l'une des multiples familles de produits.", Answer[8]),
            new QuestionAnswer("Quel modèle de conception devez-vous utiliser lorsque ....... un système doit être indépendant de la façon dont ses produits sont créés, composés et représentés; et lorsque les classes à instancier sont spécifiées au moment de l'exécution, par exemple, par chargement dynamique", Answer[9]),
            
	};
	
	public List<QuestionAnswer> appliquer() {
		
			List<QuestionAnswer> randomizedList = Arrays.asList(QUESTIONS);
			Collections.shuffle(randomizedList);
			return randomizedList;
	}
	
	

}
