import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class QuizDichotomique implements QuizStrategy {
	private static QuizDichotomique instance=new QuizDichotomique();
	
	
	private static final String[] Answer = new String[] {
            "True",
            "False"
            
    };
	
	private static final QuestionAnswer[] QUESTIONS = new QuestionAnswer[] {
            new QuestionAnswer("Can we create a clone of a singleton object?  (True/False)", Answer[0]),
            new QuestionAnswer("Integer class is not an example of Decorator pattern.  (True/False)", Answer[1]),
            new QuestionAnswer("If we serialize a singleton object and deserialize it then the result object will be same.  (True/False)", Answer[1]),
            new QuestionAnswer("Builder allows you to build complex objects incrementally.  (True/False)", Answer[0]),
            new QuestionAnswer("Runtime class is an example of singleton.  (True/False)", Answer[0]),
            new QuestionAnswer("Event handling frameworks like swing, awt use Observer Pattern ?  (True/False)", Answer[0]),
            new QuestionAnswer("Integer.valueOf is not an example of Factory pattern.  (True/False)", Answer[1]),
            new QuestionAnswer("In MVC pattern, Model represents an object or JAVA POJO carrying data. It can also have logic to update controller if its data changes.  (True/False)", Answer[0]),
            new QuestionAnswer("Integer class is not an example of Decorator pattern.  (True/False)", Answer[1]),
            new QuestionAnswer("Bridge allows you to decouple the interface of a component from its implementation.  (True/False)", Answer[0]),
            
    };
	
	
	@Override
	public List<QuestionAnswer> appliquer() {
		
		List<QuestionAnswer> randomizedList = Arrays.asList(QUESTIONS);
        Collections.shuffle(randomizedList);
        return randomizedList;
	}
	
	public static QuizDichotomique getInstance() {
		return instance;
	}
	
	public QuizStrategy Clone() {
    	QuizStrategy clone = new QuizDichotomique();
        return clone;
    }
}
