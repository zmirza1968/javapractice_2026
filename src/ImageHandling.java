import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageHandling {

	public static void main(String[] args)  {
	
		
		try {
			@SuppressWarnings("deprecation")
			URL url = new URL("<img loading=\"eager\" src=\"https://m.media-amazon.com/images/I/71yraral-hL._AC_AIweblab1431263,T1_SF1282.5,2052_QL80_.jpg?aicid=homepage-single-creative-card\" srcset=\"https://m.media-amazon.com/images/I/71yraral-hL._AC_AIweblab1431263,T1_SF1282.5,2052_QL80_.jpg?aicid=homepage-single-creative-card 1.5x,\r\n"
					+ "              https://m.media-amazon.com/images/I/71yraral-hL._AC_AIweblab1431263,T1_SF1710,2736_QL80_.jpg?aicid=homepage-single-creative-card 2x\" alt=\"The end of summer sale\" class=\"a-amazon-image _single-creative-card_style_image__kEmO2\">");
		
		try {
			BufferedImage image =ImageIO.read(url);
			ImageIO.write(image, "jpg",new File("./images/handbags.jpg" ));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		} catch (MalformedURLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
