import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuizChoix implements QuizStrategy{
	private static QuizChoix instance=new QuizChoix();
	
	
	
	private static final String[] Answer = new String[] {
            "Composite",
            "Bridge",
            "Proxy",
            "Facade",
            "Adapter",
            "Observer",
            "Singleton",
            "Flyweight"
    };
	
	
	private static final QuestionChoix[] QUESTIONS = new QuestionChoix[] {
            new QuestionChoix("design pattern prevents unnecessary duplication of data:", Answer[7], Answer[4], Answer[3]),
            new QuestionChoix("Synchronize several objects on the state of another object:", Answer[5], Answer[0], Answer[6]),
            new QuestionChoix("Guarantee a single instance for a class:", Answer[6], Answer[1], Answer[2]),         
    };
	
	public List<QuestionChoix> appliquer() {
		
			List<QuestionChoix> randomizedList = Arrays.asList(QUESTIONS);
			Collections.shuffle(randomizedList);
			return randomizedList;
	}
	
	public static QuizChoix getInstance() {
		return instance;
	}
	public QuizStrategy Clone() {
		QuizStrategy clone = new QuizChoix();
        return clone;
    }

}
