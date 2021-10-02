import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class HardLevelEnglish extends HardLevel{
	
	
	
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
            new QuestionAnswer("Which of the following pattern works as a bridge between two incompatible interfaces?", Answer[0]),
            new QuestionAnswer("Which of the following pattern builds a complex object using simple objects and using a step by step approach?", Answer[1]),
            new QuestionAnswer("Which type of design patterns concern class and object composition?", Answer[2]),         
            new QuestionAnswer("Which of the following pattern is used when creation of object directly is costly?", Answer[3]),
            new QuestionAnswer("Which of the following pattern refers to creating duplicate object while keeping performance in mind?", Answer[4]),
            new QuestionAnswer("What pattern should we select for a system that interfaces with an existing set of objects", Answer[5]),
            new QuestionAnswer("Which pattern to use when dealing with a complex structure?", Answer[6]),
            new QuestionAnswer("We develop a system that is scalable. Pattern?", Answer[7]),
            new QuestionAnswer("Our system will be able to change algorithms at runtime. Pattern?", Answer[8]),
            new QuestionAnswer("Defines an interface for creating an object, but let the subclasses decide which class to instantiate. It let the instantiation differ to subclasses. Pattern ?", Answer[9]),
            
	};
	
	public List<QuestionAnswer> appliquer() {
		
			List<QuestionAnswer> randomizedList = Arrays.asList(QUESTIONS);
			Collections.shuffle(randomizedList);
			return randomizedList;
	}

	

}
