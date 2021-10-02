import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class EasyLevelEnglish extends EasyLevel {
	
	
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
            new QuestionAnswer("Which Design Pattern should you use when.......you want to represent part-whole hierarchies of objects.", Answer[0]),
            new QuestionAnswer("Which Design Pattern should you use when.......a class wants its subclasses to specify the objects it creates.", Answer[1]),
            new QuestionAnswer("Which Design Pattern should you use when.......you want to provide a simple interface to a complex subsystem.", Answer[2]),         
            new QuestionAnswer("Which Design Pattern should you use when.......an application uses a large number of objects and the storage costs are high because of the sheer quantity of objects.", Answer[3]),
            new QuestionAnswer("Which Design Pattern should you use when.......you want to add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects.", Answer[4]),
            new QuestionAnswer("Which Design Pattern should you use when.......there must be exactly one instance of a class, and it must be accessible to clients from a wellknown access point.", Answer[5]),
            new QuestionAnswer("Which Design Pattern should you use when.......you want to use an existing class, and its interface does not match the one you need.", Answer[6]),
            new QuestionAnswer("Which Design Pattern should you use when.......many related classes differ only in their behavior or you need different variants of an algorithm. For example, you might define algorithms reflecting different space/time trade-offs.", Answer[7]),
            new QuestionAnswer("Which Design Pattern should you use when.......a system should be configured with one of multiple families of products.", Answer[8]),
            new QuestionAnswer("Which Design Pattern should you use when.......a system should be independent of how its products are created, composed, and represented; and when the classes to instantiate are specified at run-time, for example, by dynamic loading", Answer[9]),
            
	};
	
	public List<QuestionAnswer> appliquer() {
		
			List<QuestionAnswer> randomizedList = Arrays.asList(QUESTIONS);
			Collections.shuffle(randomizedList);
			return randomizedList;
	}


}
