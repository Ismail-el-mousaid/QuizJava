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
            new QuestionAnswer("Quel mod�le de conception devez-vous utiliser lorsque ....... vous souhaitez repr�senter des hi�rarchies partielles d'objets.", Answer[0]),
            new QuestionAnswer("Quel mod�le de conception devez-vous utiliser quand   ....... une classe veut que ses sous-classes sp�cifient les objets qu'elle cr�e.", Answer[1]),
            new QuestionAnswer("Quel mod�le de conception devez-vous utiliser lorsque ....... vous souhaitez fournir une interface simple � un sous-syst�me complexe.", Answer[2]),         
            new QuestionAnswer("Quel mod�le de conception devez-vous utiliser lorsque ....... une application utilise un grand nombre d'objets et que les co�ts de stockage sont �lev�s en raison de la grande quantit� d'objets.", Answer[3]),
            new QuestionAnswer("Quel mod�le de conception devez-vous utiliser lorsque ....... vous souhaitez ajouter des responsabilit�s � des objets individuels de mani�re dynamique et transparente, c'est-�-dire sans affecter d'autres objets.", Answer[4]),
            new QuestionAnswer("Quel mod�le de conception devez-vous utiliser lorsque ....... il doit y avoir exactement une instance d'une classe, et il doit �tre accessible aux clients � partir d'un point d'acc�s bien connu.", Answer[5]),
            new QuestionAnswer("Quel mod�le de conception devez-vous utiliser lorsque ....... vous souhaitez utiliser une classe existante, et son interface ne correspond pas � celle dont vous avez besoin.", Answer[6]),
            new QuestionAnswer("Quel mod�le de conception devez-vous utiliser lorsque ....... de nombreuses classes li�es ne diff�rent que par leur comportement ou que vous avez besoin de diff�rentes variantes d'un algorithme. Par exemple, vous pouvez d�finir des algorithmes refl�tant diff�rents compromis espace / temps.", Answer[7]),
            new QuestionAnswer("Quel mod�le de conception devez-vous utiliser lorsque ....... un syst�me doit �tre configur� avec l'une des multiples familles de produits.", Answer[8]),
            new QuestionAnswer("Quel mod�le de conception devez-vous utiliser lorsque ....... un syst�me doit �tre ind�pendant de la fa�on dont ses produits sont cr��s, compos�s et repr�sent�s; et lorsque les classes � instancier sont sp�cifi�es au moment de l'ex�cution, par exemple, par chargement dynamique", Answer[9]),
            
	};
	
	public List<QuestionAnswer> appliquer() {
		
			List<QuestionAnswer> randomizedList = Arrays.asList(QUESTIONS);
			Collections.shuffle(randomizedList);
			return randomizedList;
	}
	
	

}
