import java.awt.Color;

public class Editor4 {
    public static void main (String[] args) {
		String fileName = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] image = Runigram.read(fileName);
		Runigram.setCanvas(image);
		Runigram.morph(image, Runigram.grayScaled(image), n);
	}
}
