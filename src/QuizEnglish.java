
public class QuizEnglish extends Quiz{
	private static QuizEnglish instance=new QuizEnglish();

	@Override
	public EasyLevel creerQuizEasy() {
		// TODO Auto-generated method stub
		return new EasyLevelEnglish();
	}

	@Override
	public HardLevel creerQuizHard() {
		// TODO Auto-generated method stub
		return new HardLevelEnglish();
	}
	public static QuizEnglish getInstance() {
		return instance;
	}

}
