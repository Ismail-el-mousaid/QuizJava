
public class QuestionChoix {
	
	private String mQuestion;
    private String a;
    private String b;
    private String c;

    public QuestionChoix(String q, String a, String b, String c) {
        mQuestion = q;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public String geta() {
        return a;
    }
    public String getb() {
        return b;
    }
    public String getc() {
        return c;
    }


}
