
public class QuizFrench extends Quiz{
	
	private static QuizFrench instance=new QuizFrench();
	
	@Override
	public EasyLevel creerQuizEasy() {
		// TODO Auto-generated method stub
		return new EasyLevelFrench();
	}

	@Override
	public HardLevel creerQuizHard() {
		// TODO Auto-generated method stub
		return new HardLevelFrench();
	}
	
	public static QuizFrench getInstance() {
		return instance;
	}

}
