import java.awt.Color;
/**
 * Demonstrates the morphing operation featured by Runigram.java to grayscale of the same image. 
 * The program recieves two command-line arguments: a string representing the name
 * of the PPM file image and the number of morphing steps (an int). 
 * For example, to morph the cake into grayscale cake in 50 steps, use:
 * java Editor3 cake.ppm 50
 * Note: There is no need to scale the target image to the size of the source
 * image, since Runigram.morph performs this action.
 */
public class Editor4 {
    public static void main (String[] args) {
		String fileName = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] image = Runigram.read(fileName);
		Runigram.setCanvas(image);
		Runigram.morph(image, Runigram.grayScaled(image), n);
	}
}
