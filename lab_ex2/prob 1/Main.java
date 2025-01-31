public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Voice voice = new Voice();
		voice.prepareVoice();
		voice.hear();
	}
}